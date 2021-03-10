package ds.graphs.edgeWeightedGraph;

public class Edge implements Comparable<Edge> {
    private final int startVertex;
    private final int endVertex;
    private final double weight;

    public Edge(int startVertex, int endVertex, double weight) {
        this.startVertex = startVertex;
        this.endVertex = endVertex;
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
        return startVertex;
    }

    public int other(int currentVertex) {
        if (currentVertex == this.startVertex) {
            return endVertex;
        }
        return this.startVertex;
    }

    public String toString() {
        return startVertex + " ---- " + weight + " ---- " + endVertex;
    }
}
