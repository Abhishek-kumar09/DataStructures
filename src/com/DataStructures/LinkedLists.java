package com.DataStructures;

public class LinkedLists {
    Node head;
    Node tail;
    class Node {
        int data;
        Node next;
        Node(int d) {
            this.data =d; this.next =null;
        }
    }
    void pushBegin(int key) {
        Node n = new Node(key);
        if(head != null) {
            n.next =head;
            head = n;
        }
        else {
            head =n;
            tail =n;
        }
    }
    void pushEnd(int key) {
        Node n = new Node(key);
        if(tail != null) {
            tail.next = n;
            tail =n;
        }
        else {
            head = n;
            tail = n;
        }
    }
    Node popBegin() {
        if(head != null) {
            head = head.next;
            return head;
        }
        else {
            System.out.println("UnderFlow, Put Some Data First");
            return null;
        }
    }
    Node popEnd() {
        if(tail != null) {
            Node temp = tail;
            while(temp.next.next != null) {
                temp = temp.next;
            }
            tail = temp;
            return temp.next;
        }
        else {
            System.out.println("UnderFlow, Put Some Data First");
            return null;
        }
    }
    void showList() {
        System.out.println("The List is : ");
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + ">");
        }
    }


}
