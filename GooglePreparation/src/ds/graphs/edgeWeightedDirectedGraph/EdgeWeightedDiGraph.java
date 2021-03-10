package ds.graphs.edgeWeightedDirectedGraph;

import ds.graphs.undirectedgraph.Bag;

public class EdgeWeightedDiGraph {
    Bag<DirectedEdge>[] arr;
    int vertices;

    public EdgeWeightedDiGraph(int v) {
        arr = new Bag[v];
        vertices = v;
        for (int i = 0; i < v; i++) {
            arr[i] = new Bag<>();
        }
    }

    public int getVertices() {
        return vertices;
    }

    public void addEdge(DirectedEdge e) {
        int v = e.from();
        arr[v].add(e);
    }

    public Iterable<DirectedEdge> adj(int v) {
        return arr[v];
    }

    public void print() {
        for (int i = 0; i < vertices; i++) {
            for (DirectedEdge w : adj(i)) {
                System.out.println(w);
            }
        }
    }
}
