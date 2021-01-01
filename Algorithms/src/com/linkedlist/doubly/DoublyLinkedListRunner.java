package com.linkedlist.doubly;

public class DoublyLinkedListRunner {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertAtHead(1);
        doublyLinkedList.insertAtHead(2);
        doublyLinkedList.insertAtHead(3);
        doublyLinkedList.insertAtHead(4);
        doublyLinkedList.insertAtHead(5);
        doublyLinkedList.print();
        doublyLinkedList.reversePrint();
        doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertAtTail(1);
        doublyLinkedList.insertAtTail(2);
        doublyLinkedList.insertAtTail(3);
        doublyLinkedList.insertAtTail(4);
        doublyLinkedList.insertAtTail(5);
        doublyLinkedList.print();
        doublyLinkedList.reversePrint();
    }
}
