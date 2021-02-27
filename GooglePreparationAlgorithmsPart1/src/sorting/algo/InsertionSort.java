package sorting.algo;

import sorting.Sortable;
import sorting.Item;

public class InsertionSort implements Sortable {
    @Override
    public void sort(Comparable[] a) {
        for (int outerLoopCounter = 0; outerLoopCounter < a.length; outerLoopCounter++) {
            for (int innerLoopCounter = outerLoopCounter; innerLoopCounter > 0; innerLoopCounter--) {
                if (less(a[innerLoopCounter], a[innerLoopCounter - 1])) {
                    exchange(a, innerLoopCounter, innerLoopCounter - 1);
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Item item1 = new Item.ItemBuilder(23, "Eggs").build();
        Item item2 = new Item.ItemBuilder(12, "Eggs").build();
        Item item3 = new Item.ItemBuilder(3, "Eggs").build();
        Item item4 = new Item.ItemBuilder(2, "Eggs").build();
        Item item5 = new Item.ItemBuilder(9, "Eggs").build();
        Item item6 = new Item.ItemBuilder(14, "Eggs").build();

        InsertionSort algo = new InsertionSort();
        Comparable[] array = {item1, item2, item3, item4, item5, item6};
        algo.sort(array);
        System.out.println(algo.toString(array));
    }
}
