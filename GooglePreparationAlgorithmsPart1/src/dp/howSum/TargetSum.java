package dp.howSum;

import java.util.ArrayList;
import java.util.List;

/*
7 : [5, 3, 4, 7]
Output : [3, 4] or  [7]

8: [2, 3, 5]
Output : [2, 2, 2, 2] or [3, 5]

7 : [2, 4]
Output : null

0 : [1, 2 , 3]
Output : []

Time complexity : O(n ^ m * m)
Space complexity : O(m)
 */
public class TargetSum {
    List<Integer> list;

    TargetSum() {
        list = new ArrayList<>();
    }

    public List<Integer> howSum(int targetSum, Integer[] numbers) {
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
                return list;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TargetSum targetSum = new TargetSum();
        System.out.println(targetSum.howSum(7, new Integer[]{2, 3}));
        targetSum = new TargetSum();
        System.out.println(targetSum.howSum(7, new Integer[]{5, 3, 4, 7}));
        targetSum = new TargetSum();
        System.out.println(targetSum.howSum(7, new Integer[]{2, 4}));
        targetSum = new TargetSum();
        System.out.println(targetSum.howSum(8, new Integer[]{2, 3, 5}));
        targetSum = new TargetSum();
        System.out.println(targetSum.howSum(300, new Integer[]{7, 14}));
    }
}
