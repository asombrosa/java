package ds.graphs.directedgraph.strongComponents;

import ds.graphs.directedgraph.DirectedGraph;
import ds.graphs.directedgraph.topologicalSort.TopologicalOrder;

/*
Run dfs on all vertices in topological order
 */
public class KosarajuSharirSCC {
    boolean[] marked;
    int count;
    int[] scc;

    KosarajuSharirSCC(DirectedGraph graph) {
        marked = new boolean[graph.getVertices()];
        scc = new int[graph.getVertices()];
        TopologicalOrder topologicalOrder = new TopologicalOrder(graph);
        for(int v : topologicalOrder.get()) {
            if(!marked[v]) {
                dfs(graph,v);
                count++;
            }
        }
    }

    public void dfs(DirectedGraph graph, int v) {
        marked[v] = true;
        scc[v] = count;
        System.out.println(v + " " + scc[v]);
        for(int w : graph.adj(v)) {
            if(!marked[w]) {
                dfs(graph, w);
            }
        }
    }

    public boolean stronglyConnected(int v, int w) {
        return scc[v] == scc[w];
    }
}
