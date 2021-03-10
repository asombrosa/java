package ds.tries;

import java.util.LinkedList;
import java.util.Queue;

/*
            s
         /  |
        e   h
      /     |  \
(9) a   (4) e   o  --
            |    \    \
            l     r    w (2)
            |      \
            l (10)  e (5)

Steps:
    1. Insert :
        a) We create a new node if node is null
        b) we check if key has reached its end by comparing length
            i) if yes, the we assign value to the node and return
           ii) if not, we take the character at current index,
               and repeat the process
    2. Search :
        a) if node is null, return null
        b) if current index == length of key,
         if value is not null, then found and return
    3. Delete :
        a) get node for key, and set null
    4. Print :
        a) Iterate over all the nodes R
        b) if value is not null, add the prefix to the result queue
        c) then delete the last character
        d) repeat the process recursively

Time complexity:
    search hit  : L
    search miss : log N
    insert      : L

Challenge : the only challenge with R ways tries is that we need
            to use less memory for Unicode (65536 way tries)
 */
public class RWaysTries<V> {
    private static final int R = 256;
    private Node root = new Node();

    private static class Node {
        private Object value;
        private final Node[] next = new Node[R];
    }

    RWaysTries() {

    }

    public static void main(String[] args) {
        RWaysTries<Integer> rWaysTries = new RWaysTries<>();
        rWaysTries.put("dab", 1);
        rWaysTries.put("add", 2);
        rWaysTries.put("cab", 3);
        rWaysTries.put("fad", 4);
        rWaysTries.put("fee", 5);
        rWaysTries.put("bad", 6);
        rWaysTries.put("b", 7);
        rWaysTries.put("dad", 8);
        rWaysTries.put("bee", 9);
        rWaysTries.put("fed", 10);
        rWaysTries.put("aa", 11);
        rWaysTries.put("bed", 12);
        rWaysTries.put("ebb", 13);
        rWaysTries.put("ace", 14);
        rWaysTries.put("cc", 15);

        System.out.println(rWaysTries.keys());
    }

    public Iterable<String> keys() {
        return keysWithPrefix("");
    }

    public Iterable<String> keysWithPrefix(String prefix) {
        Queue<String> results = new LinkedList<>();
        Node x = get(root, prefix, 0);
        collect(x, new StringBuilder(prefix), results);
        return results;
    }

    private void collect(Node x, StringBuilder prefix, Queue<String> results) {
        if (x == null) return;
        if (x.value != null) results.add(prefix.toString());
        for (char c = 0; c < R; c++) {
            prefix.append(c);
            collect(x.next[c], prefix, results);
            prefix.deleteCharAt(prefix.length() - 1);
        }
    }

    public void put(String key, V value) {
        root = put(root, key, value, 0);
    }

    private Node put(Node x, String key, V value, int d) {
        if (x == null) {
            x = new Node();
        }
        if (d == key.length()) {
            x.value = value;
            return x;
        }
        char c = key.charAt(d);
        x.next[c] = put(x.next[c], key, value, d + 1);
        return x;
    }

    public V get(String key) {

        return (V) get(root, key, 0).value;
    }

    private Node get(Node x, String key, int d) {
        if (x == null) {
            return null;
        }
        if (d == key.length()) {
            return x;
        }
        char c = key.charAt(d);
        return get(x.next[c], key, d + 1);
    }

    public boolean contains(String key) {
        return get(key) != null;
    }

    public void delete(String key) {
        Node n = get(root, key, 0);
        n.value = null;
    }
}
