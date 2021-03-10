package dp.construct.canConstruct;

/*
target : 'abcdef' , ['ab', 'abc', 'cd', 'def', 'abcd']
Output : true

target : 'skateboard' , ['bo', 'rd', 'ate', 't', 'ska', 'sk', 'boar']
Output : false

target : '' , ['ab', 'abc', 'cd', 'def', 'abcd']
Output : true

Time complexity : O(n * m)
Space complexity : O(m)
 */
public class CanConstructTabulizedVersion {

    public boolean canConstruct(String target, String[] strings) {
        boolean[] array = new boolean[target.length() + 1];
        array[0] = true;
        for(int i=0; i<= target.length(); i++) {
            for(String string : strings) {
                if(array[i] &&
                target.substring(i).startsWith(string) && (i + string.length()) <= target.length()) {
                    array[i + string.length()] = true;
                }
            }
        }
        return array[target.length()];
    }

    public static void main(String[] args) {
        CanConstructTabulizedVersion canConstruct = new CanConstructTabulizedVersion();
        System.out.println(canConstruct.canConstruct("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd"}));
        System.out.println(canConstruct.canConstruct("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
        System.out.println(canConstruct.canConstruct("", new String[]{"ab", "abc", "cd", "def", "abcd"}));
        System.out.println(canConstruct.canConstruct("enterapotentpot", new String[]{"a", "p", "ent", "enter", "ot", "o", "ot"}));
        System.out.println(canConstruct.canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef",
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
