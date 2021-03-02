package ds.directed.graph.topologicalSort;

import ds.directed.graph.DirectedGraph;

import java.util.Stack;

public class TopologicalOrder {
    boolean[] marked;
    Stack<Integer> stack;

    TopologicalOrder(DirectedGraph graph) {
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
