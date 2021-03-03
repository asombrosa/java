package ds.graphs.edgeWeightedGraph.mst.kruskalAlgorithm;

import ds.graphs.edgeWeightedGraph.Edge;
import ds.graphs.edgeWeightedGraph.EdgeWeightedGraph;
import ds.graphs.edgeWeightedGraph.mst.MST;

public class Runner {
    public static void main(String[] args) {
        EdgeWeightedGraph edgeWeightedGraph = new EdgeWeightedGraph(12);
        edgeWeightedGraph.addEdge(new Edge(4, 5, 0.35));
        edgeWeightedGraph.addEdge(new Edge(4, 7, 0.37));
        edgeWeightedGraph.addEdge(new Edge(5, 7, 0.28));
        edgeWeightedGraph.addEdge(new Edge(0, 7, 0.16));
        edgeWeightedGraph.addEdge(new Edge(1, 5, 0.32));
        edgeWeightedGraph.addEdge(new Edge(0, 4, 0.38));
        edgeWeightedGraph.addEdge(new Edge(2, 3, 0.17));
        edgeWeightedGraph.addEdge(new Edge(1, 7, 0.19));
        edgeWeightedGraph.addEdge(new Edge(0, 2, 0.26));
        edgeWeightedGraph.addEdge(new Edge(1, 2, 0.36));
        edgeWeightedGraph.addEdge(new Edge(1, 3, 0.29));
        edgeWeightedGraph.addEdge(new Edge(2, 7, 0.34));
        edgeWeightedGraph.addEdge(new Edge(6, 2, 0.40));
        edgeWeightedGraph.addEdge(new Edge(3, 6, 0.52));
        edgeWeightedGraph.addEdge(new Edge(6, 0, 0.58));
        edgeWeightedGraph.addEdge(new Edge(6, 4, 0.93));
        //edgeWeightedGraph.print();
        MST mst = new KruskalsAlgorithm(edgeWeightedGraph);
        mst.edges().forEach(System.out::println);
    }
}
