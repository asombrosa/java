package sorting.algo;

import sorting.Sortable;

public class HeapSort implements Sortable {
    int N;
    Comparable[] heap;

    private void sink(int index, int N) {
        int child;
        while (2 * index < N) {
            child = 2 * index + 1;
            if (child < N && less(heap[child], heap[child + 1])) {
                child++;
            }
            if (!less(heap[index], heap[child])) {
                break;
            }
            exchange(heap, index, child);
            index = child;
        }
    }

    public void buildMaxHeap() {
        for (int index = (N - 1) / 2; index >= 0; index--) {
            sink(index, N);
        }
    }

    public void sort() {
        while (N > 0) {
            exchange(heap, 0, N--);
            sink(0, N);
        }
    }

    public <T extends Comparable<T>> void initialize(T[] a) {
        heap = a;
        N = a.length - 1;
    }

    @Override
    public <T extends Comparable<T>> void sort(T[] a) {
        initialize(a);
        buildMaxHeap();
        sort();
    }

    public static void main(String[] args) {
        Integer[] a = {15, 10, 14, 16, 5, 20, 1, 8, 13, 11, 7, 5};
        HeapSort heap = new HeapSort();
        heap.sort(a);
        System.out.println(heap.toString(a));
    }
}
