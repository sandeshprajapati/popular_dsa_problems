package com.org.linkedlist;

public class RotateALinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println();
        System.out.println("Original List:");
        printList(head);
        int k = 4;
        Node rotatedHead = rotate(head, k);
        System.out.println();
        System.out.println("Rotated List:");
        printList(rotatedHead);
    }

    private static Node rotate(Node head, int k) {
        // Get the length of the linked list
        int length = 1;
        Node tail = head;
        while (tail.next != null) {
            length++;
            tail = tail.next;
        }
        k = k % length;

        if (k == 0) {
            return head;
        }
        int splitPoint = length - k;
        Node current = head;
        for (int i = 1; i < splitPoint; i++) {
            current = current.next;
        }
        Node newHead = current.next;
        current.next = null;

        tail.next = head;

        return newHead;
    }

    private static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}