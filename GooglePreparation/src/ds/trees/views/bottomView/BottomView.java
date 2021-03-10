package ds.trees.views.bottomView;

import ds.trees.BST;
import ds.trees.Node;
import ds.trees.traversals.Traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class BottomView<K extends Comparable<K>> implements Traversal<K> {

    @Override
    public void traverse(BST<K> bst) {
        Node<K> root = bst.getRoot();
        Map<Integer, List<K>> map = new TreeMap<>();
        topView(root, 0, map);

        for(Map.Entry<Integer, List<K>> entry : map.entrySet()) {
            System.out.print(entry.getValue().get(entry.getValue().size() - 1) + " ");
        }
    }

    private void topView(Node<K> current, int hd, Map<Integer, List<K>> map) {
        if (current == null) {
            return;
        }
        List<K> list = map.get(hd);
        if(list == null) {
            list = new ArrayList<>();
        }
        list.add(current.value);
        map.put(hd, list);
        topView(current.left, hd - 1, map);
        topView(current.right, hd + 1, map);
    }
}