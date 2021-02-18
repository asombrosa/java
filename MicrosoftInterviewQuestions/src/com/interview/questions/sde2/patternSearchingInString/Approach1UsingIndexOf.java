package com.interview.questions.sde2.patternSearchingInString;

/*

Input:  txt[] = "THIS IS A TEST TEXT"
        pat[] = "TEST"
Output: Pattern found at index 10

Input:  txt[] =  "AABAACAADAABAABA"
        pat[] =  "AABA"
Output: Pattern found at index 0
        Pattern found at index 9
        Pattern found at index 12
pattern-searching

 */
public class Approach1UsingIndexOf {
    public static void main(String[] args) {
        //String testString = "THIS IS A TEST TEXT";
        //String patternToBeSearched = "TEST";
        String testString = "AABAACAADAABAABA";
        String patternToBeSearched = "AABA";
        int index = 0;
        while (index < testString.length()) {
            index = testString.indexOf(patternToBeSearched, index);
            if (index == -1) {
                break;
            }
            System.out.println(index);
            index = index + 1;
        }
    }
}
