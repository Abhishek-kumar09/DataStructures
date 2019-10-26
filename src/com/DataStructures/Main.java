
import java.util.Scanner;
public class Main {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       LinkedLists H = new LinkedLists();
        BinaryTree B= new BinaryTree();
        int choice;
        int innerchoice, x;
        int first=0;
        do {
        System.out.println("What do you Want to choose ");
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
                    System.out.println("8.<<Back");
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
                        case 7:
                        	first=1;break;
                        case 8:first=0;break;
                    }
                } while (innerchoice < 6);
                break;
            case 2:
                do {
                    System.out.println("1.Insertion");
                    System.out.println("2.Deletion");
                    System.out.println("3.Show Stack");
                    System.out.println("4.Show Number of Data in Stack");
                    System.out.println("5.<<Back");

                    innerchoice = sc.nextInt();
                    switch (innerchoice) {
                        case 1:
                            System.out.println("Value You Want to insert");
                            x=sc.nextInt();

                            H.pushEnd(x);
                            break;
                        case 2: H.popEnd();
                            break;
                        case 3: H.showList();
                            break;
                        case 4: H.pushBegin(1);
                            break;
                        case 5: first=0;break;
                    }
                } while (innerchoice<5);
                break;
            case 3:
                do {
                    System.out.println("1.Insertion");
                    System.out.println("2.Deletion");
                    System.out.println("3.Show Queue");
                    System.out.println("4.Show Number of Data in Queue");
                    System.out.println("5.<<Back");

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
                            H.pushBegin(1);
                            break;
                        case 5:
                        	first=0;
                        	break;
                    }
                 
                } while (innerchoice<5);
                break;
            case 4:
                do {
                	int flag;
					do {
                    	 flag=0;
                    System.out.println("1.Insertion In BinaryTree");
                    System.out.println("2.Deletion In Binary Tree");
                    System.out.println("3.Show Binary Tree ");
                    System.out.println("4.Exit");
                    System.out.println("5.<<Back");

                    
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
                            System.out.println("4.<<Back");
                            x = sc.nextInt();
                            switch (x) {
                                case 1 : B.printInOrder(B.root);break;
                                case 2 : B.printPreOrder(B.root);break;
                                case 3 : B.printPostorder(B.root);break;
                                case 4 : flag=0;break;
                            }
                        case 4: first=0;break;
                    }
                    }while(flag==0);
                            break;
                    
                } while (innerchoice < 4);
               
        }
        }while(first==0);
    }
}


    
