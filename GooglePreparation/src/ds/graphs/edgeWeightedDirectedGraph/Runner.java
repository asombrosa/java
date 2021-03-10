package ds.graphs.edgeWeightedDirectedGraph;

public class Runner {
    public static void main(String[] args) {
        EdgeWeightedDiGraph edgeWeightedDiGraph = new EdgeWeightedDiGraph(12);
        edgeWeightedDiGraph.addEdge(new DirectedEdge(4, 5, 0.35));
        edgeWeightedDiGraph.addEdge(new DirectedEdge(4, 7, 0.37));
        edgeWeightedDiGraph.addEdge(new DirectedEdge(5, 7, 0.28));
        edgeWeightedDiGraph.addEdge(new DirectedEdge(0, 7, 0.16));
        edgeWeightedDiGraph.addEdge(new DirectedEdge(1, 5, 0.32));
        edgeWeightedDiGraph.addEdge(new DirectedEdge(0, 4, 0.38));
        edgeWeightedDiGraph.addEdge(new DirectedEdge(2, 3, 0.17));
        edgeWeightedDiGraph.addEdge(new DirectedEdge(1, 7, 0.19));
        edgeWeightedDiGraph.addEdge(new DirectedEdge(0, 2, 0.26));
        edgeWeightedDiGraph.addEdge(new DirectedEdge(1, 2, 0.36));
        edgeWeightedDiGraph.addEdge(new DirectedEdge(1, 3, 0.29));
        edgeWeightedDiGraph.addEdge(new DirectedEdge(2, 7, 0.34));
        edgeWeightedDiGraph.addEdge(new DirectedEdge(6, 2, 0.40));
        edgeWeightedDiGraph.addEdge(new DirectedEdge(3, 6, 0.52));
        edgeWeightedDiGraph.addEdge(new DirectedEdge(6, 0, 0.58));
        edgeWeightedDiGraph.addEdge(new DirectedEdge(6, 4, 0.93));
        edgeWeightedDiGraph.print();
    }
}
