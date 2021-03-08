package dp.sum.howSum;

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
public class HowSum {
    List<Integer> list;

    HowSum() {
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
        HowSum howSum = new HowSum();
        System.out.println(howSum.howSum(7, new Integer[]{2, 3}));
        howSum = new HowSum();
        System.out.println(howSum.howSum(7, new Integer[]{5, 3, 4, 7}));
        howSum = new HowSum();
        System.out.println(howSum.howSum(7, new Integer[]{2, 4}));
        howSum = new HowSum();
        System.out.println(howSum.howSum(8, new Integer[]{2, 3, 5}));
        howSum = new HowSum();
        System.out.println(howSum.howSum(300, new Integer[]{7, 14}));
    }
}
