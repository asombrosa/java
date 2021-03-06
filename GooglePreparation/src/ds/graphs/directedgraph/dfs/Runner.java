package ds.graphs.directedgraph.dfs;

import ds.graphs.directedgraph.DirectedGraph;

public class Runner {
    public static void main(String[] args) {
        DirectedGraph g = new DirectedGraph(100);
        g.addEdge(4,2);
        g.addEdge(2,3);
        g.addEdge(3,2);
        g.addEdge(6,0);
        g.addEdge(0,1);
        g.addEdge(2,0);
        g.addEdge(11,12);
        g.addEdge(12,9);
        g.addEdge(9,10);
        g.addEdge(9,11);
        g.addEdge(8,9);
        g.addEdge(10,12);
        g.addEdge(11,4);
        g.addEdge(4,3);
        g.addEdge(3,5);
        g.addEdge(6,8);
        g.addEdge(8,6);
        g.addEdge(5,4);
        g.addEdge(0,5);
        g.addEdge(6,4);
        g.addEdge(6,9);
        g.addEdge(7,6);
        //g.print();
        DirectedGraphDfs dfs = new DirectedGraphDfs(g, 0);
        Iterable<Integer> iterable = dfs.pathTo(2);
        iterable.forEach(System.out::println);
    }
}
