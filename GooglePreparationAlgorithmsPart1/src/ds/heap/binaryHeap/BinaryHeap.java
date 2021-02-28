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

    private void swim(int k) {
        while (k > 0 && less(heap[(k - 1) / 2], heap[k])) {
            exchange((k - 1) / 2, k);
            k = (k - 1) / 2;
        }
    }

    private void sink(int k) {
        while (2 * k < heap.length) {
            int j = 2 * k + 1;
            if (j < heap.length - 1 && less(heap[j], heap[j + 1])) {
                j++;
            }
            if (!less(k, j)) {
                break;
            }
            exchange(j, k);
            k = j;
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
        BinaryHeap bh = new BinaryHeap(10);
        bh.insert(3);
        bh.insert(2);
        bh.insert(1);
        System.out.println(bh);
        bh.insert(5);
        System.out.println(bh);
        bh.insert(4);
        System.out.println(bh);
        bh.delete();
        System.out.println(bh);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        Arrays.stream(heap).filter(e -> e != 0).forEach(e -> string.append(e).append(" "));
        return string.toString();
    }

}
