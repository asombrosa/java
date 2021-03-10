package ds.graphs.undirectedgraph;

public class Graph {
    int vertices;
    Bag<Integer>[] adj;

    public Graph(int vertices) {
        this.vertices = vertices;
        adj = new Bag[vertices];
        for (int i = 0; i < vertices; i++) {
            adj[i] = new Bag<>();
        }
    }

    public void addEdge(int vertexOne, int vertexTwo) {
        adj[vertexOne].add(vertexTwo);
        adj[vertexTwo].add(vertexOne);
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    public int getVertices() {
        return vertices;
    }

    public void print() {
        for (int vertex = 0; vertex < 10; vertex++) {
            for (int connectedVertex : adj(vertex)) {
                System.out.println(vertex + " " + connectedVertex);
            }
        }
    }
}
