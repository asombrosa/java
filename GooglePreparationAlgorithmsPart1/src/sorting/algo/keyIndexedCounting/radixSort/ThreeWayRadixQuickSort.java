package sorting.algo.keyIndexedCounting.radixSort;

import java.util.Arrays;

public class ThreeWayRadixQuickSort {

    public static void main(String[] args) {
        String[] array = {"dab", "add", "b", "cab", "fad", "fee", "bb", "bad", "dad", "bee", "fed", "bed", "ebb", "ace", "a"};
        ThreeWayRadixQuickSort lsdRadixSort = new ThreeWayRadixQuickSort();
        lsdRadixSort.sort(array);
    }

    public void sort(String[] array) {
        int N = array.length;
        sort(array, 0, N - 1, 0);
        Arrays.stream(array).forEach(System.out::println);
    }

    public void sort(String[] array, int from, int to, int charIndexToBeSorted) {
        if (to <= from) {
            return;
        }
        int low = from;
        int high = to;
        int indexOfPivotCharacter = charAt(array[from], charIndexToBeSorted);
        int index = from + 1;
        while (index <= high) {
            int charAtIndex = charAt(array[index], charIndexToBeSorted);
            if (charAtIndex < indexOfPivotCharacter) {
                exchange(array, low++, index++);
            } else if (charAtIndex > indexOfPivotCharacter) {
                exchange(array, index, high--);
            } else {
                index++;
            }
        }
        sort(array, from, low - 1, charIndexToBeSorted);
        if (indexOfPivotCharacter > 0) {
            sort(array, low, high, charIndexToBeSorted + 1);
        }
        sort(array, high + 1, to, charIndexToBeSorted);
    }

    public void exchange(String[] strings, int i, int j) {
        String temp = strings[i];
        strings[i] = strings[j];
        strings[j] = temp;

    }

    public int charAt(String string, int index) {
        if (index < string.length()) {
            return string.charAt(index);
        }
        return 0;
    }
}
