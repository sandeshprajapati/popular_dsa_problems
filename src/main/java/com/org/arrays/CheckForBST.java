package com.org.arrays;

public class CheckForBST {
    //Given the root of a binary tree. Check whether it is a BST or not.
    //Note: We are considering that BSTs can not contain duplicate Nodes.
    //A BST is defined as follows:
    //
    //    The left subtree of a node contains only nodes with keys less than the node's key.
    //    The right subtree of a node contains only nodes with keys greater than the node's key.
    //    Both the left and right subtrees must also be binary search trees.
    //
    //Examples:
    //
    //Input: root = [2, 1, 3, N, N, N, 5]
    public static void main(String[] args) {

    }

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
