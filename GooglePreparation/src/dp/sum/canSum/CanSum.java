package dp.sum.canSum;

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

Time complexity : O(n ^ m)
Space complexity : O(m)
 */
public class CanSum {
    public boolean canSum(int targetSum, Integer[] numbers) {
        if(targetSum == 0) {
            return true;
        }
        if(targetSum < 0) {
            return false;
        }
        for(int num : numbers) {
            int rem = targetSum - num;
            if(canSum(rem, numbers)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CanSum canSum = new CanSum();
        System.out.println(canSum.canSum(7, new Integer[]{2, 3}));
        System.out.println(canSum.canSum(7, new Integer[]{5, 3, 4, 7}));
        System.out.println(canSum.canSum(7, new Integer[]{2, 4}));
        System.out.println(canSum.canSum(7, new Integer[]{2, 3, 5}));
        System.out.println(canSum.canSum(300, new Integer[]{7, 14}));
    }
}
