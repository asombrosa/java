package sorting.algo.keyIndexedCounting.radixSort;

import java.util.Arrays;

/*

Steps:
    1. Keep two pointers low = startIndex, high = end index
    2. Store value at current index
    3. If current index character == value
        index++
    4. If current index character < value
        replace character at low with current character
        increment low
        increment index
    5. If current index character > value
        replace high with current character
        decrement high
    6. sort from startIndex to low - 1
    7. if value > 0
        sort from low to high
    8. sort from high + 1 to endIndex

Time complexity : O(N * log N)

*/
public class ThreeWayRadixQuickSort {

    public static void main(String[] args) {
        String[] array = {"dab", "add", "b", "cab", "fad", "fee", "bb", "bad", "dad", "bee", "fed", "bed", "ebb", "ace", "a"};
        ThreeWayRadixQuickSort threeWayRadixQuickSort = new ThreeWayRadixQuickSort();
        threeWayRadixQuickSort.sort(array);
    }

    public void sort(String[] array) {
        int N = array.length;
        sort(array, 0, N - 1, 0);
        Arrays.stream(array).forEach(System.out::println);
    }

    public void sort(String[] array, int startIndex, int endIndex, int currentCharacterIndex) {
        if (endIndex <= startIndex) {
            return;
        }
        int low = startIndex;
        int high = endIndex;
        int pivotCharacter = charAt(array[startIndex], currentCharacterIndex);
        int index = startIndex + 1;
        while (index <= high) {
            int currentCharacter = charAt(array[index], currentCharacterIndex);
            if (currentCharacter < pivotCharacter) {
                exchange(array, low++, index++);
            } else if (currentCharacter > pivotCharacter) {
                exchange(array, index, high--);
            } else {
                index++;
            }
        }
        sort(array, startIndex, low - 1, currentCharacterIndex);
        if (pivotCharacter > 0) {
            sort(array, low, high, currentCharacterIndex + 1);
        }
        sort(array, high + 1, endIndex, currentCharacterIndex);
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
