package dp.canSum;

import java.util.HashMap;
import java.util.Map;

/*
Get target sum using some numbers of the array.
Return boolean if possible
[5,3,4,7] : target sum : 7
output : yes (3 + 4) (7)

               7
        -5 / |-3 |-4 \ -7
          2  4   3    0
           -4|   |-3
             0   0

[2,4] : target sum : 7
output : no

Note : all numbers are positive
       We can use numbers in array any number of times

Time complexity : O(n)
Space complexity : O(m)
 */
public class TargetSumMemoizedCode {
    Map<Integer, Boolean> map;
    TargetSumMemoizedCode() {
        map = new HashMap<>();
    }
    public boolean canSum(int targetSum, Integer[] numbers) {
        if(map.containsKey(targetSum)){
            return map.get(targetSum);
        }
        if(targetSum == 0) {
            return true;
        }
        if(targetSum < 0) {
            return false;
        }
        for(int num : numbers) {
            int rem = targetSum - num;
            if(canSum(rem, numbers)) {
                map.put(targetSum, true);
                return true;
            }
        }
        map.put(targetSum, false);
        return false;
    }

    public static void main(String[] args) {
        TargetSumMemoizedCode targetSum = new TargetSumMemoizedCode();
        System.out.println(targetSum.canSum(7, new Integer[]{2, 3}));
        targetSum = new TargetSumMemoizedCode();
        System.out.println(targetSum.canSum(7, new Integer[]{5, 3, 4, 7}));
        targetSum = new TargetSumMemoizedCode();
        System.out.println(targetSum.canSum(7, new Integer[]{2, 4}));
        targetSum = new TargetSumMemoizedCode();
        System.out.println(targetSum.canSum(7, new Integer[]{2, 3, 5}));
        targetSum = new TargetSumMemoizedCode();
        System.out.println(targetSum.canSum(300, new Integer[]{7, 14}));
    }
}
