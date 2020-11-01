package com.stacks;

public class StacksRunner {
    public static void main(String[] args) {
        int maxSizeOfStack = 10;
        StacksUsingArray stack = new StacksUsingArray(maxSizeOfStack);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.push(11);
        stack.push(12);
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
