package com.graphs;

import java.util.LinkedList;

/*
 *
 * Adjacency Linked List
 *
 */
public class Graph {

    int value;
    LinkedList<Integer> adj[];

    Graph(int value) {
        this.value = value;
        adj = new LinkedList[value];
        for (int index = 0; index < value; index++) {
            adj[index] = new LinkedList<Integer>();
        }
    }

    void addEdge(int source, int destination) {
        adj[source].add(destination);
    }
}
