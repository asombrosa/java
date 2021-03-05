package sorting.algo.keyIndexedCounting.radixSort.leastSignificantDigitFirst;

import java.util.Arrays;

public class LSDRadixSort {
    public static void main(String[] args) {
        String[] array = {"dab", "add", "b", "cab", "fad", "fee", "bb", "bad", "dad", "bee", "fed", "bed", "ebb", "ace", "a"};
        LSDRadixSort lsdRadixSort = new LSDRadixSort();
        lsdRadixSort.sort(array, 3);
    }

    public void sort(String[] array, int w) {
        int N = array.length;
        int R = 256;
        String[] aux = new String[N];
        for (int d = w - 1; d >= 0; d--) {
            int[] count = new int[R + 1];
            for (String s : array) {
                count[charAt(s, d) + 1]++;
            }
            for (int r = 0; r < R; r++) {
                count[r + 1] += count[r];
            }
            for (String s : array) {
                aux[count[charAt(s, d)]++] = s;
            }
            for (int i = 0; i < N; i++) {
                array[i] = aux[i];
            }
        }
        Arrays.stream(aux).forEach(System.out::println);
    }

    public int charAt(String s, int d) {
        if (d < s.length()) {
            return s.charAt(d);
        }
        return 0;
    }
}
