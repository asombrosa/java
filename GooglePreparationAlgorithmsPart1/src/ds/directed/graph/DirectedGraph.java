package ds.directed.graph;

import ds.graphs.Bag;

public class DirectedGraph {
    Bag<Integer>[] adj;
    int v;

    public DirectedGraph(int v) {
        this.v = v;
        adj = new Bag[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new Bag<>();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    public int getVertices() {
        return v;
    }

    public void print() {
        for (int v = 0; v < 10; v++) {
            for (int w : adj(v)) {
                System.out.println(v + " => " + w);
            }
        }
    }
}
