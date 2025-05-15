package com.org.linkedlist;

public class KthEndLinkedList {
    //Given the head of a linked list and the number k, Your task is to find the kth node from the end. If k is more than the number of nodes, then the output should be -1.
    //
    //Examples
    //
    //Input: LinkedList: 1->2->3->4->5->6->7->8->9, k = 2
    //Output: 8
    //Explanation: The given linked list is 1->2->3->4->5->6->7->8->9. The 2nd node from end is 8.
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println(getKthFromLast(head, 2));
        System.out.println(getKthFromLast(head, 2));

    }

    public static int getKthFromLast(Node head, int k) {
        // Your code here
        int size = 0;
        Node current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        if (size < k) {
            return -1;
        }

        Node temp = head;
        int target = size - k;
        for (int i = 0; i < target; i++) {
            temp = temp.next;
        }

        return temp.data;
    }

    public static int getKthFromLast1(Node head, int k) {
        // Your code here

        Node slow = head;
        Node fast = head;
        while (k > 0) {
            fast = fast.next;
            k++;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow != null ? slow.data : -1;
    }

}
