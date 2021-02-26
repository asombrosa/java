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
        Node temp = head.next;
        String item = temp.data;
        head = head.next;
        temp = null;
        return item;
    }

    public void enqueue(String data){
        Node temp = new Node();
        temp.data = data;
        if(head == null){
            head = temp;
            tail = temp;
            return;
        }
        Node cursor = head;
        while(cursor.next != null){
            cursor = cursor.next;
        }
        cursor.next = temp;
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
