package searching.substringSearch;

/*
Steps:
    1. Initialize :
        a) Initialize array with given radix (i.e 256) with -1
        b) Put last index of character of pattern in array[]
    2. Search :
        a) Iterate over the text and skip according to value in array[]
        b) If value in array is -1 skip 1

Time complexity : O(N * M)
 */
public class BoyerMooreSubstringSearch {
    private final int M;
    private final String pattern;
    private final int[] lastIndexOfCharacter;

    BoyerMooreSubstringSearch(String pattern) {
        int r = 256;
        this.pattern = pattern;
        this.M = pattern.length();
        lastIndexOfCharacter = new int[r];
        for (int c = 0; c < r; c++) {
            lastIndexOfCharacter[c] = -1;
        }

        for (int c = 0; c < M; c++) {
            lastIndexOfCharacter[pattern.charAt(c)] = c;
        }
    }

    private int search(String text) {
        int N = text.length();
        int skip;
        for (int i = 0; i <= N - M; i += skip) {
            skip = 0;
            for (int j = M - 1; j >= 0; j--) {
                if (pattern.charAt(j) != text.charAt(i + j)) {
                    skip = Math.max(1, j - lastIndexOfCharacter[text.charAt(i + j)]);
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
