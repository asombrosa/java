package ds.geometricApplicationOfBST.intervalSearchTree;

/*
check if lines are intersecting
store max node at each node

Time complexity : O(log N)
Use Red black trees for best performance
 */
public class IntervalSearchTree<K extends Comparable<K>> {
    Node root;

    private class Node {
        K start;
        K end;
        K maxNode;
        Node left;
        Node right;

        Node(K start, K end) {
            this.start = start;
            this.end = end;
            this.maxNode = end;
        }

        public String toString() {
            return "[ Start : " + start + ", End : " + end + ", maxNode : " + maxNode + " ]";
        }
    }

    public K findMax(Node current) {
        Node temp = current;
        K max = temp.maxNode;
        while (current != null) {
            max = current.end;
            current = current.right;
        }
        temp.maxNode = max;
        return max;
    }

    public void put(K start, K end) {
        root = put(root, start, end);
    }

    private Node put(Node current, K start, K end) {
        if (current == null) {
            return new Node(start, end);
        }
        int compare = start.compareTo(current.start);
        if (compare < 0) {
            current.left = put(current.left, start, end);
        } else if (compare > 0) {
            current.right = put(current.right, start, end);
        } else {
            current.end = end;
        }
        current.maxNode = findMax(current);
        return current;
    }

    public Node range(K start, K end) {
        return range(root, start, end);
    }

    private Node range(Node curr, K start, K end) {
        while(curr != null) {
            if (isIntersecting(curr, start, end)) {
                return curr;
            } else if (curr.left == null) {
                curr = curr.right;
            } else if (curr.left.maxNode.compareTo(start) < 0) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }
        return null;
    }

    private boolean isIntersecting(Node curr, K start, K end) {
        boolean isStartInRange = start.compareTo(curr.end) < 0 && curr.start.compareTo(end) < 0;
        boolean isEndInRange = end.compareTo(curr.end) > 0 && curr.end.compareTo(end) > 0;
        return isStartInRange || isEndInRange;
    }

    public void inorder() {
        inorder(root);
    }

    private void inorder(Node curr) {
        if (curr == null) {
            return;
        }
        inorder(curr.left);
        System.out.println(curr);
        inorder(curr.right);
    }
}
