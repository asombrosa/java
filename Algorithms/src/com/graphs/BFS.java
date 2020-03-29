package com.graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
/*
 * 
 * https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
 * (similar to BFS of a tree(level order)) => traversing level by level
 * 
 */
public class BFS {

	void bfs(int s, Graph g) {
		boolean visited[] = new boolean[g.V];
		
		Queue<Integer> queue = new LinkedList<Integer>();
		visited[s] = true;
		queue.add(s);
		
		while(!queue.isEmpty()) {
			int v = queue.poll();
			System.out.print(v + " ");
			
			Iterator<Integer> i = g.adj[v].listIterator();
			
			while(i.hasNext()) {
				int val = i.next();
				if(!visited[val]) {
					visited[val]=true;
					queue.add(val);
				}
			}
		}
	}
}
