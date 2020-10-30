package com.linkedlist;

public class LinkedListRunner {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
//        linkedList.insertAtHead(2);
//        linkedList.insertAtHead(3);
//        linkedList.insertAtHead(4);
//        linkedList.insertAtHead(5);
//        System.out.println(linkedList);
//        linkedList.insertAtEnd(1);
//        linkedList.insertAtEnd(2);
//        linkedList.insertAtEnd(3);
//        linkedList.insertAtEnd(4);
//        linkedList.insertAtEnd(5);
        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(4);
        linkedList.insertAtEnd(5);
        linkedList.insertAtPosition(3, 3);
        linkedList.insertAtPosition(6, 6);
        linkedList.insertAtPosition(8, 8);
        linkedList.insertAtPosition(0, 1);
        linkedList.insertAtPosition(-1, -1);
        System.out.println(linkedList);
        //System.out.println(linkedList.length());
    }
}
