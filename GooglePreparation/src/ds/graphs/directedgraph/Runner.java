package ds.graphs.directedgraph;

public class Runner {
    public static void main(String[] args) {
        DirectedGraph g = new DirectedGraph(10);
        g.addEdge(0,5);
        g.addEdge(0,1);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,5);
        g.addEdge(3,2);
        g.addEdge(4,3);
        g.addEdge(4,2);
        g.addEdge(5,4);
        g.print();

    }
}
