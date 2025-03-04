package main.java.LeetCode.Medium;

import main.java.LeetCode.Util.Graph;
import main.java.LeetCode.Util.Node;

import java.util.*;

public class CloneGraphUsingRecursion133 {
    Map<Node, Node> map = new HashMap<>();

    public Node cloneGraph(Node node){
        if(node == null) return null;

        Node curr = new Node(node.val);
        map.put(node, curr);

        for(Node cloneNode : node.neighbors) {
            if(!map.containsKey(cloneNode))
                cloneGraph(cloneNode);

            curr.neighbors.add(map.get(cloneNode));
        }
    return curr;

    }

    public static void main(String[] args) {
        List<List<Integer>> adjList = new ArrayList<>();
        Graph graph = new Graph();
        CloneGraphUsingRecursion133 cloneGraph = new CloneGraphUsingRecursion133();

        adjList.add(Arrays.asList(2, 4));
        adjList.add(Arrays.asList(1, 3));
        adjList.add(Arrays.asList(2, 4));
        adjList.add(Arrays.asList(1, 3));

        // Create the graph
        Node originalGraph = graph.createGraph(adjList);

        // Clone the graph
        Node clonedGraph = cloneGraph.cloneGraph(originalGraph);
        System.out.println(" clonedGraph  "+ clonedGraph);
    }
}
