package ds.queues.circlularQueue.usingArray;

public class CircularQueue {
    int[] queue;
    int frontPointer = -1;
    int backPointer = -1;
    int size = 0;

    public CircularQueue(int size) {
        queue = new int[size];
    }

    public boolean isFull() {
        return size == queue.length;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int value) {
        if(isFull()) {
            System.out.println("Queue is full. Cannot enqueue");
            return;
        }
        if(frontPointer == -1) {
            frontPointer++;
        }
        if(backPointer + 1 == queue.length) {
            backPointer = -1;
        }
        queue[++backPointer] = value;
        size++;
    }

    public void dequeue(){
        if(isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue");
            return;
        }
        ++frontPointer;
        if(frontPointer == queue.length){
            frontPointer = -1;
        }
        size--;
    }

    public void print() {
        if(isEmpty()){
            System.out.println("[ ]");
            return;
        }
        if(frontPointer < backPointer) {
            for(int i = frontPointer; i<=backPointer;i++) {
                System.out.print(queue[i] + " ");
            }
        } else {
            for(int i = frontPointer; i<queue.length;i++) {
                System.out.print(queue[i] + " ");
            }
            for(int i = 0; i<=backPointer;i++) {
                System.out.print(queue[i] + " ");
            }
        }
        System.out.println();
    }
}
