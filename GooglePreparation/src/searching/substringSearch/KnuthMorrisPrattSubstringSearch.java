package searching.substringSearch;

/*
Deterministic non finite automata (dfa)
Steps:
    1. Create dfa for pattern
        a) assign 1 value to [char at 0][0]
        b) copy entire column to next
        c) change value of [char at j+1][j] to j+1
    2. Look up value in array[][]
    3. If j == M(pattern length) then found in text
Time complexity : O(M) => where M is size of pattern
 */
public class KnuthMorrisPrattSubstringSearch {
    private final int R;
    String pattern;
    int M;
    int[][] dfa;

    KnuthMorrisPrattSubstringSearch(String pattern) {
        this.pattern = pattern;
        this.R = 256;
        this.M = pattern.length();
        dfa = new int[R][M];
        dfa[pattern.charAt(0)][0] = 1;
        for (int X = 0, j = 1; j < M; j++) {
            for (int c = 0; c < R; c++) {
                dfa[c][j] = dfa[c][X];
            }
            dfa[pattern.charAt(j)][j] = j + 1;
            X = dfa[pattern.charAt(j)][X];
        }
    }

    public static void main(String[] args) {
        KnuthMorrisPrattSubstringSearch algo = new KnuthMorrisPrattSubstringSearch("ababac");
        int index = algo.search("aabacaababacaa");
        System.out.println(index);
    }

    public int search(String text) {
        int n = text.length();
        int i, j;
        for (i = 0, j = 0; i < n && j < M; i++) {
            j = dfa[text.charAt(i)][j];
        }
        if (j == M) {
            return i - M;
        }
        return -1;
    }
}
