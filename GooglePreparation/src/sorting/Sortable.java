package sorting;

import java.util.Comparator;

@FunctionalInterface
public interface Sortable {
    <T extends Comparable<T>> void sort(T[] a);

    default <T extends Comparable<T>> boolean less(T one, T two) {
        return one.compareTo(two) < 0;
    }

    default boolean less(Comparator c, Object one, Object two) {
        return c.compare(one, two)  < 0;
    }

    default <T extends Comparable<T>>void exchange(T[] array, int index1, int index2) {
        T value = array[index1];
        array[index1] = array[index2];
        array[index2] = value;
    }

    default <T extends Comparable<T>> String toString(T[] array) {
        StringBuilder string = new StringBuilder();
        for (T a : array) {
            string.append(a).append(" ");
        }
        string.append("\n");
        return string.toString();
    }
}
