package searching.substringSearch;

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
