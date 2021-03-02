package ds.graphs.dfs;

import ds.graphs.Graph;

public class Runner {
    public static void main(String[] args) {
        Graph g = new Graph(10);
        g.addEdge(0, 6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 5);
        g.addEdge(6, 4);
        g.addEdge(4, 3);
        g.addEdge(4, 5);
        g.addEdge(5, 3);
        g.print();
        DepthFirstSearchPaths dfs = new DepthFirstSearchPaths(g, 0);
        Iterable<Integer> iterable = dfs.pathTo(5);
        iterable.forEach(System.out::println);
    }
}
