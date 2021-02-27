package sorting;

public class Item implements Comparable<Item> {
    Integer itemNumber;
    String itemName;
    String itemDescription;

    private Item(ItemBuilder itemBuilder) {
        this.itemNumber = itemBuilder.itemNumber;
        this.itemName = itemBuilder.itemName;
        this.itemDescription = itemBuilder.itemDescription;
    }

    public static class ItemBuilder {
        Integer itemNumber;
        String itemName;
        String itemDescription;

        public ItemBuilder(Integer itemNumber, String itemName) {
            this.itemNumber = itemNumber;
            this.itemName = itemName;
        }

        public ItemBuilder setDescription(String description) {
            this.itemDescription = description;
            return this;
        }

        public Item build() {
            return new Item(this);
        }
    }

    @Override
    public String toString() {
        return "Item " + this.itemNumber + "  --  " + this.itemName + "\n";
    }

    @Override
    public int compareTo(Item item) {
        if (this.itemNumber.equals(item.itemNumber)) {
            return 0;
        } else if (this.itemNumber < item.itemNumber) {
            return -1;
        } else {
            return 1;
        }
    }
}
