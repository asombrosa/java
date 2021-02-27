package sorting.algo;
import sorting.Sortable;
import sorting.Item;
import java.util.Random;

/*
Shuffle the deck of cards
 */
public class ShuffleSort implements Sortable{
    public void sort(Comparable[]a){
        for(int i=0;i<a.length;i++){
            Random r = new Random();
            int n = r.nextInt(i+1);
            exchange(a,n,i);
        }
    }

    public static void main(String[] args){
        Item item= new Item.ItemBuilder(1,"A").build();
        Item item1= new Item.ItemBuilder(2,"A").build();
        Item item2= new Item.ItemBuilder(3,"A").build();
        Item item3= new Item.ItemBuilder(4,"A").build();
        Item item4= new Item.ItemBuilder(5,"A").build();
        Item item5= new Item.ItemBuilder(6,"A").build();
        Item item6= new Item.ItemBuilder(7,"A").build();
        Item item7= new Item.ItemBuilder(8,"A").build();
        Item item8= new Item.ItemBuilder(9,"A").build();

        Comparable[] a = {item,item1,item2,item3,item4,item5,item6,item7,item8};
        ShuffleSort shuffleSort = new ShuffleSort();
        shuffleSort.sort(a);
        System.out.println(shuffleSort.toString(a));
    }
}
