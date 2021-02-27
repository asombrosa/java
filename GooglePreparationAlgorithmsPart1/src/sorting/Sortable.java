package sorting;

@FunctionalInterface
public interface Sortable {
    public abstract void sort(Comparable[] a);

    default boolean less(Comparable one, Comparable two){
        return one.compareTo(two) < 0;
    }

    default void exchange(Comparable[] array, int index1, int index2){
        Comparable value = array[index1];
        array[index1] = array[index2];
        array[index2] = value;
    }

    default String toString(Comparable [] array){
        StringBuilder string = new StringBuilder();
        for(Comparable a: array){
            string.append(a).append(" ");
        }
        string.append("\n");
        return string.toString();
    }
}
