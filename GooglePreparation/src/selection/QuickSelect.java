package selection;

import sorting.Sortable;

/*
kth largest element
quick sort takes a number and places it in the correct position
so we wait for the kth element to take its position
takes around O(n) time

Time complexity : O(N * k)
 */
public class QuickSelect implements Sortable {
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
        exchange(array, j, low);
        return j;
    }

    @Override
    public <T extends Comparable<T>> void sort(T[] a) {

    }


    public <T extends Comparable<T>> Integer search(Integer[] array, int kthLargestNumber) {
        int low = 0;
        int high = array.length - 1;
        while (low < high) {
            int j = partition(array, low, high);
            if (j < kthLargestNumber) {
                low = j + 1;
            } else if (j > kthLargestNumber) {
                high = j - 1;
            } else {
                return array[kthLargestNumber]; // if j == kthLargestNumber,
                // that means we found the
            }                                   // number at kth position
        }
        return array[kthLargestNumber];
    }

    public static void main(String[] args) {
        QuickSelect quickSelect = new QuickSelect();

        Integer[] a = new Integer[]{10, 6, 12, 7, 2, 8, 3, 5, 4, 9};
        int val = quickSelect.search(a, 0);
        //put k = 0,
        // for smallest element
        //k = array length - 1
        // for largest element
        System.out.println(val);
    }
}
