package ds.graphs.edgeWeightedGraph.mst.kruskalAlgorithm;

import ds.graphs.edgeWeightedGraph.Edge;
import ds.graphs.edgeWeightedGraph.EdgeWeightedGraph;
import ds.graphs.edgeWeightedGraph.mst.MST;
import unionFind.quickFind.QuickFindUF;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class KruskalsAlgorithm implements MST {
    Queue<Edge> mst = new LinkedList<>();

    KruskalsAlgorithm(EdgeWeightedGraph graph) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        for (int i = 0; i < graph.getVertices(); i++) {
            for (Edge e : graph.adj(i)) {
                pq.add(e);
                System.out.println("inner");
            }
            System.out.println("outer");
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
