package ds.graphs.edgeWeightedGraph.mst;

import ds.graphs.edgeWeightedGraph.Edge;

public interface MST {

    Iterable<Edge> edges();

    double weight();
}
