package ds.graphs.directedgraph.topologicalSort;

import ds.graphs.directedgraph.DirectedGraph;

import java.util.Stack;

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