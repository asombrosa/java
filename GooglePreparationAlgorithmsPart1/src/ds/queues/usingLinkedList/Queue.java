package ds.queues.usingLinkedList;

public class Queue {
    Node head = null;
    Node tail = null;

    class Node {
        String data;
        Node next;
    }

    public String dequeue() {
        if (head == null) {
            return "";
        }
        Node temp = head;
        String item = temp.data;
        head = head.next;
        return item;
    }

    public void enqueue(String data){
        Node temp = new Node();
        temp.data = data;
        temp.next = null;
        if(head == null){
            head = temp;
            tail = temp;
            return;
        }
        tail.next = temp;
        tail = temp;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        Node cursor = head;
        while(cursor != null){
            stringBuilder.append(cursor.data).append(" ");
            cursor = cursor.next;
        }
        return stringBuilder.toString();
    }
}
