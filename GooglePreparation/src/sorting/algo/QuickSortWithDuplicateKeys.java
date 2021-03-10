package sorting.algo;

import sorting.Sortable;

/*
keep two pointers low and high
initialize lt = low; gt = high;
iterate from lt to gt using i pointer:
    1. if value at i (current) == value at low
        i++;
    2. if value at current < value at low
        exchange(i, lt);
        i++; lt++;
    3. if value at current > value at low
        exchange(i, gt);
        i++;gt--;
sort(low, lt);    ===> this contains elements less than current
sort(gt, high);   ===> this contains elements greater than current

Note: elements between lt and gt are equal ==> hence need not be sorted

Time complexity : O(N)
 */
public class QuickSortWithDuplicateKeys implements Sortable {
    public <T extends Comparable<T>> void sort(T[] a, int low, int high) {
        if (high <= low) {
            return;
        }
        int lt = low;
        int gt = high;
        T value = a[low];
        int i = low;
        while (i <= gt) {
            int cmp = a[i].compareTo(value);
            if (cmp < 0) {
                exchange(a, i++, lt++);
            } else if (cmp > 0) {
                exchange(a, i, gt--);
            } else {
                i++;
            }
        }
        sort(a, low, lt - 1);
        sort(a, gt + 1, high);
    }

    @Override
    public <T extends Comparable<T>> void sort(T[] a) {
        sort(a, 0, a.length - 1);
    }

    public static void main(String[] args) {
        QuickSortWithDuplicateKeys algo = new QuickSortWithDuplicateKeys();
        Integer[] a = new Integer[]{1, 4, 5, 7, 7, 7, 3, 1, 4, 2, 5, 8, 4, 5};
        algo.sort(a);
        System.out.println(algo.toString(a));
    }
}
