package main.java.LeetCode.Medium;

import main.java.LeetCode.Util.Graph;
import main.java.LeetCode.Util.Node;
import java.util.*;

public class CloneGraph133 {

    // Clone method using DFS
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        // HashMap to keep track of already visited nodes
        Map<Node, Node> visited = new HashMap<>();

        // Start DFS to clone the graph
        return dfs(node, visited);
    }

    private Node dfs(Node node, Map<Node, Node> visited) {
        if (visited.containsKey(node)) {
            return visited.get(node);
        }

        // Create a new node for the current node
        Node newNode = new Node(node.val);
        visited.put(node, newNode);

        // Recurse for each neighbor of the current node
        for (Node neighbor : node.neighbors) {
            newNode.neighbors.add(dfs(neighbor, visited));
        }

        return newNode;
    }

    public static void main(String[] args) {
        List<List<Integer>> adjList = new ArrayList<>();
        Graph graph = new Graph();
        CloneGraph133 cloneGraph = new CloneGraph133();

        adjList.add(Arrays.asList(2, 4));
        adjList.add(Arrays.asList(1, 3));
        adjList.add(Arrays.asList(2, 4));
        adjList.add(Arrays.asList(1, 3));

        // Create the graph
        Node originalGraph = graph.createGraph(adjList);

        // Clone the graph
        Node clonedGraph = cloneGraph.cloneGraph(originalGraph);
        System.out.println("");
        //System.out.println(clonedGraph.toString());

    }
}
