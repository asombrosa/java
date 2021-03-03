package ds.graphs.undirectedgraph.bfs;

import ds.graphs.undirectedgraph.Graph;

import java.util.LinkedList;
import java.util.Queue;


public class BreadthFirstSearchPaths {
    private boolean[] marked;
    private int[] edgeTo;
    int source;

    BreadthFirstSearchPaths(Graph g, int s) {
        this.source = s;
        int v = g.getVertices();
        edgeTo = new int[v];
        for (int i = 0; i < v; i++) {
            edgeTo[i] = -1;
        }
        marked = new boolean[v];
        bfs(g, s);
    }

    private void bfs(Graph g, int s) {
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        marked[s] = true;
        while (!q.isEmpty()) {
            int v = q.poll();
            System.out.print(v + " ");
            for (int w : g.adj(v)) {
                if (!marked[w]) {
                    q.add(w);
                    marked[w] = true;
                    edgeTo[w] = v;
                }
            }
        }

    }
}
