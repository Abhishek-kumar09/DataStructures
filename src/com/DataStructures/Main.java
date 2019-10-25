

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char ch = 'Y';
        Scanner sc = new Scanner(System.in);
        LinkedLists H = new LinkedLists();
        BinaryTree B= new BinaryTree();
        int choice;
        int innerchoice, x;
        System.out.println("What do you Want to choose");
        System.out.println("1.Linked List");
        System.out.println("2.Stack");
        System.out.println("3.Queue");
        System.out.println("4.Binary Tree");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                do {
                    System.out.println("1.Insert At Begening");
                    System.out.println("2.Insert At Ending");
                    System.out.println("3.Delete At Begenning");
                    System.out.println("4.Delete At Ending");
                    System.out.println("5.Show List");
                    System.out.println("6.Show Number of Data");
                    System.out.println("7.Exit");
                    innerchoice = sc.nextInt();
                    switch (innerchoice) {
                        case 1:
                            System.out.println("Value You Want to insert at Begenning");
                            x = sc.nextInt();
                            H.pushBegin(x);
                            break;
                        case 2:
                            System.out.println("Value You Want to insert at Ending");
                            x = sc.nextInt();
                            H.pushEnd(x);
                            break;
                        case 3:
                            H.popBegin();
                            break;
                        case 4:
                            H.popEnd();
                            break;
                        case 5:
                            H.showList();
                            break;
                        case 6:
                            H.pushBegin(1);
                            break;
                    }
                } while (innerchoice < 6);
                break;
            case 2:
                do {
                    System.out.println("1.Insertion");
                    System.out.println("2.Deletion");
                    System.out.println("3.Show Stack");
                    System.out.println("4.Show Number of Data in Stack");
                    innerchoice = sc.nextInt();
                    switch (innerchoice) {
                        case 1:
                            System.out.println("Value You Want to insert");
//                            x=sc.nextInt();

//                            H.insertAtEnd(x);
//                            break;
//                        case 2: H.deleteAtEnding();
//                            break;
//                        case 3: H.Show();
//                            break;
//                        case 4: H.NumberOfNodes();
//                            break;
                    }
                    System.out.println("Do You Want to Continue");
                    ch = sc.next().charAt(0);
                } while (ch == 'Y' || ch == 'y');
                break;
            case 3:
                do {
                    Queue q = new Queue();
                    System.out.println("1.Insertion");
                    System.out.println("2.Deletion");
                    System.out.println("3.Show Queue");
                    System.out.println("4.Show Number of Data in Queue");
                    innerchoice = sc.nextInt();
                    switch (innerchoice) {
                        case 1:
                            System.out.println("Value You Want to insert");
                            x = sc.nextInt();
                            q.enQueue(x);
                            break;
                        case 2:
                            x = sc.nextInt();
                            H.pushEnd(x);
                            break;
                        case 3:
                            H.popBegin();
                            break;
                        case 4:
                            H.popBegin();
                            break;
                    }
                    System.out.println("Do You Want to Continue");
                    ch = sc.next().charAt(0);
                } while (ch != 'N' || ch != 'n');
                break;
            case 4:
                do {
                    Queue q = new Queue();
                    System.out.println("1.Insertion In BinaryTree");
                    System.out.println("2.Deletion In Binary Tree");
                    System.out.println("3.Show Binary Tree ");
                    System.out.println("4.Exit");
                    innerchoice = sc.nextInt();
                    switch (innerchoice) {
                        case 1:
                            System.out.println("Value You Want to insert");
                            x = sc.nextInt();
                            B.insert(x);
                            break;
                        case 2:
                            x = sc.nextInt();
                            H.pushEnd(x);
                            break;
                        case 3:
                            System.out.println("1.Show In-Order Traversal");
                            System.out.println("2.Show Pre-Order Traversal");
                            System.out.println("3.Show Post-Order Traversal");
                            x = sc.nextInt();
                            switch (x) {
                                case 1 : B.printInOrder(B.root);break;
                                case 2 : B.printPreOrder(B.root);break;
                                case 3 : B.printPostorder(B.root);break;
                            }
                            break;
                    }
                } while (innerchoice < 4);
                break;
        }

    }
}


//package com.DataStructures;
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        char ch='Y';
//        Scanner sc= new Scanner(System.in);
//        int choice;
//        int innerchoice , x;
//        System.out.println("What do you Want to choose");
//        System.out.println("1.Linked List");
////        Todo: System.out.println("2.Stack");
////        Todo: System.out.println("3.Queue");
//        choice=sc.nextInt();
//        switch(choice)
//        {
//            case 1:
//                   do { LinkedLists list = new LinkedLists();
//                    System.out.println("1.Insert At Beginning");
//                    System.out.println("2.Insert At Ending");
//                    System.out.println("3.Delete At Beginning");
//                    System.out.println("4.Delete At Ending");
//                    System.out.println("5.Show List");
//                    System.out.println("6. Exit");
//                    sc.nextLine();
//                    innerchoice=sc.nextInt();
//                    switch(innerchoice) {
//
//                        case 1:sc.nextLine();
//                            System.out.println("Value You Want to insert at Begenning");
//                            x = sc.nextInt();
//                            list.pushBegin(x);
//                            break;
//                        case 2:sc.nextLine();
//                            System.out.println("Value You Want to insert at Ending");
//                            x = sc.nextInt();
//                            list.pushEnd(x);
//                            break;
//                        case 3:
//                            int l = list.popBegin().data;
//                            System.out.println("The Data Deleted is : " + l);
//                            break;
//                        case 4:
//                            l = list.popEnd().data;
//                            System.out.println("The Data Deleted is : " + l);
//                            break;
//                        case 5:
//                            System.out.println("The Linked list is : ");
//                            list.showList();
//                            break;
//
//                    }
//
//
////                    System.out.println("Do You Want to Continue");
////                    ch=sc.next().charAt(0);
//                }while(innerchoice<6);
//                break;
////            case 2:
////                do {
////                    System.out.println("1.Insertion");
////                    System.out.println("2.Deletion");
////                    System.out.println("3.Show Stack");
////                    System.out.println("4.Show Number of Data in Stack");
////                    innerchoice=sc.nextInt();
////                    switch(innerchoice) {
////                        case 1: System.out.println("Value You Want to insert");
////                            x=sc.nextInt();
////
////                            H.insertAtEnd(x);
////                            break;
////                        case 2: H.deleteAtEnding();
////                            break;
////                        case 3: H.Show();
////                            break;
////                        case 4: H.NumberOfNodes();
////                            break;
////                    }
////                    System.out.println("Do You Want to Continue");
////                    ch=sc.next().charAt(0);
////                }while(ch=='Y'||ch=='y');
////                break;
////            case 3:
////                do {
////
////                    System.out.println("1.Insertion");
////                    System.out.println("2.Deletion");
////                    System.out.println("3.Show Queue");
////                    System.out.println("4.Show Number of Data in Queue");
////                    innerchoice=sc.nextInt();
////                    switch(innerchoice) {
////                        case 1: System.out.println("Value You Want to insert");
////                            x=sc.nextInt();
////                            H.insertAtEnd(x);
////                            break;
////                        case 2: H.deleteAtBegenning();
////                            break;
////                        case 3: H.Show();
////                            break;
////                        case 4: H.NumberOfNodes();
////                            break;
////                    }
////                    System.out.println("Do You Want to Continue");
////                    ch=sc.next().charAt(0);
////                }while(ch!='N'||ch!='n');
////                break;
//
//
//    }
//}
//}
//
//
//
//
//
//
//
