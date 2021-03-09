package ds.heap.binaryHeap;

import java.util.Arrays;

public class BinaryHeap {
    int[] heap;
    int counter;

    BinaryHeap(int capacity) {
        heap = new int[capacity];
        counter = 0;
    }

    private void exchange(int index1, int index2) {
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    private boolean less(int val1, int val2) {
        return val1 < val2;
    }

    private void swim(int childIndex) {
        while (childIndex > 0) {
            int parentIndex = (childIndex - 1) / 2;
            if (isChildSmallerThanParent(heap[parentIndex], heap[childIndex])) {
                break;
            }
            exchange(parentIndex, childIndex);
            childIndex = parentIndex;
        }
    }

    private boolean isChildSmallerThanParent(int parent, int child) {
        return less(child, parent);
    }

    private void sink(int parentIndex) {
        while (2 * parentIndex < heap.length) {
            int child = 2 * parentIndex + 1;
            if (child < heap.length - 1 && less(heap[child], heap[child + 1])) {
                child++;
            }
            if (isChildSmallerThanParent(parentIndex, child)) {
                break;
            }
            exchange(child, parentIndex);
            parentIndex = child;
        }
    }

    public void insert(int value) {
        heap[counter] = value;
        swim(counter++);
    }

    public void delete() {
        heap[0] = heap[counter];
        heap[counter--] = 0;
        sink(0);
    }

    public static void main(String[] args) {
        BinaryHeap binaryHeap = new BinaryHeap(10);
        binaryHeap.insert(3);
        binaryHeap.insert(2);
        binaryHeap.insert(1);
        System.out.println(binaryHeap);
        binaryHeap.insert(5);
        System.out.println(binaryHeap);
        binaryHeap.insert(4);
        System.out.println(binaryHeap);
        binaryHeap.delete();
        System.out.println(binaryHeap);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        Arrays.stream(heap).filter(e -> e != 0).forEach(e -> string.append(e).append(" "));
        return string.toString();
    }

}
