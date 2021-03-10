package ds.graphs.edgeWeightedDirectedGraph.spt;

import ds.graphs.edgeWeightedDirectedGraph.DirectedEdge;
import ds.graphs.edgeWeightedDirectedGraph.EdgeWeightedDiGraph;

import java.util.PriorityQueue;

/*
1. Initialize all distances to positive infinity
2. pick an edge put it in priority queue
3. poll it,
4. then relax all the adjacent edges and repeat
 */
public class DijkstraAlgorithm extends SPT {
    private final PriorityQueue<Integer> pq;

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
