package com.DataStructures;
 class LinkedLists {

    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    Node head;
    Node tail;
    void pushBegin(int key) {
        Node n = new Node(key);
        if(head != null) {
            n.next = this.head;
            this.head = n;
            System.out.println("inserting");
            System.out.println(head.data);
        }
        else {
            this.head = n;
            this.tail = n;
            System.out.println("inserting first");
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
            System.out.printf("%d>", temp.data);
            temp = temp.next;
        }
    }


}
