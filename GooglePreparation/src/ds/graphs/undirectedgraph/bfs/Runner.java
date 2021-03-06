package ds.graphs.undirectedgraph.bfs;

import ds.graphs.undirectedgraph.Graph;

public class Runner {
    public static void main(String[] args) {
        Graph g = new Graph(10);
        g.addEdge(0, 5);
        g.addEdge(2, 4);
        g.addEdge(2, 3);
        g.addEdge(1, 2);
        g.addEdge(0, 1);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(0, 2);
        g.print();
        BreadthFirstSearchPaths bfs = new BreadthFirstSearchPaths(g, 0);
    }
}
