package searching.substringSearch;

public class BruteForceSubstringSearch {
    public int search(String pattern, String text) {
        int M = pattern.length();
        int N = text.length();
        for (int i = 0; i <= N - M; i++) {
            int j;
            for (j = 0; j < M; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == M) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BruteForceSubstringSearch bruteForceSubstringSearch = new BruteForceSubstringSearch();
        String text = "abacadabrac";
        String pattern = "abra";
        int index = bruteForceSubstringSearch.search(pattern, text);
        System.out.println(index);
    }
}
