package ds.tries;

import java.util.LinkedList;
import java.util.Queue;

/*
Same like bst, but has 3 children

Time complexity :
    1. search hit : L + log N
    2. search miss  : log N
    3. insert : log N
 */
public class TernarySearchTrie<V> {
    private Node root;

    private class Node {
        char character;
        V value;
        Node left, right, mid;
    }

    public void put(String key, V value) {
        root = put(root, key, value, 0);
    }

    public Node put(Node node, String key, V value, int currentIndex) {
        char currentCharacter = key.charAt(currentIndex);
        if (node == null) {
            node = new Node();
            node.character = currentCharacter;
        }
        if (currentCharacter < node.character) {
            node.left = put(node.left, key, value, currentIndex);
        } else if (currentCharacter > node.character) {
            node.right = put(node.right, key, value, currentIndex);
        } else if (currentIndex < key.length() - 1) {
            node.mid = put(node.mid, key, value, currentIndex + 1);
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
        if (c < node.character) {
            return get(node.left, key, index);
        } else if (c > node.character) {
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

    private void collect(Node currentNode, StringBuilder prefix, Queue<String> queue) {
        if (currentNode == null) return;
        collect(currentNode.left, prefix, queue);
        if (currentNode.value != null)  {
            queue.add(prefix.toString() + currentNode.character);
        }
        collect(currentNode.mid, prefix.append(currentNode.character), queue);
        prefix.deleteCharAt(prefix.length() - 1);
        collect(currentNode.right, prefix, queue);
    }
}