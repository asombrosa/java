package dp.construct.countConstruct;

/*
target : 'abcdef' , ['ab', 'abc', 'cd', 'def', 'abcd']
Output : 1

target : 'skateboard' , ['bo', 'rd', 'ate', 't', 'ska', 'sk', 'boar']
Output : 0

target : '' , ['ab', 'abc', 'cd', 'def', 'abcd']
Output : 1

Time complexity : O(n * m)
Space complexity : O(m)
 */
public class CountConstructTabulizedVersion {

    public int countConstruct(String target, String[] strings) {
        int[] array = new int[target.length() + 1];
        array[0] = 1;
        for(int i=0; i<= target.length(); i++) {
            for(String string : strings) {
                if(array[i] != 0 &&
                target.substring(i).startsWith(string) && (i + string.length()) <= target.length()) {
                    array[i + string.length()] += array[i];
                }
            }
        }
        return array[target.length()];
    }

    public static void main(String[] args) {
        CountConstructTabulizedVersion countConstruct = new CountConstructTabulizedVersion();
        System.out.println(countConstruct.countConstruct("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd"}));
        System.out.println(countConstruct.countConstruct("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
        System.out.println(countConstruct.countConstruct("", new String[]{"ab", "abc", "cd", "def", "abcd"}));
        System.out.println(countConstruct.countConstruct("enterapotentpot", new String[]{"a", "p", "ent", "enter", "ot", "o", "t"}));
        System.out.println(countConstruct.countConstruct("purple", new String[]{"purp", "p", "ur", "le", "purpl"}));
        System.out.println(countConstruct.countConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",
        new String[]{
        "e",
        "ee",
        "eee",
        "eeee",
        "eeeee",
        "eeeeee"
        }));
    }
}
