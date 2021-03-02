package ds.directed.graph.strongComponents;

import ds.directed.graph.DirectedGraph;
import ds.graphs.Graph;
import ds.graphs.connectedComponents.ConnectedComponents;

public class Runner {
    public static void main(String[] args) {
        DirectedGraph g = new DirectedGraph(13);
        g.addEdge(4, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 2);
        g.addEdge(6, 0);
        g.addEdge(0, 1);
        g.addEdge(2, 0);
        g.addEdge(12,9);
        g.addEdge(9, 10);
        g.addEdge(9, 11);
        g.addEdge(7, 9);
        g.addEdge(10, 12);
        g.addEdge(11, 4);
        g.addEdge(4, 3);
        g.addEdge(3, 5);
        g.addEdge(5, 4);
        g.addEdge(0, 5);
        g.addEdge(6, 4);
        g.addEdge(6, 9);
        g.addEdge(7, 6);

         //g.print();
        KosarajuSharirSCC dfs = new KosarajuSharirSCC(g);

    }
}
