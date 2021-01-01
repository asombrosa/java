package com.heap;

import java.util.Arrays;

public class Heap {
    private final Integer[] heap;
    private int currentPosition = -1;

    public Heap(int size) {
        this.heap = new Integer[size];
    }

    public void deleteRoot() {
        if (currentPosition == -1) {
            return;
        }
        if (currentPosition == 0) {
            heap[currentPosition] = null;
            currentPosition--;
            return;
        }
        heap[0] = heap[currentPosition];
        heap[currentPosition] = null;
        fixDown(0, -1);
        currentPosition--;
    }

    private void fixDown(int index, int upto) {
        if (upto < 0) {
            upto = currentPosition;
        }
        if (index <= upto) {
            int indexOfLeftChild = getIndexOfLeftChild(index);
            int indexOfRightChild = getIndexOfRightChild(index);
            if (indexOfLeftChild > upto || indexOfRightChild > upto) {
                return;
            }
            Integer leftChild = heap[indexOfLeftChild];
            Integer rightChild = heap[indexOfRightChild];
            Integer parent = heap[index];
            if (parent == null ||
                    isParentALeafNode(leftChild, rightChild) ||
                    isParentGreaterThanChildNodes(leftChild, rightChild, parent)) {
                return;
            }
            if (leftChild == null) {
                if (parent < rightChild) {
                    swap(index, indexOfRightChild);
                    fixDown(indexOfRightChild, upto);
                }
            } else if (rightChild == null) {
                if (parent < leftChild) {
                    swap(index, indexOfLeftChild);
                    fixDown(indexOfLeftChild, upto);
                }
            } else {
                int indexOfMaxElement = getIndexOfMaxElement(indexOfLeftChild, indexOfRightChild);
                if (indexOfMaxElement <= upto) {
                    swap(index, indexOfMaxElement);
                    fixDown(indexOfMaxElement, upto);
                } else {
                    if (indexOfMaxElement == indexOfLeftChild) {
                        swap(index, indexOfRightChild);
                        fixDown(indexOfRightChild, upto);
                    } else {
                        swap(index, indexOfLeftChild);
                        fixDown(indexOfLeftChild, upto);
                    }
                }
            }
        }
    }

    private int getIndexOfMaxElement(int indexOfLeftChild, int indexOfRightChild) {
        return heap[indexOfLeftChild] > heap[indexOfRightChild] ? indexOfLeftChild : indexOfRightChild;
    }

    private boolean isParentALeafNode(Integer leftChild, Integer rightChild) {
        return leftChild == null && rightChild == null;
    }

    private boolean isParentGreaterThanChildNodes(Integer leftChild, Integer rightChild, Integer parent) {
        return (leftChild != null && rightChild != null) && (leftChild < parent && rightChild < parent);
    }

    private int getIndexOfParent(int indexOfChild) {
        return (indexOfChild - 1) / 2;
    }

    private int getIndexOfLeftChild(int indexOfParent) {
        return (2 * indexOfParent + 1);
    }

    private int getIndexOfRightChild(int indexOfParent) {
        return (2 * indexOfParent + 2);
    }

    public void insert(Integer element) {
        currentPosition++;
        if (currentPosition < heap.length) {
            heap[currentPosition] = element;
            fixUp(currentPosition);
        } else {
            System.out.println("Heap filled completely.. can't insert data");
        }
    }

    private void fixUp(int currentPosition) {
        int parentIndex = getIndexOfParent(currentPosition);
        if (currentPosition == 0 || heap[parentIndex] > heap[currentPosition]) {
            return;
        }
        swap(parentIndex, currentPosition);
        fixUp(parentIndex);
    }

    private void swap(int parentIndex, int currentPosition) {
        Integer temp = heap[parentIndex];
        heap[parentIndex] = heap[currentPosition];
        heap[currentPosition] = temp;
    }

    public void heapSort() {
        for (int i = 0; i < currentPosition; i++) {
            swap(0, currentPosition - i);
            fixDown(0, currentPosition - i - 1);
            System.out.println(Arrays.deepToString(this.heap));
        }
    }

    @Override
    public String toString() {
        return Arrays.deepToString(this.heap);
    }

    public static void main(String[] args) {
        Heap heap = new Heap(10);
        heap.insert(8);
        heap.insert(3);
        heap.insert(5);
        heap.insert(7);
        heap.insert(2);
        heap.insert(15);
        heap.insert(17);
        heap.insert(19);
        //System.out.println(heap);
        heap.deleteRoot();
        //System.out.println(heap);
        heap.heapSort();
        //System.out.println(heap);
    }
}
