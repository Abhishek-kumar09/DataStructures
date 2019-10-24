package com.DataStructures;

public class LinkedLists {
    Node head;
    Node tail;
    class Node {
        int data;
        Node next;
        Node(int d) {
            data =d; next =null;
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
        if(tail == null) {
            head = n;
            tail = n;

        }
        else {
            tail.next = n;
            tail =n;
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
            temp=temp.next;
        }
    }
    int NumberOfNodes()
    {
        Node tmpry=head;
        int count=1;
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        else {
            while(tmpry.next!=null)
            {
                tmpry=tmpry.next;
                count++;
            }
            System.out.println(count);
        }
        return count;
    }


}
