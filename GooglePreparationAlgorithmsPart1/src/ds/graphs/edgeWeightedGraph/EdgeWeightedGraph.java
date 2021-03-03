package ds.graphs.edgeWeightedGraph;

import ds.graphs.undirectedgraph.Bag;

public class EdgeWeightedGraph {
    Bag<Edge>[] arr;
    int vertices;

    EdgeWeightedGraph(int v) {
        arr = new Bag[v];
        this.vertices = v;
        for (int i = 0; i < v; i++) {
            arr[i] = new Bag<>();
        }
    }

    void addEdge(Edge e) {
        int v = e.either();
        int w = e.other(v);
        arr[v].add(e);
        arr[w].add(e);
    }

    public Iterable<Edge> adj(int v) {
        return arr[v];
    }

    void print(){
        for(int i=0;i<vertices;i++) {
            for(Edge w : adj(i)) {
                System.out.println(w);
            }
        }
    }
}
