//package com.DataStructures;
//
//import java.util.Scanner;
//
//class Harshit
//{
//	Node head;
//	Node Tail;
//class Node {
//	Node Next;
//	int data;
//	Node(int d){
//		Next=null;
//		data=d;
//	}
//}
//	 void insertAtBegin(int value)
//	{
//		Node N = new Node(value);
//
//		if(head==null)
//		{
//			head=N;
//			Tail=N;
//		}
//		else {
//			N.Next=head;
//			head=N;
//		}
//	}
//		 void Show()
//		{
//			 Node tmp=head;
//			while(tmp!=null)
//			{System.out.print("->"+tmp.data);
//			tmp=tmp.Next;
//			}
//		}
//		 void insertAtEnd(int value)
//		 {
//			 Node N = new Node(value);
//			 if(head==null)
//			 {
//				 head=N;
//				 Tail=N;
//			 }
//			 else {
//				 Tail.Next=N;
//				 Tail=N;
//			 }
//		 }
//		 void deleteAtBegenning()
//		 {
//			 if(head==null) {
//				 System.out.println("Underflown");
//			 }
//			 else {
//				 head=head.Next;
//			 }
//		 }
//		 int NumberOfNodes()
//		 {Node tmpry=head;
//		 int count=1;
//		 if(head==null)
//		 {
//			 System.out.println("List is Empty");
//		 }
//		 else {
//			 while(tmpry.Next!=null)
//			 {
//				tmpry=tmpry.Next;
//				 count++;
//			 }
//			 System.out.println(count);
//		 }
//		 return count;
//		 }
//		 void deleteAtEnding()
//		 {
//			 if(head==null) {
//				 System.out.println("Underflown");
//			 }
//			 else {
//				Node tmpry=head;
//				 while(tmpry.Next.Next!=null)
//				 {
//					 tmpry=tmpry.Next;
//				 }
//				 tmpry.Next=null;
//				 Tail=tmpry;
//			 }
//		 }
//}
//public class Main {
//  public static void main(String[] args) {
//	char ch='Y';
//	Scanner sc= new Scanner(System.in);
//	Harshit H=new Harshit();
//	int choice;
//	int innerchoice,x;
//	System.out.println("What do you Want to choose");
//	System.out.println("1.Linked List");
//	System.out.println("2.Stack");
//	System.out.println("3.Queue");
//	choice=sc.nextInt();
//	switch(choice)
//	{
//	case 1:
//		do {
//	System.out.println("1.Insert At Begening");
//	System.out.println("2.Insert At Ending");
//	System.out.println("3.Delete At Begenning");
//	System.out.println("4.Delete At Ending");
//	System.out.println("5.Show List");
//	System.out.println("6.Show Number of Data");
//	innerchoice=sc.nextInt();
//			switch(innerchoice) {
//			case 1: System.out.println("Value You Want to insert at Begenning");
//			x=sc.nextInt();
//				H.insertAtBegin(x);
//				break;
//			case 2: System.out.println("Value You Want to insert at Ending");
//			x=sc.nextInt();
//			H.insertAtEnd(x);
//			break;
//			case 3:  H.deleteAtBegenning();
//			break;
//			case 4: H.deleteAtEnding();
//			break;
//			case 5: H.Show();
//			break;
//			case 6: H.NumberOfNodes();
//			break;
//			}
//			System.out.println("Do You Want to Continue");
//			ch=sc.next().charAt(0);
//		}while(ch!='N'||ch!='n');
//		break;
//	case 2:
//		do {
//			System.out.println("1.Insertion");
//			System.out.println("2.Deletion");
//			System.out.println("3.Show Stack");
//			System.out.println("4.Show Number of Data in Stack");
//			innerchoice=sc.nextInt();
//					switch(innerchoice) {
//					case 1: System.out.println("Value You Want to insert");
//					x=sc.nextInt();
//
//					H.insertAtEnd(x);
//						break;
//					case 2: H.deleteAtEnding();
//					break;
//					case 3: H.Show();
//					break;
//					case 4: H.NumberOfNodes();
//					break;
//					}
//					System.out.println("Do You Want to Continue");
//					ch=sc.next().charAt(0);
//				}while(ch=='Y'||ch=='y');
//		break;
//	case 3:
//		do {
//
//			System.out.println("1.Insertion");
//			System.out.println("2.Deletion");
//			System.out.println("3.Show Queue");
//			System.out.println("4.Show Number of Data in Queue");
//			innerchoice=sc.nextInt();
//					switch(innerchoice) {
//					case 1: System.out.println("Value You Want to insert");
//					x=sc.nextInt();
//						H.insertAtEnd(x);
//						break;
//					case 2: H.deleteAtBegenning();
//					break;
//					case 3: H.Show();
//					break;
//					case 4: H.NumberOfNodes();
//					break;
//					}
//					System.out.println("Do You Want to Continue");
//					ch=sc.next().charAt(0);
//				}while(ch!='N'||ch!='n');
//		break;
//			}
//
//}
//}
//
//
//
//
//
//
//
