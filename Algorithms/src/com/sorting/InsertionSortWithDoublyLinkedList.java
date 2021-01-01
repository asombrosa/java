package com.sorting;

import com.linkedlist.doubly.DoublyLinkedList;
import com.linkedlist.doubly.Node;

public class InsertionSortWithDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        //Testing Suite 1: when neither head nor tail gets changed
        //Test case 1:
        doublyLinkedList.insertAtTail(2);
        doublyLinkedList.insertAtTail(4);
        doublyLinkedList.insertAtTail(3);
        doublyLinkedList.insertAtTail(5);
        System.out.println("Linked List Before Sorting :: ");
        doublyLinkedList.print();
        doublyLinkedList.reversePrint();
        sort(doublyLinkedList);
        System.out.println("Linked List After Sorting :: ");
        doublyLinkedList.print();
        doublyLinkedList.reversePrint();
        //Test case 2 :
        doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertAtTail(2);
        doublyLinkedList.insertAtTail(5);
        doublyLinkedList.insertAtTail(6);
        doublyLinkedList.insertAtTail(3);
        doublyLinkedList.insertAtTail(7);
        System.out.println("Linked List Before Sorting :: ");
        doublyLinkedList.print();
        doublyLinkedList.reversePrint();
        sort(doublyLinkedList);
        System.out.println("Linked List After Sorting :: ");
        doublyLinkedList.print();
        doublyLinkedList.reversePrint();

        //Testing Suite 2: when only head changes
        //Test case 1:
        doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertAtTail(2);
        doublyLinkedList.insertAtTail(4);
        doublyLinkedList.insertAtTail(1);
        doublyLinkedList.insertAtTail(5);
        System.out.println("Linked List Before Sorting :: ");
        doublyLinkedList.print();
        doublyLinkedList.reversePrint();
        sort(doublyLinkedList);
        System.out.println("Linked List After Sorting :: ");
        doublyLinkedList.print();
        doublyLinkedList.reversePrint();

        //Testing Suite 3: when only tail changes
        //Test case 1:
        doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertAtTail(2);
        doublyLinkedList.insertAtTail(4);
        doublyLinkedList.insertAtTail(5);
        doublyLinkedList.insertAtTail(3);
        System.out.println("Linked List Before Sorting :: ");
        doublyLinkedList.print();
        doublyLinkedList.reversePrint();
        sort(doublyLinkedList);
        System.out.println("Linked List After Sorting :: ");
        doublyLinkedList.print();
        doublyLinkedList.reversePrint();

        //Testing Suite 4: when both head tail changes
        //Test case 1:
        doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertAtTail(2);
        doublyLinkedList.insertAtTail(4);
        doublyLinkedList.insertAtTail(5);
        doublyLinkedList.insertAtTail(1);
        System.out.println("Linked List Before Sorting :: ");
        doublyLinkedList.print();
        doublyLinkedList.reversePrint();
        sort(doublyLinkedList);
        System.out.println("Linked List After Sorting :: ");
        doublyLinkedList.print();
        doublyLinkedList.reversePrint();

        //Testing Suite 5: All cases combined
        //Test case 1:
        doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertAtTail(5);
        doublyLinkedList.insertAtTail(3);
        doublyLinkedList.insertAtTail(6);
        doublyLinkedList.insertAtTail(2);
        doublyLinkedList.insertAtTail(4);
        doublyLinkedList.insertAtTail(1);
        System.out.println("Linked List Before Sorting :: ");
        doublyLinkedList.print();
        doublyLinkedList.reversePrint();
        sort(doublyLinkedList);
        System.out.println("Linked List After Sorting :: ");
        doublyLinkedList.print();
        doublyLinkedList.reversePrint();
        //Test case 2:
        doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertAtTail(6);
        doublyLinkedList.insertAtTail(4);
        doublyLinkedList.insertAtTail(2);
        doublyLinkedList.insertAtTail(8);
        doublyLinkedList.insertAtTail(3);
        doublyLinkedList.insertAtTail(5);
        System.out.println("Linked List Before Sorting :: ");
        doublyLinkedList.print();
        doublyLinkedList.reversePrint();
        sort(doublyLinkedList);
        System.out.println("Linked List After Sorting :: ");
        doublyLinkedList.print();
        doublyLinkedList.reversePrint();
    }

    private static void sort(DoublyLinkedList doublyLinkedList) {
        Node current = doublyLinkedList.getHead();
        while (current != null) {
            Node previous = current.getPreviousNode();
            while (previous != null && (previous.getData() > current.getData())) {
                previous = previous.getPreviousNode();
            }
            if (!(previous == (current.getPreviousNode()))) {
                if (current.getPreviousNode() != null) {
                    current.getPreviousNode().setNextNode(current.getNextNode());
                }
                if (current.getNextNode() != null) {
                    current.getNextNode().setPreviousNode(current.getPreviousNode());
                } else {//tail changes
                    doublyLinkedList.setTail(current.getPreviousNode());
                }
                if (previous != null) {
                    current.setNextNode(previous.getNextNode());
                    previous.getNextNode().setPreviousNode(current);
                    previous.setNextNode(current);
                } else {//head changes
                    doublyLinkedList.getHead().setPreviousNode(current);
                    current.setNextNode(doublyLinkedList.getHead());
                    doublyLinkedList.setHead(current);
                }
                current.setPreviousNode(previous);
            }
            current = current.getNextNode();
        }
    }

}