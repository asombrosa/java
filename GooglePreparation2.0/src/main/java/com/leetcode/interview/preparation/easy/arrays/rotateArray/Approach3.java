package com.leetcode.interview.preparation.easy.arrays.rotateArray;

/*
Using cyclic replacements
We can directly place every number of the array at its required correct position.
But if we do that, we will destroy the original element. Thus, we need to store the number
being replaced in a temp variable. Then, we can place the replaced number(temp)
at its correct position and so on, nn times, where nn is the length of array. We have chosen nn
to be the number of replacements since we have to shift all the elements of the array(which is nn).
But, there could be a problem with this method, if n%k=0 where k =k%n
(since a value of kk larger than nn eventually leads to a kk equivalent to k %n).
In this case, while picking up numbers to be placed at the correct position, we will eventually
reach the number from which we originally started. Thus, in such a case, when we hit the original
number's index again, we start the same process with the number following it.

Now let's look at the proof of how the above method works. Suppose, we have nn as the number
of elements in the array and kk is the number of shifts required. Further, assume n%k=0.
Now, when we start placing the elements at their correct position, in the first cycle all the
numbers with their index ii satisfying i %k = 0 get placed at their required position.
This happens because when we jump k steps every time, we will only hit the numbers k steps apart.
We start with index i = 0i=0, having i %k=0. Thus, we hit all the numbers satisfying the
above condition in the first cycle. When we reach back the original index, we have placed n/k
elements at their correct position, since we hit only that many elements in the first cycle.
Now, we increment the index for replacing the numbers. This time, we place other n/k
elements at their correct position, different from the ones placed correctly in the first cycle,
because this time we hit all the numbers satisfy the condition i % k = 1. When we hit the starting
number again, we increment the index and repeat the same process from i = 1 for all the indices
satisfying i%k==1. This happens till we reach the number with the index i%k=0 again, which
occurs for i=k. We will reach such a number after a total of kk cycles. Now, the total count
of numbers exclusive numbers placed at their correct position will be k * (n/k) = n
Thus, all the numbers will be placed at their correct position.

Complexity Analysis

Time complexity: O(n). Only one pass is used.

Space complexity: O(1). Constant extra space is used.
 */
public class Approach3 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }
}
