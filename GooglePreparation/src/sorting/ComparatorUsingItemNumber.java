package sorting;

public class ComparatorUsingItemNumber implements java.util.Comparator<Item> {
    @Override
    public int compare(Item item1, Item item2) {
        if (item1.itemNumber.equals(item2.itemNumber)) {
            return 0;
        } else if (item1.itemNumber < item2.itemNumber) {
            return -1;
        } else {
            return 1;
        }
    }
}
