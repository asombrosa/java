package dp.construct.canConstruct;

/*
target : 'abcdef' , ['ab', 'abc', 'cd', 'def', 'abcd']
Output : true

target : 'skateboard' , ['bo', 'rd', 'ate', 't', 'ska', 'sk', 'boar']
Output : false

target : '' , ['ab', 'abc', 'cd', 'def', 'abcd']
Output : true

Time complexity : O(n ^ m * m)
Space complexity : O(m * m)
 */
public class CanConstruct {

    public boolean canConstruct(String target, String[] strings) {
        if ("".equals(target)) {
            return true;
        }
        for (String string : strings) {
            if (target.startsWith(string)) {
                String temp = target.replaceFirst(string, "");
                if (canConstruct(temp, strings)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CanConstruct canConstruct = new CanConstruct();
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
