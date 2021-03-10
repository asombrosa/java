package ds.graphs.edgeWeightedGraph.mst.kruskalAlgorithm;

import ds.graphs.edgeWeightedGraph.Edge;
import ds.graphs.edgeWeightedGraph.EdgeWeightedGraph;
import ds.graphs.edgeWeightedGraph.mst.MST;
import unionFind.quickFind.QuickFindUF;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*
1. Sort the edges by weight
2. Pick each edge one by one unless it creates a cycle

Use union find technique to check if two vertices are connected
If not connected, connect them and add them to queue

We use priority Queue to sort the edges according to weight

Time complexity : O(V log V)
 */
public class KruskalsAlgorithm implements MST {
    Queue<Edge> mst = new LinkedList<>();

    KruskalsAlgorithm(EdgeWeightedGraph graph) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        for (int i = 0; i < graph.getVertices(); i++) {
            for (Edge e : graph.adj(i)) {
                pq.add(e);
            }
        }

        QuickFindUF uf = new QuickFindUF(graph.getVertices());
        while (!pq.isEmpty() && mst.size() < graph.getVertices() - 1) {
            Edge e = pq.poll();
            int v = e.either();
            int w = e.other(v);
            if (!uf.connected(v, w)) {
                uf.union(v, w);
                mst.add(e);
            }
        }
    }

    @Override
    public Iterable<Edge> edges() {
        return mst;
    }

    @Override
    public double weight() {
        return 0;
    }
}
