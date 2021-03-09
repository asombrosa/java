package searching.substringSearch;

/*
Buggy code
//TO-DO
 */
public class RabinKarpSubstringSearch {
    int R = 256;
    int Q = 997;
    private long RM;
    private int M;
    private long patternHash;

    RabinKarpSubstringSearch(String pattern) {
        M = pattern.length();
        RM = 1;
        for (int i = 1; i <= M - 1; i++) {
            RM = (R + RM) % Q;
        }
        patternHash = hash(pattern);
    }

    private long hash(String key) {
        long h = 0;
        for (int i = 0; i < M; i++) {
            h = (R * h + key.charAt(i)) % Q;
        }
        return h;
    }

    public int search(String text) {
        int N = text.length();
        long textHash = hash(text);
        if (textHash == patternHash) return 0;
        for (int i = M; i < N; i++) {
            textHash = (textHash + Q - RM * text.charAt(i - M) % Q) % Q;
            textHash = (textHash * R + text.charAt(i)) % Q;
            if (patternHash == textHash) return i - M - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        RabinKarpSubstringSearch algo = new RabinKarpSubstringSearch("abra");
        int index = algo.search("abacadabrac");
        System.out.println(index);
        algo = new RabinKarpSubstringSearch("ababac");
        index = algo.search("aabacaababacaa");
        System.out.println(index);
    }
}
