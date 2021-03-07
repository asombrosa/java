package dp.sum.howSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
7 : [5, 3, 4, 7]
Output : [3, 4] or  [7]

8: [2, 3, 5]
Output : [2, 2, 2, 2] or [3, 5]

7 : [2, 4]
Output : null

0 : [1, 2 , 3]
Output : []

Time complexity : O(n * m * m) => O(n*m^2)
Space complexity : O(m * m) => O(m ^ 2)
 */
public class TargetSumMemoizedCode {
    List<Integer> list;
    Map<Integer, List<Integer>> map;

    TargetSumMemoizedCode() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }

    public List<Integer> howSum(int targetSum, Integer[] numbers) {
        if (map.containsKey(targetSum)) {
            return map.get(targetSum);
        }
        if (targetSum == 0) {
            return list;
        }
        if (targetSum < 0) {
            return null;
        }
        for (Integer num : numbers) {
            int rem = targetSum - num;
            if (howSum(rem, numbers) != null) {
                list.add(num);
                map.put(targetSum, list);
                return list;
            }
        }
        map.put(targetSum, null);
        return null;
    }

    public static void main(String[] args) {
        TargetSumMemoizedCode targetSum = new TargetSumMemoizedCode();
        System.out.println(targetSum.howSum(7, new Integer[]{2, 3}));
        targetSum = new TargetSumMemoizedCode();
        System.out.println(targetSum.howSum(7, new Integer[]{5, 3, 4, 7}));
        targetSum = new TargetSumMemoizedCode();
        System.out.println(targetSum.howSum(7, new Integer[]{2, 4}));
        targetSum = new TargetSumMemoizedCode();
        System.out.println(targetSum.howSum(8, new Integer[]{2, 3, 5}));
        targetSum = new TargetSumMemoizedCode();
        System.out.println(targetSum.howSum(300, new Integer[]{7, 14}));
    }
}
