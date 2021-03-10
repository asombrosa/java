package ds.queues.circlularQueue.usingArray;

public class Runner {
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.enqueue(1);
        circularQueue.enqueue(2);
        circularQueue.enqueue(3);
        circularQueue.enqueue(4);
        circularQueue.enqueue(5);
        circularQueue.print();
        circularQueue.enqueue(6);
        circularQueue.print();
        circularQueue.dequeue();
        circularQueue.print();
        circularQueue.enqueue(6);
        circularQueue.print();
        circularQueue.enqueue(7);
        circularQueue.print();
        circularQueue.dequeue();
        circularQueue.dequeue();
        circularQueue.dequeue();
        circularQueue.dequeue();
        circularQueue.dequeue();
        circularQueue.print();
        circularQueue.dequeue();
        circularQueue.print();
    }
}
