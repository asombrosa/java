package sorting;

import sorting.Item;

public class ComparatorUsingItemName implements java.util.Comparator<Item> {
    @Override
    public int compare(Item item1, Item item2) {
        if (item1.itemName.equals(item2.itemName)) {
            return 0;
        } else if (item1.itemName.length() < item2.itemName.length()) {
            return -1;
        } else {
            return 1;
        }
    }
}
