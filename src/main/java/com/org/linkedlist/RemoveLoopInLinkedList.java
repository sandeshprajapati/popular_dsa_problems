package com.org.linkedlist;

public class RemoveLoopInLinkedList {
    //Given the head of a linked list that may contain a loop.  A loop means that the last node of the linked list is connected back to a node in the same list. The task is to remove the loop from the linked list (if it exists).
    //
    //Custom Input format:
    //
    //A head of a singly linked list and a pos (1-based index) which denotes the position of the node to which the last node points to. If pos = 0, it means the last node points to null, indicating there is no loop.
    //
    //The generated output will be true if there is no loop in list and other nodes in the list remain unchanged, otherwise, false.
    //
    //Examples:
    //
    //Input: head = 1 -> 3 -> 4, pos = 2
    //Output: true
    //Explanation: The linked list looks like
    //
    //A loop is present in the list, and it is removed.
    public static void main(String[] args) {
        //head = 1 -> 3 -> 4, pos = 2

        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);
        // Creating a loop at position 2 (1-based index)
        head.next.next.next = head.next;
        removeLoop(head);
    }

    public static void removeLoop(Node head) {
        // code here
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                break;
            }
        }
        //No loop
        if (fast == null || fast.next == null) {
            return;
        }

        slow = head;
        if (slow == fast) {
            // Special case:: if loop start from first node
            while (fast.next != slow) {
                fast = fast.next;
            }
        } else {
            while (fast.next != slow.next) {
                slow = slow.next;
                fast = fast.next;
            }
        }
        //remove the loop
        fast.next = null;
    }

    public static boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // Move slow pointer by 1 step
            fast = fast.next.next;    // Move fast pointer by 2 steps

            if (slow == fast) {       // Loop detected
                return true;
            }
        }

        return false; // No loop
    }
}
