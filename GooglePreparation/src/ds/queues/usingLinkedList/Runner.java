package ds.queues.usingLinkedList;

public class Runner {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue("First element");
        queue.enqueue("Second element");
        queue.enqueue("Third element");
        queue.enqueue("Fourth element");
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        queue.enqueue("Fifth element");
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        queue.enqueue("Sixth element");
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
    }
}