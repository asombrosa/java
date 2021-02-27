package sorting.algo;

import sorting.Sortable;
import sorting.Item;
/*
h sort
insertion sort in h passes
 */
public class ShellSort implements Sortable {

    public void sort(Comparable[] a) {
        int h = 1;
        while (h < a.length) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < a.length; i++) {
                for (int j = i; j >= h && less(a[j], a[j - h]); j = j - h) {
                    exchange(a, j, j - h);
                }
            }
            h = h / 3;
        }
    }

    public static void main(String[] args){
        Item item1 = new Item.ItemBuilder(34, "ABC").build();
        Item item2 = new Item.ItemBuilder(13, "ABC").build();
        Item item3 = new Item.ItemBuilder(14, "ABC").build();
        Item item4 = new Item.ItemBuilder(3, "ABC").build();
        Item item5 = new Item.ItemBuilder(4, "ABC").build();
        Item item6 = new Item.ItemBuilder(7, "ABC").build();
        Item item7 = new Item.ItemBuilder(18, "ABC").build();
        Item item8 = new Item.ItemBuilder(26, "ABC").build();
        Item item9 = new Item.ItemBuilder(1, "ABC").build();
        Item item10 = new Item.ItemBuilder(41, "ABC").build();
        Item item11 = new Item.ItemBuilder(23, "ABC").build();
        Item item12 = new Item.ItemBuilder(30, "ABC").build();
        Item item13 = new Item.ItemBuilder(67, "ABC").build();
        Item item14 = new Item.ItemBuilder(74, "ABC").build();
        Item item15 = new Item.ItemBuilder(56, "ABC").build();

        ShellSort algo = new ShellSort();
        Comparable[] array = {item1,item2,item3,item4,item5,item6,item7,item8,item9,item10,item11,
                item12,item13,item14,item15};
        algo.sort(array);
        System.out.println(algo.toString(array));

    }
}
