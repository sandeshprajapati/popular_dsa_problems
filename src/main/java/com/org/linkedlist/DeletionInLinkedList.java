package com.org.linkedlist;

public class DeletionInLinkedList {
    public static void main(String[] args) {
        final Node head1 = getNode1();

        System.out.println();
        System.out.println("Original List:");
        printList(head1);
        int k = 3;

        Node newNode = deleteNth(head1, k);
        System.out.println();
        System.out.println("Delete nth List:");
        printList(newNode);

        System.out.println("Delete by Value:: 2");
        final Node head2 = getNode2();
        printList(head2);
        newNode = deleteByValue(head2, 2);
        printList(newNode);
        System.out.println("Delete Mid of Node");
        final Node head3 = getNode3();
        printList(head3);
        newNode = deleteMidNode(head3);
        printList(newNode);
    }


    private static Node deleteMidNode(Node head) {
        int m = findMidIndex(head);
        if (m == 0) {
            return head.next;
        }

        int index = 0;
        Node current = head;

        while (current != null && current.next != null) {
            if (index == m - 1) { // Stop at node before mid
                current.next = current.next.next; // Skip mid node
                break;
            }
            current = current.next;
            index++;
        }
        return head;
    }

    private static int findMidIndex(Node head) {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return (count / 2);
    }

    private static Node deleteByValue(Node head, int v) {
        Node current = head;
        while (current != null) {
            if (current.next.data == v) {
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }

        return head;
    }

    private static Node deleteNth(Node head, int k) {

        Node current = head;
        int count = 1;
        while (current != null) {
            count++;
            if (k == count) {
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }

        return head;
    }

    private static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    private static Node getNode1() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        return head;
    }

    private static Node getNode2() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        return head;
    }

    private static Node getNode3() {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        return head;
    }
}
