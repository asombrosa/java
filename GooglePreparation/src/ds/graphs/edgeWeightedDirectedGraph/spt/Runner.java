package ds.graphs.edgeWeightedDirectedGraph.spt;

import ds.graphs.edgeWeightedDirectedGraph.DirectedEdge;
import ds.graphs.edgeWeightedDirectedGraph.EdgeWeightedDiGraph;

public class Runner {
    public static void main(String[] args) {
        EdgeWeightedDiGraph edgeWeightedDiGraph = new EdgeWeightedDiGraph(12);
        edgeWeightedDiGraph.addEdge(new DirectedEdge(0, 1, 5.0));
        edgeWeightedDiGraph.addEdge(new DirectedEdge(0, 4, 9.0));
        edgeWeightedDiGraph.addEdge(new DirectedEdge(0, 7, 8.0));
        edgeWeightedDiGraph.addEdge(new DirectedEdge(1, 2, 12.0));
        edgeWeightedDiGraph.addEdge(new DirectedEdge(1, 3, 15.0));
        edgeWeightedDiGraph.addEdge(new DirectedEdge(1, 7, 4.0));
        edgeWeightedDiGraph.addEdge(new DirectedEdge(2, 3, 3.0));
        edgeWeightedDiGraph.addEdge(new DirectedEdge(2, 6, 11.0));
        edgeWeightedDiGraph.addEdge(new DirectedEdge(3, 6, 9.0));
        edgeWeightedDiGraph.addEdge(new DirectedEdge(4, 5, 4.0));
        edgeWeightedDiGraph.addEdge(new DirectedEdge(4, 6, 20.0));
        edgeWeightedDiGraph.addEdge(new DirectedEdge(4, 7, 5.0));
        edgeWeightedDiGraph.addEdge(new DirectedEdge(5, 2, 1.0));
        edgeWeightedDiGraph.addEdge(new DirectedEdge(5, 6, 13.0));
        edgeWeightedDiGraph.addEdge(new DirectedEdge(7, 5, 6.0));
        edgeWeightedDiGraph.addEdge(new DirectedEdge(7, 2, 7.0));
        //edgeWeightedDiGraph.print();
        DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm(edgeWeightedDiGraph, 0);
        System.out.println(dijkstraAlgorithm.distTo(6));
    }
}
