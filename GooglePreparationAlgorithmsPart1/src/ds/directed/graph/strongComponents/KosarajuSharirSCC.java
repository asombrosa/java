package ds.directed.graph.strongComponents;

import ds.directed.graph.DirectedGraph;
import ds.directed.graph.topologicalSort.TopologicalOrder;

import javax.security.auth.kerberos.KerberosPrincipal;

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
