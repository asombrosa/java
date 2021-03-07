package dp.fibonacci;

import java.util.ArrayList;
import java.util.List;

/*
Time complexity : O(n)
Space complexity : O(n)
 */
public class MemoizedFibonacci {
    Integer arr[];
    MemoizedFibonacci(){
        arr = new Integer[100];
    }

    public int fib(int n) {
        if(arr[n] != null) {
            return arr[n];
        }
        if(n == 0 || n == 1) {
            return 1;
        }
        arr[n] = fib(n - 2) + fib(n - 1);
        return arr[n];
    }

    public static void main(String[] args) {
        MemoizedFibonacci memoizedFibonacci = new MemoizedFibonacci();
        System.out.println(memoizedFibonacci.fib(7));
        System.out.println(memoizedFibonacci.fib(10));
        System.out.println(memoizedFibonacci.fib(45));

    }
}
