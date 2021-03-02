package ds.directed.graph.bfs;

import ds.directed.graph.DirectedGraph;

public class Runner {
    public static void main(String[] args) {
        DirectedGraph g = new DirectedGraph(10);
        g.addEdge(5, 0);
        g.addEdge(0, 2);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 4);
        g.addEdge(3, 2);
        g.addEdge(4, 3);
        g.addEdge(3, 5);
        g.print();
        DirectedGraphBreadthFirstSearchPaths dfs = new DirectedGraphBreadthFirstSearchPaths(g, 0);

    }
}
