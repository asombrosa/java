package ds.string;

import java.util.ArrayList;
import java.util.List;

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
        RWaysTries<String> rWaysTries = new RWaysTries<>();
        rWaysTries.put("1","dab");
        rWaysTries.put("2","add");
        rWaysTries.put("3","cab");
        rWaysTries.put("4","fad");
        rWaysTries.put("5","fee");
        rWaysTries.put("6","bad");
        rWaysTries.put("7","b");
        rWaysTries.put("8","dad");
        rWaysTries.put("9","bee");
        rWaysTries.put("10","fed");
        rWaysTries.put("11","aa");
        rWaysTries.put("12","bed");
        rWaysTries.put("13","ebb");
        rWaysTries.put("14","ace");
        rWaysTries.put("15","cc");
        
        rWaysTries.getWordList().stream().sorted().forEach(System.out::println);
    }

    public List<String> getWordList() {
        List<String> result = new ArrayList<>();
        for (Node n : root.next) {
            if (null != n) {
                getWordList(result, n.value + "", n);
            }
        }
        return result;
    }

    private void getWordList(List<String> result, String word, Node n) {
        if (n.value != null) {
            result.add(word);
            word = "";
        }
        for (Node t : n.next) {
            if (null != t) {
                getWordList(result, word + t.value, t);
            }
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
