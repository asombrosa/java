package sorting.algo;

import sorting.Item;
import sorting.Sortable;

/*
Caveat - More space
 */
public class MergeSortBottomUpApproachWithoutRecursion implements Sortable {

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

    public void sort(Comparable[] array) {
        Comparable[] aux = new Comparable[array.length];
        for (int counterForHalfArray = 1; counterForHalfArray < array.length; counterForHalfArray = counterForHalfArray + counterForHalfArray) {
            for (int low = 0; low < array.length - counterForHalfArray; low = low + counterForHalfArray + counterForHalfArray) {
                merge(array, aux, low, low + counterForHalfArray - 1, Math.min(low + counterForHalfArray + counterForHalfArray - 1, array.length - 1));
            }
        }
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

        MergeSortBottomUpApproachWithoutRecursion algo = new MergeSortBottomUpApproachWithoutRecursion();
        Comparable[] array = {item1, item2, item3, item4, item5, item6, item7, item8, item9};
        algo.sort(array);
        System.out.println(algo.toString(array));

    }
}
