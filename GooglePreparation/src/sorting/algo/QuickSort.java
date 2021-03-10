package sorting.algo;

import sorting.Item;
import sorting.Sortable;

/*
Keep pointers for low and high elements
keep additional two pointers i = low + 1 and j = high + 1:
keep incrementing i if i < low
keep decrementing j if j > high
exchange i and j
..
continue till j <= i
now exchange j and low
return i ==> partitioning element
Now sort from low to partitioning element
and then sort from partitioning element + 1 to high

Time complexity : O(N * N)

 */
public class QuickSort implements Sortable {
    public <T extends Comparable<T>> int partition(T[] array, int low, int high) {
        int i = low;
        int j = high + 1;
        while (true) {
            while (less(array[++i], array[low])) {
                if (i == high) {
                    break;
                }
            }
            while (less(array[low], array[--j])) {
                if (j == low) {
                    break;
                }
            }
            if (j <= i) {
                break;
            }
            exchange(array, i, j);
        }
        exchange(array, low, j);
        return i;
    }

    public <T extends Comparable<T>> void sort(T[] a, int low, int high) {
        if (high <= low) {
            return;
        }
        int partition = partition(a, low, high);
        sort(a, low, partition - 1);
        sort(a, partition, high);
    }

    @Override
    public <T extends Comparable<T>> void sort(T[] a) {
        sort(a, 0, a.length - 1);
    }

    public static void main(String[] args) {
        Item i1 = new Item.ItemBuilder(11, "abc").build();
        Item i2 = new Item.ItemBuilder(11111, "abc").build();
        Item i3 = new Item.ItemBuilder(1111, "abc").build();
        Item i4 = new Item.ItemBuilder(1111111, "abc").build();
        Item i5 = new Item.ItemBuilder(111111, "abc").build();
        Item i6 = new Item.ItemBuilder(111, "abc").build();
        Item i7 = new Item.ItemBuilder(1, "abc").build();
        Item i8 = new Item.ItemBuilder(11111111, "abc").build();
        QuickSort algo = new QuickSort();
        Item[] a = {i1, i2, i3, i4, i5, i6, i7, i8};
        algo.sort(a);
        System.out.println(algo.toString(a));
    }
}
