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
                Queue<Node> queue = new LinkedList<Node>();
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

    void ShowTree() {

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


}






