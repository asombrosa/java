package ds.stacks.genericIterableCode;

import java.util.Iterator;

public class Stack<S> implements Iterable<String> {

    Node head = null;

    @Override
    public Iterator<String> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<String> {

        private Node current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public String next() {
            String item = current.data;
            current = current.next;
            return item;
        }
    }

    public static class Node {
        String data;
        Node next;
    }

    public String pop() {
        if (head == null)
            return null;
        Node temp = head.next;
        String item = temp.data;
        head = head.next;
        temp = null;
        return item;
    }

    public void push(String data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            stringBuilder.append(temp.data).append(" ");
            temp = temp.next;
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }
}
