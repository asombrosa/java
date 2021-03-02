package ds.graphs;

public class Runner {
    public static void main(String[] args) {
        Graph g = new Graph(10);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,3);
        g.addEdge(0,4);
        g.addEdge(1,4);
        g.addEdge(3,4);
        g.addEdge(2,4);
        g.addEdge(4,4);
        g.print();

    }
}
