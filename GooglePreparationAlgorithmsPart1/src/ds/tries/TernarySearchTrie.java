package ds.tries;

import java.util.LinkedList;
import java.util.Queue;

public class TernarySearchTrie<V> {
    private Node root;

    private class Node {
        char c;
        V value;
        Node left, right, mid;
    }

    public void put(String key, V value) {
        root = put(root, key, value, 0);
    }

    public Node put(Node node, String key, V value, int d) {
        char c = key.charAt(d);
        if (node == null) {
            node = new Node();
            node.c = c;
        }
        if (c < node.c) {
            node.left = put(node.left, key, value, d);
        } else if (c > node.c) {
            node.right = put(node.right, key, value, d);
        } else if (d < key.length() - 1) {
            node.mid = put(node.mid, key, value, d + 1);
        } else {
            node.value = value;
        }
        return node;
    }

    public boolean contains(String key) {
        return get(key) != null;
    }

    public V get(String key) {
        return (V) get(root, key, 0);
    }

    private Node get(Node node, String key, int index) {
        if (node == null) {
            return null;
        }
        char c = key.charAt(index);
        if (c < node.c) {
            return get(node.left, key, index);
        } else if (c > node.c) {
            return get(node.right, key, index);
        } else if (index < key.length() - 1) {
            return get(node.mid, key, index + 1);
        } else {
            return node;
        }
    }

    public static void main(String[] args) {
        TernarySearchTrie<Integer> tst = new TernarySearchTrie<>();
        tst.put("dab", 1);
        tst.put("add", 2);
        tst.put("cab", 3);
        tst.put("fad", 4);
        tst.put("fee", 5);
        tst.put("bad", 6);
        tst.put("b", 7);
        tst.put("dad", 8);
        tst.put("bee", 9);
        tst.put("fed", 10);
        tst.put("aa", 11);
        tst.put("bed", 12);
        tst.put("ebb", 13);
        tst.put("ace", 14);
        tst.put("cc", 15);
        tst.keys().forEach(System.out::println);
    }

    public Iterable<String> keys() {
        Queue<String> queue = new LinkedList<>();
        collect(root, new StringBuilder(), queue);
        return queue;
    }

    private void collect(Node x, StringBuilder prefix, Queue<String> queue) {
        if (x == null) return;
        collect(x.left, prefix, queue);
        if (x.value != null) queue.add(prefix.toString() + x.c);
        collect(x.mid, prefix.append(x.c), queue);
        prefix.deleteCharAt(prefix.length() - 1);
        collect(x.right, prefix, queue);
    }

}
