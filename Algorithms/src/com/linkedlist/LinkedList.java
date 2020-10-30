package com.linkedlist;

public class LinkedList {
    private Node head;

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    public void insertAtEnd(int data) {
        Node current = this.head;
        if (current == null) {
            insertAtHead(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.setNextNode(null);
        while (current != null && current.getNextNode() != null) {
            current = current.getNextNode();
        }
        assert current != null;
        current.setNextNode(newNode);
    }

    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        int currPos = 1;
        if(position < 0){
            System.out.println("Invalid position: " + position);
            return;
        }
        if (position == 1) {
            insertAtHead(data);
        } else {
            Node current = this.head;
            while (current != null && currPos < position - 1) {
                current = current.getNextNode();
                currPos++;
            }
            if (current == null) {
                System.out.println("Invalid position : " + position);
            } else {
                newNode.setNextNode(current.getNextNode());
                current.setNextNode(newNode);
            }
        }
    }

    public int length() {
        int length = 0;
        Node current = this.head;
        while (current != null) {
            length++;
            current = current.getNextNode();
        }
        return length;
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
        return result.toString();
    }
}
