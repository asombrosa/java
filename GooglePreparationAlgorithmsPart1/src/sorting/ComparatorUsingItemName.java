package sorting;


public class ComparatorUsingItemName implements java.util.Comparator<Item> {
    @Override
    public int compare(Item item1, Item item2) {
        return item1.itemName.compareTo(item2.itemName);
    }
}
