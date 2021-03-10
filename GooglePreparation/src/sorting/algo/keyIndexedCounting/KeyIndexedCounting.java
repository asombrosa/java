package sorting.algo.keyIndexedCounting;

/*
Steps:
    1. populate count[] array with frequency
    2. store count[] with cumulative frequency
    3. populate aux[] array with characters using count[char]
    4. increment count[char] in the same step
    5. copy aux[] to initial array[]

Time complexity : O(N * R)
 */
public class KeyIndexedCounting {
    public static void main(String[] args) {
        char[] array = "dacffbdbfbea".toCharArray();
        KeyIndexedCounting keyIndexedCounting = new KeyIndexedCounting();
        System.out.println(array);
        keyIndexedCounting.sort(array, 6);
    }

    public void sort(char[] arrChars, int R) {
        int N = arrChars.length;
        int[] count = new int[R + 1];
        char[] aux = new char[N];
        for (int val : arrChars) {
            count[val - 97 + 1]++;
        }
        for (int i = 0; i < R; i++) {
            count[i + 1] += count[i];
        }
        for (char arrChar : arrChars) {
            aux[count[arrChar - 97]++] = arrChar;
        }
        System.out.println(aux);
    }
}
