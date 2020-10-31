package com.linkedlist.singly;

public class LinkedListRunner {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        //linkedList.insertAtHead(2);
        //linkedList.insertAtHead(3);
        //linkedList.insertAtHead(4);
        //linkedList.insertAtHead(5);
        //System.out.println(linkedList);
        //linkedList.insertAtEnd(1);
        //linkedList.insertAtEnd(2);
        //linkedList.insertAtEnd(3);
        //linkedList.insertAtEnd(4);
        //linkedList.insertAtEnd(5);
        //linkedList.insertAtEnd(1);
        //linkedList.insertAtEnd(2);
        //linkedList.insertAtEnd(4);
        //linkedList.insertAtEnd(5);
        //linkedList.insertAtPosition(3, 3);
        //linkedList.insertAtPosition(6, 6);
        //linkedList.insertAtPosition(8, 8);
        //linkedList.insertAtPosition(0, 1);
        //linkedList.insertAtPosition(-1, -1);
        //System.out.println(linkedList);
        //linkedList.deleteAtHead();
        //linkedList.deleteAtEnd();
        //linkedList.deleteAtPosition(-1);
        //System.out.println(linkedList);
        //linkedList.deleteAtPosition(10);
        //System.out.println(linkedList);
        //linkedList.deleteAtPosition(1);
        //System.out.println(linkedList);
        //linkedList.deleteAtPosition(6);
        //System.out.println(linkedList);
        //linkedList.deleteAtPosition(3);
        //System.out.println(linkedList);
        //linkedList.search(5);
        //linkedList.search(-15);
        //System.out.println(linkedList.length());
        linkedList.insertDataInSortedManner(50);
        linkedList.insertDataInSortedManner(30);
        linkedList.insertDataInSortedManner(10);
        linkedList.insertDataInSortedManner(40);
        linkedList.insertDataInSortedManner(60);
        linkedList.insertDataInSortedManner(20);
        System.out.println(linkedList);
    }
}
