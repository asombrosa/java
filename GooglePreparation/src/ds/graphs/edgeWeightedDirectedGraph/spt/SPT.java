package ds.graphs.edgeWeightedDirectedGraph.spt;
import java.util.Stack;
import ds.graphs.edgeWeightedDirectedGraph.DirectedEdge;

public class SPT {
    double distTo[];
    DirectedEdge edgeTo[];

    public SPT(int v) {
        distTo = new double[v];
        edgeTo = new DirectedEdge[v];
    }

    public double distTo(int v) {
        return distTo[v];
    }

    public Iterable<DirectedEdge> pathTo(int v) {
        Stack<DirectedEdge> stack = new Stack<>();
        for (DirectedEdge e = edgeTo[v]; e != null; e = edgeTo[e.from()]) {
            stack.push(e);
        }
        return stack;
    }

    public void relax(DirectedEdge e) {
        int v = e.from();
        int w = e.to();
        double newCalculatedDistance = distTo[v] + e.getWeight();
        if(distTo[w] > newCalculatedDistance) {
            distTo[w] = newCalculatedDistance;
            edgeTo[w] = e;
        }
    }
}
