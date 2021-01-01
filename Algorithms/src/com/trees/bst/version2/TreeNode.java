package com.trees.bst.version2;

public class TreeNode {
    private Integer data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(Integer data) {
        this.data = data;
    }

    public Integer getData() {
        return data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public Integer find(Integer data) {
        if (data == this.data) {
            return data;
        }
        if (data < this.data && leftChild != null) {
            return leftChild.find(data);
        }
        if (rightChild != null) {
            return rightChild.find(data);
        }
        return null;
    }

    public void insert(Integer data) {
        if (data >= this.data) {
            if (this.rightChild == null) {
                this.rightChild = new TreeNode(data);
            } else {
                this.rightChild.insert(data);
            }
        } else {
            if (this.leftChild == null) {
                this.leftChild = new TreeNode(data);
            } else {
                this.leftChild.insert(data);
            }
        }
    }

    public Integer smallest() {
        if (this.leftChild == null) {
            return this.data;
        }
        return this.leftChild.smallest();
    }

    public Integer greatest() {
        if (this.rightChild == null) {
            return this.data;
        }
        return this.rightChild.greatest();
    }
}
