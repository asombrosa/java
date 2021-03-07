package dp.fibonacci;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/*
Time complexity : O(n)
Space complexity : O(n)
 */
public class MemoizedFibonacci {
    BigInteger arr[];
    MemoizedFibonacci(){
        arr = new BigInteger[100];
    }

    public BigInteger fib(int n) {
        if(arr[n] != null) {
            return arr[n];
        }
        if(n <= 2) {
            return BigInteger.ONE;
        }
        arr[n] = fib(n - 1).add(fib(n - 2));
        return arr[n];
    }

    public static void main(String[] args) {
        MemoizedFibonacci memoizedFibonacci = new MemoizedFibonacci();
        System.out.println(memoizedFibonacci.fib(6));
        System.out.println(memoizedFibonacci.fib(10));
        System.out.println(memoizedFibonacci.fib(50));

    }
}
