package dp.construct.allConstruct;

import java.util.ArrayList;
import java.util.List;

/*
target : 'purple' , ['purp', 'p', 'ur', 'le', 'purpl']
Output : [
            ["purp", "le"],
            ["p", "ur", "p", "le"]
          ]

target : 'abcdef' , ['ab', 'abc', 'cd', 'def', 'abcd', 'ef', 'c']
Output : [
            ["ab", "cd", "ef"],
            ["ab", "c", "def"],
            ["abc", "def"],
            ["abcd", "ef"]
         ]

Time complexity : O(n ^ m * m)
Space complexity : O(m * m)
 */
public class AllConstruct {

    public List<List<String>> allConstruct(String target, String[] strings) {
        if ("".equals(target)) {
            List<List<String>> tempList = new ArrayList<>();
            tempList.add(new ArrayList<>());
            return tempList;
        }
        List<List<String>> list = new ArrayList<>();
        for (String string : strings) {
            if (target.startsWith(string)) {
                String temp = target.replaceFirst(string, "");
                List<List<String>> values = allConstruct(temp, strings);
                for (List<String> value : values) {
                    value.add(0, string);
                }
                list.addAll(values);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        AllConstruct canConstruct = new AllConstruct();
        System.out.println(canConstruct.allConstruct("abcdef",
        new String[]{"ab", "abc", "cd", "def", "abcd", "ef", "c"}));
        System.out.println(canConstruct.allConstruct("skateboard",
        new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
        System.out.println(canConstruct.allConstruct("",
        new String[]{"ab", "abc", "cd", "def", "abcd"}));
        System.out.println(canConstruct.allConstruct("enterapotentpot",
        new String[]{"a", "p", "ent", "enter", "ot", "o", "t"}));
        System.out.println(canConstruct.allConstruct("purple",
        new String[]{"purp", "p", "ur", "le", "purpl"}));
        System.out.println(canConstruct.allConstruct("eeeeeeeeeeeeeeeeeeeeeeeef",
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
