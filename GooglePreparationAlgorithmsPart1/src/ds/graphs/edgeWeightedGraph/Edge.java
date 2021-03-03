package ds.graphs.edgeWeightedGraph;

public class Edge implements Comparable<Edge> {
    private int v;
    private int w;
    private double weight;

    public Edge(int v, int w, double weight) {
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    public int compareTo(Edge edge) {
        if (this.weight < edge.weight) {
            return -1;
        } else if (this.weight > edge.weight) {
            return 1;
        }
        return 0;
    }

    public int either() {
        return v;
    }

    public int other(int v) {
        if (v == this.v) {
            return w;
        }
        return this.v;
    }

    public String toString() {
        return v + " ---- " + weight + " ---- " + w;
    }
}
