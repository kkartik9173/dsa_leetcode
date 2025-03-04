package main.java.LeetCode.Util;

import java.util.List;

public class Graph {

    //Helper method to create the graph from the adjacency list
    public Node createGraph(List<List<Integer>> adjList) {
        // Create all nodes
        Node[] nodes = new Node[adjList.size()];
        for (int i = 0; i < adjList.size(); i++) {
            nodes[i] = new Node(i + 1);  // Nodes are 1-indexed
        }

        // Build the graph using the adjacency list
        for (int i = 0; i < adjList.size(); i++) {
            for (int neighbor : adjList.get(i)) {
                nodes[i].neighbors.add(nodes[neighbor - 1]);  // Adjusting for 1-indexed values
            }
        }

        // Return the first node (usually the starting point for graph traversal)
        return nodes[0];
    }
}
