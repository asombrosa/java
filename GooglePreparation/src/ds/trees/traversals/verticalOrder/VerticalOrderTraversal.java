package ds.trees.traversals.verticalOrder;

import ds.trees.BST;
import ds.trees.Node;
import ds.trees.traversals.Traversal;

import java.util.*;

public class VerticalOrderTraversal<K extends Comparable<K>> implements Traversal<K> {

    @Override
    public void traverse(BST<K> bst) {
        Node<K> root = bst.getRoot();
        Map<Integer, List<K>> map = new TreeMap<>();
        verticalOrder(root, 0, map);
        for (Map.Entry<Integer, List<K>> entry : map.entrySet()) {
            System.out.println(entry.getValue() + " ");
        }
    }

    private void verticalOrder(Node<K> current, int hd, Map<Integer, List<K>> map) {
        if (current == null) {
            return;
        }
        List<K> list = map.get(hd);
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(current.value);
        map.put(hd, list);
        verticalOrder(current.left, hd - 1, map);
        verticalOrder(current.right, hd + 1, map);
    }
}