package dp.fibonacci;

import java.math.BigInteger;

/*
Time complexity : O(n + n) => O(n)
Space complexity : O(n)
 */
public class TabulizedFibonacci {
    public BigInteger fib(int n) {
        BigInteger[] array = new BigInteger[n + 1];
        for(int i = 0; i <= n; i++) {
            array[i] = BigInteger.ZERO;
        }
        array[1] = BigInteger.ONE;
        for (int i = 0; i < n - 1; i++) {
            array[i + 1] = array[i].add(array[i + 1]);
            array[i + 2] = array[i].add(array[i + 2]);
        }
        array[n] = array[n - 1].add(array[n - 2]);
        return array[n];
    }

    public static void main(String[] args) {
        TabulizedFibonacci fibonacci = new TabulizedFibonacci();
        System.out.println(fibonacci.fib(7));
        System.out.println(fibonacci.fib(10));
        System.out.println(fibonacci.fib(50));
    }
}
