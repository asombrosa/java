package sorting.algo;
import sorting.Sortable;
import sorting.Item;

/*
start i from 0
find min replace with i
increment i
 */
public class SelectionSort implements Sortable {
    @Override
    public void sort(Comparable[] a){

        for(int index = 0;index< a.length;index++){
            int min = index;
            for(int j = index + 1; j< a.length;j++){
                if(less(a[j],a[min])){
                    min = j;
                }
            }
            exchange(a,index,min);
        }
    }


    public static void main(String[] args){
        Item item1 =  new Item.ItemBuilder(11, "Eggs").build();
        Item item2 =  new Item.ItemBuilder(21, "Bread").build();
        Item item3 =  new Item.ItemBuilder(10, "Chicken").build();
        Item item4 =  new Item.ItemBuilder(19, "Mutton").build();
        Item item5 =  new Item.ItemBuilder(5, "Fish").build();
        Item item6 =  new Item.ItemBuilder(1, "Butter").build();

        SelectionSort algo = new SelectionSort();
        Comparable array[] = {item1,item2,item3,item4,item5,item6};
        algo.sort(array);
        System.out.println(algo.toString(array));
    }
}
