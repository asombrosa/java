package ds.directed.graph.dfs;

import ds.directed.graph.DirectedGraph;

import java.util.Stack;

public class DirectedGraphDfs {
    boolean[] marked;
    int[] edgeTo;
    int source;

    DirectedGraphDfs(DirectedGraph g, int s) {
        this.source = s;
        edgeTo = new int[g.getVertices()];
        marked = new boolean[g.getVertices()];
        dfs(g,s);
    }

    public void dfs(DirectedGraph g, int v) {
        marked[v] = true;
        for (int w : g.adj(v)) {
            if (!marked[w]) {
                dfs(g, w);
                edgeTo[w] = v;
            }
        }
    }

    public boolean hasPathTo(int v) {
        return marked[v];
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

