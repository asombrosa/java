package dp.fibonacci;

/*
Time complexity : O(2 ^n)
Space complexity : O(n)
 */
public class Fibonacci {
    public int fib(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fib(7));
        System.out.println(fibonacci.fib(10));
        System.out.println(fibonacci.fib(45));
    }
}
