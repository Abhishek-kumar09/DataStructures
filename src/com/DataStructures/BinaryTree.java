package com.DataStructures;

import java.util.Queue;
import java.util.LinkedList;

public class BinaryTree {
    Node root;

    class Node {
        Node left;
        Node right;
        int data;

        Node(int d) {
            this.data = d;
            this.left = null;
            this.right = null;
        }


    }

    void insert(int key) {
        Node N = new Node(key);
        if (root == null) {
            root = N;
        } else {

            {
                LinkedList<Node> queue = new LinkedList<Node>();
                queue.add(root);
                while (!queue.isEmpty()) {


                    Node tempNode = queue.poll();

                    if (tempNode.left != null) {
                        queue.add(tempNode.left);
                    } else {
                        tempNode.left = N;
                        break;
                    }

                    if (tempNode.right != null) {
                        queue.add(tempNode.right);
                    } else {
                        tempNode.right = N;
                        break;
                    }
                }
            }
        }
    }

    void printLevelTraversal() {

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    void printPostorder(Node node) {
        if (node == null)
            return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.data + " ");
    }

    void printPreOrder(Node root) {
        if(root == null) return;
        System.out.print(root.data + " ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }
    void printInOrder(Node root) {
        if(root == null) return;
        printInOrder(root.left);
        System.out.print(root.data + " ");
        printInOrder(root.right);
    }

}






