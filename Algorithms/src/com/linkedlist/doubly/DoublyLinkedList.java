package com.linkedlist.doubly;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.setPreviousNode(null);
        if (this.head == null) {
            newNode.setNextNode(null);
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.setNextNode(this.head);
            this.head.setPreviousNode(newNode);
            this.head = newNode;
        }
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

    public void print() {
        Node head = this.getHead();
        while (head != null) {
            System.out.print(head.getData() + " ");
            head = head.getNextNode();
        }
        System.out.println();
    }

    public void reversePrint() {
        Node tail = this.getTail();
        while (tail != null) {
            System.out.print(tail.getData() + " ");
            tail = tail.getPreviousNode();
        }
        System.out.println();
    }
}
