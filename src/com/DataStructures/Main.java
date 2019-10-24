package com.DataStructures;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char ch = 'Y';
        Scanner sc = new Scanner(System.in);
        LinkedLists H = new LinkedLists();
        int choice;
        int innerchoice, x;
        System.out.println("What do you Want to choose");
        System.out.println("1.Linked List");
        System.out.println("2.Stack");
        System.out.println("3.Queue");
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
                            x = sc.nextInt();

                            H.pushEnd(x);
                            break;
                        case 2:
                            H.popBegin();
                            break;
                        case 3:
                            H.showList();
                            break;
                        case 4:
                            H.NumberOfNodes();
                            break;
                    }
                    System.out.println("Do You Want to Continue");
                    ch = sc.next().charAt(0);
                } while (ch == 'Y' || ch == 'y');
                break;
            case 3:
                do {

                    System.out.println("1.Insertion");
                    System.out.println("2.Deletion");
                    System.out.println("3.Show Queue");
                    System.out.println("4.Show Number of Data in Queue");
                    innerchoice = sc.nextInt();
                    switch (innerchoice) {
                        case 1:
                            System.out.println("Value You Want to insert");
                            x = sc.nextInt();
                            H.pushEnd(x);
                            break;
                        case 2:

                            H.popEnd();
                            break;
                        case 3:
                            H.showList();
                            break;
                        case 4:
                            H.NumberOfNodes();
                            break;
                    }
                    System.out.println("Do You Want to Continue");
                    ch = sc.next().charAt(0);
                } while (ch != 'N' || ch != 'n');
                break;
        }
    }
}

