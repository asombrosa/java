package sorting.algo;

import sorting.Sortable;
import sorting.Item;

/*
1 2 3 4 5 6 7
 */
public class MergeSort implements Sortable {

    public void merge(Comparable[] array, Comparable[] aux, int low, int mid, int high) {
        int index = low;
        for (index = low; index <= high; index++) {
            aux[index] = array[index];
        }
        int i = low;
        int j = mid + 1;
        for (int k = low; k <= high; k++) {
            if (i > mid) {
                array[k] = aux[j++];
            } else if (j > high) {
                array[k] = aux[i++];
            } else if (less(aux[i], aux[j])) {
                array[k] = aux[i++];
            } else {
                array[k] = aux[j++];
            }
        }
    }

    public void sort(Comparable[] array, Comparable[] aux, int low, int high) {
        if (high <= low) {
            return;
        }
        int mid = low + (high - low) / 2;
        sort(array, aux, low, mid);
        sort(array, aux, mid + 1, high);
        merge(array, aux, low, mid, high);

    }

    public void sort(Comparable[] array) {
        Comparable[] aux = new Comparable[array.length];
        sort(array, aux, 0, array.length - 1);
    }

    public static void main(String[] args) {
        Item item1 = new Item.ItemBuilder(11, "A").build();
        Item item2 = new Item.ItemBuilder(11111, "A").build();
        Item item3 = new Item.ItemBuilder(1, "A").build();
        Item item4 = new Item.ItemBuilder(1111111, "A").build();
        Item item5 = new Item.ItemBuilder(1111, "A").build();
        Item item6 = new Item.ItemBuilder(111111, "A").build();
        Item item7 = new Item.ItemBuilder(111, "A").build();
        Item item8 = new Item.ItemBuilder(111111111, "A").build();
        Item item9 = new Item.ItemBuilder(11111111, "A").build();

        MergeSort algo = new MergeSort();
        Comparable[] array = {item1,item2,item3,item4,item5,item6,item7,item8,item9};
        algo.sort(array);
        System.out.println(algo.toString(array));

    }
}
