package dp.construct.canConstruct;

import java.util.HashMap;
import java.util.Map;

/*
target : 'abcdef' , ['ab', 'abc', 'cd', 'def', 'abcd']
Output : true

target : 'skateboard' , ['bo', 'rd', 'ate', 't', 'ska', 'sk', 'boar']
Output : false

target : '' , ['ab', 'abc', 'cd', 'def', 'abcd']
Output : true

Time complexity : O(n * m^2)
Space complexity : O(m * 2)
 */
public class CanConstructMemoizedVersion {

    Map<String, Boolean> map;

    CanConstructMemoizedVersion() {
        map = new HashMap<>();
    }

    public boolean canConstruct(String target, String[] strings) {
        if (map.containsKey(target)) {
            return map.get(target);
        }
        if ("".equals(target)) {
            return true;
        }
        for (String string : strings) {
            if (target.startsWith(string)) {
                String temp = target.replaceFirst(string, "");
                if (canConstruct(temp, strings)) {
                    map.put(target, true);
                    return true;
                }
            }
        }
        map.put(target, false);
        return false;
    }

    public static void main(String[] args) {
        CanConstructMemoizedVersion canConstruct = new CanConstructMemoizedVersion();
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
