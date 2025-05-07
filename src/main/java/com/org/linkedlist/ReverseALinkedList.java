package com.org.linkedlist;

public class ReverseALinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println();
        System.out.println("Original List:");
        printList(head);
        Node rotatedHead = reverse(head);
        System.out.println();
        System.out.println("Rotated List:");
        printList(rotatedHead);
    }

    private static Node reverse(Node head) {
        Node current = head;
        Node previous = null;

        while (current != null) {
            //store next
            Node temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;


        }
        return previous;
    }

    private static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
