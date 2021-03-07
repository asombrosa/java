package dp.bestSum;

import java.util.ArrayList;
import java.util.List;

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

Time complexity : O(n ^ m * m)
Space complexity : O(m * m) => O(m ^ 2)
 */
public class TargetSum {
    List<Integer> list;

    TargetSum() {
        list = new ArrayList<>();
    }

    public List<Integer> bestSum(int targetSum, Integer[] numbers) {
        if (targetSum == 0) {
            list = new ArrayList<>();
            return list;
        }
        if (targetSum < 0) {
            return null;
        }
        List<Integer> shortestCombination = null;
        for (Integer num : numbers) {
            int rem = targetSum - num;
            List<Integer> remResult = bestSum(rem, numbers);
            if(remResult != null) {
                list.add(num);
                if (shortestCombination == null || list.size() < shortestCombination.size()) {
                    shortestCombination = list;
                }
            }
        }
        return shortestCombination;
    }

    public static void main(String[] args) {
        TargetSum targetSum = new TargetSum();
        System.out.println(targetSum.bestSum(7, new Integer[]{5, 3, 4, 7})); // [7]
        targetSum = new TargetSum();
        System.out.println(targetSum.bestSum(8, new Integer[]{2, 3, 5})); // [3, 5]
        targetSum = new TargetSum();
        System.out.println(targetSum.bestSum(8, new Integer[]{1, 4, 5})); // [4, 4]
        targetSum = new TargetSum();
        System.out.println(targetSum.bestSum(100, new Integer[]{1, 2, 25})); // [25, 25, 25, 25]
        targetSum = new TargetSum();
        System.out.println(targetSum.bestSum(300, new Integer[]{7, 14})); // null

    }
}
