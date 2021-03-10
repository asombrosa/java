package ds.graphs.edgeWeightedDirectedGraph;

public class DirectedEdge implements Comparable<DirectedEdge> {
    private int v;
    private int w;
    private double weight;

    public DirectedEdge(int v, int w, double weight) {
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    public int compareTo(DirectedEdge directedEdge) {
        if (this.weight < directedEdge.weight) {
            return -1;
        } else if (this.weight > directedEdge.weight) {
            return 1;
        }
        return 0;
    }

    public int from() {
        return v;
    }

    public int to() {
        return w;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return v + " ---- " + weight + " ---- " + w;
    }
}
