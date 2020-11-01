package com.stacks;

import java.util.Arrays;

public class StacksUsingArray {

    private int top;
    private int[] stack;

    public StacksUsingArray(int maxSizeOfStack) {
        top = -1;
        stack = new int[maxSizeOfStack];
    }

    public void push(int value) {
        if (top < stack.length - 1) {
            top++;
            stack[top] = value;
        } else {
            System.out.println("Stack Overflow: No place to put in new elements");
        }
    }

    public int pop() {
        if (top > -1) {
            stack[top] = 0;
            top--;
        } else {
            System.out.println("No elements to pop out");
        }
        return stack[top];
    }

    public int peek() {
        return stack[top];
    }

    @Override
    public String toString() {
        return "StacksUsingArray{" +
                "top=" + top +
                ", stack=" + Arrays.toString(stack) +
                '}';
    }
}
