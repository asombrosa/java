package dp.sum.bestSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Return the smallest combination of numbers
7 : [5, 3, 4, 7]
Output : [7] not [3,4]

8: [2, 3, 5]
Output : [3, 5] not [2, 2, 2, 2]

7 : [2, 4]
Output : null

0 : [1, 2 , 3]
Output : []

8 : [1, 3, 5, 7]
Output : [1, 7] or [3, 5]

Time complexity : O(m ^ 2 * n)
Space complexity : O(m ^ 2)
 */
public class BestSumMemoizedVersion {
    Map<Integer, List<Integer>> map;

    BestSumMemoizedVersion() {
        map = new HashMap<>();
    }

    public List<Integer> bestSum(int targetSum, Integer[] numbers) {
        if (map.containsKey(targetSum)) {
            return map.get(targetSum);
        }
        if (targetSum == 0) {
            return new ArrayList<>();
        }
        if (targetSum < 0) {
            return null;
        }
        List<Integer> shortestCombination = null;
        for (Integer num : numbers) {
            int rem = targetSum - num;
            List<Integer> remResult = bestSum(rem, numbers);
            if (remResult != null) {
                if (shortestCombination == null || remResult.size() < shortestCombination.size()) {
                    shortestCombination = new ArrayList<>(remResult);
                    shortestCombination.add(num);
                }
            }
        }

        map.put(targetSum, shortestCombination);
        return map.get(targetSum);
    }

    public static void main(String[] args) {
        BestSumMemoizedVersion targetSum = new BestSumMemoizedVersion();
        System.out.println(targetSum.bestSum(7, new Integer[]{5, 3, 4, 7})); // [7]
        targetSum = new BestSumMemoizedVersion();
        System.out.println(targetSum.bestSum(8, new Integer[]{2, 3, 5})); // [3, 5]
        targetSum = new BestSumMemoizedVersion();
        System.out.println(targetSum.bestSum(8, new Integer[]{1, 4, 5})); // [4, 4]
        targetSum = new BestSumMemoizedVersion();
        System.out.println(targetSum.bestSum(100, new Integer[]{1, 2, 25})); // [25, 25, 25, 25]
        targetSum = new BestSumMemoizedVersion();
        System.out.println(targetSum.bestSum(300, new Integer[]{7, 14})); // null

    }
}
