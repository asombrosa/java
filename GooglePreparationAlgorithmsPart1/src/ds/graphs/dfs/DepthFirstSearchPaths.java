package ds.graphs.dfs;

import ds.graphs.Graph;

import java.util.Stack;

public class DepthFirstSearchPaths {
    boolean[] isMarked;
    int[] edgeTo;
    int source;

    DepthFirstSearchPaths(Graph g, int s) {
        int vertices = g.getVertices();
        isMarked = new boolean[vertices];
        edgeTo = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            edgeTo[i] = -1;
        }
        source = s;
        dfs(g, s);
    }

    public void dfs(Graph g, int s) {
        isMarked[s] = true;
        for (int w : g.adj(s)) {
            if (!isMarked[w]) {
                dfs(g, w);
                edgeTo[w] = s;
            }
        }
    }

    public boolean hasPathTo(int v) {
        return isMarked[v];
    }

    public Iterable<Integer> pathTo(int v) {
        if (!hasPathTo(v)) {
            return null;
        }
        Stack<Integer> path = new Stack<>();
        for (int x = v; x != source; x = edgeTo[x]) {
            path.push(x);
        }
        path.push(source);
        return path;
    }
}
