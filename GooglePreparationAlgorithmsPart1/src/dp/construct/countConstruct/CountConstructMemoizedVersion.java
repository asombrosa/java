package dp.construct.countConstruct;

import java.util.HashMap;
import java.util.Map;

/*
target : 'abcdef' , ['ab', 'abc', 'cd', 'def', 'abcd']
Output : 1

target : 'skateboard' , ['bo', 'rd', 'ate', 't', 'ska', 'sk', 'boar']
Output : 0

target : '' , ['ab', 'abc', 'cd', 'def', 'abcd']
Output : true

Time complexity : O(n * m ^2)
Space complexity : O(m * 2)
 */
public class CountConstructMemoizedVersion {

    Map<String, Integer> map;

    CountConstructMemoizedVersion() {
        map = new HashMap<>();
    }

    public int canConstruct(String target, String[] strings) {
        if (map.containsKey(target)) {
            return map.get(target);
        }
        if ("".equals(target)) {
            return 1;
        }
        int value = 0;
        for (String string : strings) {
            if (target.startsWith(string)) {
                String temp = target.replaceFirst(string, "");
                int val = canConstruct(temp, strings);
                value += val;
            }
        }
        map.put(target, value);
        return value;
    }

    public static void main(String[] args) {
        CountConstructMemoizedVersion canConstruct = new CountConstructMemoizedVersion();
        System.out.println(canConstruct.canConstruct("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd"}));
        System.out.println(canConstruct.canConstruct("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
        System.out.println(canConstruct.canConstruct("", new String[]{"ab", "abc", "cd", "def", "abcd"}));
        System.out.println(canConstruct.canConstruct("enterapotentpot", new String[]{"a", "p", "ent", "enter", "ot", "o", "t"}));
        System.out.println(canConstruct.canConstruct("purple", new String[]{"purp", "p", "ur", "le", "purpl"}));
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
