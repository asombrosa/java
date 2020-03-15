package com.graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class DFS {
	
	void dfs(int s, Graph g) {
		boolean visited[] = new boolean[g.V];
		dfsUtil(s,g,visited);
	}

	private void dfsUtil(int s, Graph g, boolean[] visited) {

		visited[s] =true;
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(s);
		while(!queue.isEmpty()) {
			int v = queue.poll();
			System.out.print(v + " ");
			
			Iterator<Integer> i = g.adj[s].listIterator();
			while(i.hasNext()) {
				int val = i.next();
				if(!visited[val]) {
					dfsUtil(val, g, visited);
				}
			}
		}
	}

}
