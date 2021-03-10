package ds.graphs.undirectedgraph.connectedComponents;

import ds.graphs.undirectedgraph.Graph;

/*
All connected components will have the same id
 */
public class ConnectedComponents {
    boolean[] marked;
    int count;
    int[] id;

    ConnectedComponents(Graph g) {
        int vertices = g.getVertices();
        id = new int[vertices];
        marked = new boolean[vertices];

        for (int v = 0; v < vertices; v++) {
            if (!marked[v]) {
                dfs(g, v);
                count++;
            }
        }
    }

    public int count() {
        return count;
    }

    public int id(int v) {
        return id[v];
    }

    public void dfs(Graph graph, int currentVertex) {
        marked[currentVertex] = true;
        id[currentVertex] = count;
        System.out.println(currentVertex + " " + id(currentVertex));
        for (int connectedVertex : graph.adj(currentVertex)) {
            if (!marked[connectedVertex]) {
                dfs(graph, connectedVertex);
            }
        }
    }
}