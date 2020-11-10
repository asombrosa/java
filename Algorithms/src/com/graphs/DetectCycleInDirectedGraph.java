package com.graphs;

import java.util.List;

/*
 * Given a directed graph, check whether the graph contains a cycle or not.
 * Your function should return true if the given graph contains at least one cycle,
 * else return false. For example, the following graph contains three cycles
 * 0->2->0, 0->1->2->0 and 3->3, so your function must return true.
 *
 * https://www.geeksforgeeks.org/detect-cycle-in-a-graph/
 *
 */
public class DetectCycleInDirectedGraph {

    boolean isCyclic(int startingIndex, Graph graph) {
        boolean[] visited = new boolean[graph.value];
        for (int index = 0; index < graph.value; index++)
            if (isCyclicUtil(index, visited, graph))
                return true;
        return false;
    }

    private boolean isCyclicUtil(int index, boolean[] visited, Graph graph) {
        if (visited[index])
            return true;
        visited[index] = true;
        List<Integer> list = graph.adj[index];
        for (Integer adjacentValue : list) {
            if (isCyclicUtil(adjacentValue, visited, graph))
                return true;
        }
        visited[index] = false;
        return false;
    }
}