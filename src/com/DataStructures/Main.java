package com.DataStructures;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        char ch='Y';
        Scanner sc= new Scanner(System.in);
        int choice;
        int innerchoice , x;
        System.out.println("What do you Want to choose");
        System.out.println("1.Linked List");
//        Todo: System.out.println("2.Stack");
//        Todo: System.out.println("3.Queue");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                   do { LinkedLists list = new LinkedLists();
                    System.out.println("1.Insert At Beginning");
                    System.out.println("2.Insert At Ending");
                    System.out.println("3.Delete At Beginning");
                    System.out.println("4.Delete At Ending");
                    System.out.println("5.Show List");

                    innerchoice=sc.nextInt();
                    switch(innerchoice) {
                        case 1:
                            System.out.println("Value You Want to insert at Begenning");
                            x = sc.nextInt();
                            list.pushBegin(x);
                            break;
                        case 2:
                            System.out.println("Value You Want to insert at Ending");
                            x = sc.nextInt();
                            list.pushEnd(x);
                            break;
                        case 3:
                            int l = list.popBegin().data;
                            System.out.println("The Data Deleted is : " + l);
                            break;
                        case 4:
                            l = list.popEnd().data;
                            System.out.println("The Data Deleted is : " + l);
                            break;
                        case 5:
                            System.out.println("The Linked list is : ");
                            list.showList();
                            break;

                    }


//                    System.out.println("Do You Want to Continue");
//                    ch=sc.next().charAt(0);
                }while(innerchoice<6);
                break;
//            case 2:
//                do {
//                    System.out.println("1.Insertion");
//                    System.out.println("2.Deletion");
//                    System.out.println("3.Show Stack");
//                    System.out.println("4.Show Number of Data in Stack");
//                    innerchoice=sc.nextInt();
//                    switch(innerchoice) {
//                        case 1: System.out.println("Value You Want to insert");
//                            x=sc.nextInt();
//
//                            H.insertAtEnd(x);
//                            break;
//                        case 2: H.deleteAtEnding();
//                            break;
//                        case 3: H.Show();
//                            break;
//                        case 4: H.NumberOfNodes();
//                            break;
//                    }
//                    System.out.println("Do You Want to Continue");
//                    ch=sc.next().charAt(0);
//                }while(ch=='Y'||ch=='y');
//                break;
//            case 3:
//                do {
//
//                    System.out.println("1.Insertion");
//                    System.out.println("2.Deletion");
//                    System.out.println("3.Show Queue");
//                    System.out.println("4.Show Number of Data in Queue");
//                    innerchoice=sc.nextInt();
//                    switch(innerchoice) {
//                        case 1: System.out.println("Value You Want to insert");
//                            x=sc.nextInt();
//                            H.insertAtEnd(x);
//                            break;
//                        case 2: H.deleteAtBegenning();
//                            break;
//                        case 3: H.Show();
//                            break;
//                        case 4: H.NumberOfNodes();
//                            break;
//                    }
//                    System.out.println("Do You Want to Continue");
//                    ch=sc.next().charAt(0);
//                }while(ch!='N'||ch!='n');
//                break;
        

    }
}
}







