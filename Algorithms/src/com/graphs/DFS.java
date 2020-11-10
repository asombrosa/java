package com.graphs;

import java.util.LinkedList;
import java.util.Queue;

/*
 *
 * https://www.geeksforgeeks.org/depth-first-search-or-dfs-for-a-graph/?ref=lbp
 * (similar to DFS of a node(preorder, inorder, postorder)) => traversing to one side of the graph till one end
 *
 */
public class DFS {

    void dfs(int startingIndex, Graph graph) {
        boolean[] visited = new boolean[graph.value];
        dfsUtil(startingIndex, graph, visited);
    }

    private void dfsUtil(int startingIndex, Graph graph, boolean[] visited) {
        visited[startingIndex] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startingIndex);
        while (!queue.isEmpty()) {
            int polledValue = queue.poll();
            System.out.print(polledValue + " ");
            for (int adjacentValue : graph.adj[startingIndex]) {
                if (!visited[adjacentValue]) {
                    dfsUtil(adjacentValue, graph, visited);
                }
            }
        }
    }
}