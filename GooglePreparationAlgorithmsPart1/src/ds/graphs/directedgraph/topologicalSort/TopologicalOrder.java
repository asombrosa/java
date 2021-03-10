package ds.graphs.directedgraph.topologicalSort;

import ds.graphs.directedgraph.DirectedGraph;

import java.util.Stack;
/*
For acyclic graph, point all vertices in same direction

Applications :
Precedence scheduling (You can start course 5, only after you finish courses 1 to 4)
Java compiler does cycle detection (A extends B, B extends C, C extends A)
Microsoft excel does cyclic detection
 */
public class TopologicalOrder {
    boolean[] marked;
    Stack<Integer> stack;

    public TopologicalOrder(DirectedGraph graph) {
        stack = new Stack<>();
        marked = new boolean[graph.getVertices()];
        for (int i = 0; i < graph.getVertices(); i++) {
            if (!marked[i]) {
                dfs(graph, i);
            }
        }
    }

    public void dfs(DirectedGraph directedGraph, int s) {
        marked[s] = true;
        for (int w : directedGraph.adj(s)) {
            if (!marked[w]) {
                dfs(directedGraph, w);
            }
        }
        stack.push(s);
    }

    public Iterable<Integer> get() {
        return stack;
    }
}
