package com.graphs;

import java.util.LinkedList;
import java.util.Queue;

/*
 *
 * https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
 * (similar to BFS of a node(level order)) => traversing level by level
 *
 */
public class BFS {

    void bfs(int startingIndex, Graph graph) {
        boolean[] visited = new boolean[graph.value];
        Queue<Integer> queue = new LinkedList<>();
        visited[startingIndex] = true;
        queue.add(startingIndex);
        while (!queue.isEmpty()) {
            int polledValue = queue.poll();
            System.out.print(polledValue + " ");
            for (int adjacentValue : graph.adj[polledValue]) {
                if (!visited[adjacentValue]) {
                    visited[adjacentValue] = true;
                    queue.add(adjacentValue);
                }
            }
        }
    }
}