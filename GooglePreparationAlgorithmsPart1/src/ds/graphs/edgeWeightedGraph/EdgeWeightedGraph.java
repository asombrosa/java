package ds.graphs.edgeWeightedGraph;

import ds.graphs.undirectedgraph.Bag;


public class EdgeWeightedGraph {
    Bag<Edge>[] arr;
    int vertices;

    public EdgeWeightedGraph(int vertices) {
        arr = new Bag[vertices];
        this.vertices = vertices;
        for (int i = 0; i < vertices; i++) {
            arr[i] = new Bag<>();
        }
    }

    public int getVertices() {
        return vertices;
    }

    public void addEdge(Edge edge) {
        int vertex = edge.either();
        int otherVertex = edge.other(vertex);
        arr[vertex].add(edge);
        arr[otherVertex].add(edge);
    }

    public Iterable<Edge> adj(int vertex) {
        return arr[vertex];
    }

    public void print() {
        for (int vertex = 0; vertex < vertices; vertex++) {
            for (Edge edge : adj(vertex)) {
                System.out.println(edge);
            }
        }
    }
}