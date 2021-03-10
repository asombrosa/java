package ds.graphs.undirectedgraph.bfs;

import ds.graphs.undirectedgraph.Graph;

import java.util.LinkedList;
import java.util.Queue;

/*
Steps :
    1. add current vertex to the queue
    2. fetch adjacent vertices
    3. if adjacent vertices are not marked add to queue

Time complexity : O(V + E)
 */
public class BreadthFirstSearchPaths {
    private final boolean[] marked;
    private final int[] edgeTo;
    int source;

    BreadthFirstSearchPaths(Graph graph, int source) {
        this.source = source;
        int vertices = graph.getVertices();
        edgeTo = new int[vertices];
        for (int index = 0; index < vertices; index++) {
            edgeTo[index] = -1;
        }
        marked = new boolean[vertices];
        bfs(graph, source);
    }

    private void bfs(Graph graph, int currentVertex) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(currentVertex);
        marked[currentVertex] = true;
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");
            for (int adjacentVertex : graph.adj(vertex)) {
                if (!marked[adjacentVertex]) {
                    queue.add(adjacentVertex);
                    marked[adjacentVertex] = true;
                    edgeTo[adjacentVertex] = vertex;
                }
            }
        }
    }
}