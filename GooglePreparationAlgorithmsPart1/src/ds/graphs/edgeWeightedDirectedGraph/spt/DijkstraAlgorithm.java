package ds.graphs.edgeWeightedDirectedGraph.spt;

import ds.graphs.edgeWeightedDirectedGraph.DirectedEdge;
import ds.graphs.edgeWeightedDirectedGraph.EdgeWeightedDiGraph;

import java.util.PriorityQueue;

public class DijkstraAlgorithm extends SPT {
    private PriorityQueue<Integer> pq;

    DijkstraAlgorithm(EdgeWeightedDiGraph graph, int s) {
        super(graph.getVertices());
        pq = new PriorityQueue<>(graph.getVertices());

        for (int i = 0; i < graph.getVertices(); i++) {
            distTo[i] = Double.POSITIVE_INFINITY;
        }
        distTo[s] = 0.0;

        pq.add(s);
        while (!pq.isEmpty()) {
            int v = pq.poll();
            for (DirectedEdge e : graph.adj(v)) {
                relax(e);
            }
        }
    }

    public void relax(DirectedEdge e) {
        int v = e.from();
        int w = e.to();
        double newCalculatedDistance = distTo[v] + e.getWeight();
        if (distTo[w] > newCalculatedDistance) {
            distTo[w] = newCalculatedDistance;
            edgeTo[w] = e;
            pq.add(w);
        }
    }
}
