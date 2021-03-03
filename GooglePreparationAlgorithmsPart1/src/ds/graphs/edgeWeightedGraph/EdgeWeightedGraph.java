package ds.graphs.edgeWeightedGraph;

import ds.graphs.undirectedgraph.Bag;

import java.util.Arrays;

public class EdgeWeightedGraph {
    Bag<Edge>[] arr;
    int vertices;

    public EdgeWeightedGraph(int v) {
        arr = new Bag[v];
        for (int i = 0; i < v; i++) {
            arr[i] = new Bag<>();
        }
    }

    public int getVertices() {
        return vertices / 2;
    }

    public void addEdge(Edge e) {
        int v = e.either();
        int w = e.other(v);
        arr[v].add(e);
        // arr[w].add(e);
        vertices++;
    }

    public Iterable<Edge> adj(int v) {
        return arr[v];
    }

    public void print() {
        for (int i = 0; i < vertices; i++) {
            for (Edge w : adj(i)) {
                System.out.println(w);
            }
        }
    }
}
