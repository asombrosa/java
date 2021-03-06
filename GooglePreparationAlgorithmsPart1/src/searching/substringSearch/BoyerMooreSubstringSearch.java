package searching.substringSearch;

public class BoyerMooreSubstringSearch {
    private final int M;
    private final String pattern;
    private final int[] right;

    BoyerMooreSubstringSearch(String pattern) {
        int r = 256;
        this.pattern = pattern;
        this.M = pattern.length();
        right = new int[r];
        for (int c = 0; c < r; c++) {
            right[c] = -1;
        }

        for (int c = 0; c < M; c++) {
            right[pattern.charAt(c)] = c;
        }
    }

    private int search(String text) {
        int N = text.length();
        int skip;
        for (int i = 0; i <= N - M; i += skip) {
            skip = 0;
            for (int j = M - 1; j >= 0; j--) {
                if (pattern.charAt(j) != text.charAt(i + j)) {
                    skip = Math.max(1, j - right[text.charAt(i + j)]);
                    break;
                }
            }
            if (skip == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BoyerMooreSubstringSearch algo = new BoyerMooreSubstringSearch("abra");
        int index = algo.search("abacadabrac");
        System.out.println(index);
        algo = new BoyerMooreSubstringSearch("ababac");
        index = algo.search("aabacaababacaa");
        System.out.println(index);
    }
}
