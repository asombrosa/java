package ds.graphs;

public class Graph {
    int vertices;
    Bag<Integer>[] adj;

    public Graph(int vertices) {
        this.vertices = vertices;
        adj = (Bag<Integer>[]) new Bag[vertices];
        for (int i = 0; i < vertices; i++) {
            adj[i] = new Bag<>();
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    public void print() {
        for (int v = 0; v < 10; v++) {
            for (int w : adj(v)) {
                System.out.println(v + " " + w);
            }
        }
    }
}
