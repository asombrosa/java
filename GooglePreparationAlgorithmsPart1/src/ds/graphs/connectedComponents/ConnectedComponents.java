package ds.graphs.connectedComponents;

import ds.graphs.Graph;

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

    public void dfs(Graph g, int v) {
        marked[v] = true;
        id[v] = count;
        System.out.println(v + " " + id(v));
        for (int w : g.adj(v)) {
            if (!marked[w]) {
                dfs(g, w);

            }
        }
    }


}
