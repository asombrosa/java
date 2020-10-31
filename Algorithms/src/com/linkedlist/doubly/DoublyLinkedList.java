package com.linkedlist.doubly;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.setNextNode(this.tail);
        newNode.setPreviousNode(this.head);
        this.head = newNode;
        this.tail = newNode;
    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            insertAtHead(data);
            return;
        }
        if (tail != null) {
            Node current = this.tail;
            newNode.setNextNode(null);
            current.setNextNode(newNode);
            newNode.setPreviousNode(current);
            this.tail = newNode;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("{");
        Node current = this.head;
        while (current != null) {
            result.append(current.toString()).append(",");
            current = current.getNextNode();
        }
        result.deleteCharAt(result.length() - 1);
        result.append("}");
        result.append(",\n");
        current = this.tail;
        while (current != null) {
            result.append(current.toString()).append(",");
            current = current.getPreviousNode();
        }
        result.deleteCharAt(result.length() - 1);
        result.append("}");
        return result.toString();
    }
}
