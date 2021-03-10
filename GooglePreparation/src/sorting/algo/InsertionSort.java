package sorting.algo;

import sorting.ComparatorUsingItemName;
import sorting.ComparatorUsingItemNumber;
import sorting.Item;
import sorting.Sortable;

import java.util.Comparator;

/*
start from 1st
go to next
place the next so that left array is sorted
move to next
place it in the correct position
..
continue

Time complexity : O(N * N)

 */
public class InsertionSort implements Sortable {
    @Override
    public <T extends Comparable<T>> void sort(T[] a) {
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

    public void sort(Item[] a, Comparator c) {
        for (int outerLoopCounter = 0; outerLoopCounter < a.length; outerLoopCounter++) {
            for (int innerLoopCounter = outerLoopCounter; innerLoopCounter > 0; innerLoopCounter--) {
                if (less(c, a[innerLoopCounter], a[innerLoopCounter - 1])) {
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
        Item item3 = new Item.ItemBuilder(3, "Bread").build();
        Item item4 = new Item.ItemBuilder(2, "Milk").build();
        Item item5 = new Item.ItemBuilder(9, "Chickens").build();
        Item item6 = new Item.ItemBuilder(14, "Fish").build();

        InsertionSort algo = new InsertionSort();
        Item[] array = {item1, item2, item3, item4, item5, item6};
        algo.sort(array);
        System.out.println(algo.toString(array));
        array = new Item[]{item1, item2, item3, item4, item5, item6};
        algo.sort(array, new ComparatorUsingItemNumber());
        System.out.println(algo.toString(array));
        array = new Item[]{item1, item2, item3, item4, item5, item6};
        algo.sort(array, new ComparatorUsingItemName());
        System.out.println(algo.toString(array));


    }
}
