package com.trees.bst.version2;

public class BinarySearchTree {
    private TreeNode root;

    public void insert(Integer data) {
        if (root == null) {
            this.root = new TreeNode(data);
        } else {
            root.insert(data);
        }
    }

    public Integer find(Integer data) {
        if (root != null) {
            return root.find(data);
        }
        return null;
    }

    public void deleteData(Integer data) {
        TreeNode current = this.root;
        TreeNode parent = this.root;
        boolean isLeftChild = false;

        if (current == null) {
            return;
        }

        while (current != null && current.getData() != data) {
            parent = current;

            if (data < current.getData()) {
                current = current.getLeftChild();
                isLeftChild = true;
            } else {
                current = current.getRightChild();
                isLeftChild = false;
            }
        }

        if (current == null) {
            return;
        }

        //Case1 : the current node doesn't have any children
        if (current.getLeftChild() == null && current.getRightChild() == null) {
            if (current == root) {
                root = null;
            } else {
                if (isLeftChild) {
                    current.setLeftChild(null);
                } else {
                    current.setRightChild(null);
                }
            }
        }
        //Case2 : broken down further into 2 separate cases
        else if (current.getRightChild() == null) { //has a left child
            if (root == current) {
                root = null;
            } else if (isLeftChild) {
                parent.setLeftChild(current.getLeftChild());
            } else {
                parent.setRightChild(current.getLeftChild());
            }
        } else if (current.getLeftChild() == null) {
            if (root == current) {
                root = null;
            } else if (isLeftChild) {
                parent.setLeftChild(current.getRightChild());
            } else {
                parent.setRightChild(current.getRightChild());
            }
        }
        //Case3 : Most complicated (node to be deleted has 2 children)
        else {
            TreeNode successor = getSuccessor(current);
            if (root == current) {
                root = successor;
            } else if (isLeftChild) {
                current.setLeftChild(successor);
            } else {
                current.setRightChild(successor);
            }
            successor.setLeftChild(current.getLeftChild());
        }

    }

    public TreeNode getSuccessor(TreeNode node) {
        TreeNode parentOfSuccessor = node;
        TreeNode successor = node;
        TreeNode current = node.getRightChild();
        while (current != null) {
            parentOfSuccessor = successor;
            successor = current;
            current = current.getLeftChild();
        }
        if (node.getRightChild() != parentOfSuccessor) {
            parentOfSuccessor.setLeftChild(successor.getRightChild());
            successor.setRightChild(node.getRightChild());
        }
        return successor;
    }
}
