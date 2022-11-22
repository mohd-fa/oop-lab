//342 Mohammed FA       Doubly linked list
import java.io.*;
import java.util.*;

class Node{
	int data;
	Node next;
	Node prev;
	Node(){
		next = null;
		prev = null;
	}
}

class LinkedList{
	Node head;
	LinkedList(){
		head = new Node();
	}
	void add(int x){
		Node temp = new Node();
		temp.data = x;
		temp.next = head.next;
		temp.prev = null;
		if (head.next != null){
			head.next.prev = temp;
		}
		head.next = temp;
	}
	void dlt(int x){
		if (head.next != null){
			Node ptr = head.next;
			Node preptr = head;
			while(ptr.next != null && ptr.data != x){
				preptr = ptr;
				ptr = ptr.next;
			}
			if (ptr.data == x){
				preptr.next = ptr.next;
				if (ptr.next != null){
					ptr.next.prev = preptr;
				}
			}
			else{
				System.out.println("Element not found."); 
			}
		}
		else{
			System.out.println("List is empty, cannot delete."); 
		}
	}
	void view(){
		if (head.next == null)
		{
			System.out.println("List is empty."); 
		}
		else{	
			Node ptr = head;
			System.out.println("Linked list");
			while(ptr.next != null){
				ptr = ptr.next;
				System.out.print(ptr.data + " ");		
			}
			System.out.println("");
		}
		
	}
}

class dll{
	public static void main(String args[]){
		LinkedList a = new LinkedList();
		Scanner sc = new Scanner(System.in);
		int o,x;
		for(;;){
			System.out.println("Enter operation.(1-view, 2-add, 3-delete, 4-exit)");
			o = sc.nextInt();
			switch(o){
				case 1:
					a.view();
					break;
				case 2:
					System.out.println("Enter element to add:");
					x = sc.nextInt();
					a.add(x);
					break;
				case 3:
					System.out.println("Enter element to delete:");
					x = sc.nextInt();
					a.dlt(x);
					break;
				case 4:
					return;
				default:
					System.out.println("Invalid operation."); 		
			}
		}
		
	}
}
