package com.org.linkedlist;

public class MiddleofLinkedList {

    public static void main(String[] args) {

    }

    int getMiddle(Node head) {
        // Your code here.
        Node slow = head, fast = head;

        // Move fast by 2 and slow by 1. When fast reaches end, slow will be at middle.
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow != null ? slow.data : -1;  // Slow points to the middle (second one if even length)
    }
}
