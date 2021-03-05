package sorting.algo.keyIndexedCounting;

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
