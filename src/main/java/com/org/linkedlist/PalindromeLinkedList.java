package com.org.linkedlist;

public class PalindromeLinkedList {
    //Given a head singly linked list of positive integers. The task is to check if the given linked list is palindrome or not.
    //
    //Examples:
    //
    //Input: head: 1 -> 2 -> 1 -> 1 -> 2 -> 1
    //Output: true
    //Explanation: The given linked list is 1 -> 2 -> 1 -> 1 -> 2 -> 1 , which is a palindrome and Hence, the output is true.
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(1);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(1);
        System.out.println(isPalindrome(head));
    }

    static boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head;

        //find mid
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = reversNode(slow);
        Node firstHalf = head;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            secondHalf = secondHalf.next;
            firstHalf = firstHalf.next;
        }

        return true;
    }

    private static Node reversNode(Node head) {
        Node previous = null;
        while (head != null) {
            Node nextNode = head.next;
            head.next = previous;
            previous = head;
            head = nextNode;
        }
        return previous;
    }
}
