package ds.graphs.edgeWeightedGraph.mst.primsAlgorithm.lazyAlgo;

import ds.graphs.edgeWeightedGraph.Edge;
import ds.graphs.edgeWeightedGraph.EdgeWeightedGraph;
import ds.graphs.edgeWeightedGraph.mst.MST;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PrimsLazyAlgorithm implements MST {
    boolean[] marked;
    Queue<Edge> mst = new LinkedList<>();
    Queue<Edge> pq = new PriorityQueue<>();

    PrimsLazyAlgorithm(EdgeWeightedGraph graph) {
        marked = new boolean[graph.getVertices()];
        visit(graph, 0);
        while (!pq.isEmpty()) {
            Edge e = pq.poll();
            int v = e.either();
            int w = e.other(v);
            if (marked[v] && marked[w]) {
                continue;
            }
            mst.add(e);
            if (!marked[v]) {
                visit(graph, v);
            }
            if (!marked[w]) {
                visit(graph, w);
            }
        }
    }

    public void visit(EdgeWeightedGraph graph, int v) {
        marked[v] = true;
        for (Edge e : graph.adj(v)) {
            if (!marked[e.other(v)]) {
                pq.add(e);
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
