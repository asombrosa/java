package ds.directed.graph.topologicalSort;

import ds.directed.graph.DirectedGraph;

public class Runner {
    public static void main(String[] args) {
        DirectedGraph g = new DirectedGraph(7);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,5);
        g.addEdge(3,2);
        g.addEdge(3,4);
        g.addEdge(3,5);
        g.addEdge(3,6);
        g.addEdge(5,2);
        g.addEdge(6,0);
        g.addEdge(6,4);
        g.addEdge(1,4);
        g.print();
        TopologicalOrder topologicalOrder = new TopologicalOrder(g);
        Iterable<Integer> i = topologicalOrder.get();
        i.forEach(System.out::println);
    }
}
