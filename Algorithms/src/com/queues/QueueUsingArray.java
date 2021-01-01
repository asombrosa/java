package com.queues;

public class QueueUsingArray {
    private int head;
    private int tail;
    private int numberOfItems;
    private final int[] queue;

    public QueueUsingArray(int maxSizeOfQueue) {
        head = -1;
        tail = -1;
        numberOfItems = 0;
        queue = new int[maxSizeOfQueue];
    }

    private boolean isFull() {
        return numberOfItems == queue.length;
    }

    private boolean isEmpty() {
        return numberOfItems == 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("No space left to enqueue " + value);
            return;
        }
        if (tail == queue.length - 1) {
            tail = -1;
        }
        queue[++tail] = value;
        numberOfItems++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.print("No elements left to dequeue : ");
            return -1;
        }
        if (head == queue.length - 1) {
            head = -1;
        }
        numberOfItems--;
        return queue[++head];
    }

    public int peek() {
        return numberOfItems > 0 ? queue[head + 1] : -1;
    }
}
