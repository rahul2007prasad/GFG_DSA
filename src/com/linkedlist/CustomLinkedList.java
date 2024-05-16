package com.linkedlist;

public class CustomLinkedList {
	Node head;
	Node tail;
	int size;

	public void addLast(int data) {
		Node temp = new Node();
		temp.data = data;
		temp.next = null;
		if (size == 0) {
			head = tail = temp;

		} else {
			tail.next = temp;
			tail = temp;

		}
		size++;
	}

	public int size() {
		return size;
	}

	public void display() {
		Node temp = head;

		while (temp != null) {
			System.out.print(" " +temp.data);
			temp = temp.next;
		}
		System.out.println(" ");
	}

	public void removeFirst() {
		if (size == 0) {
			System.out.println("list is empty");
		} else if (size == 1) {
			head = tail = null;
			size = 0;
		} else {
			head = head.next;
			size--;
		}

	}
	
	public int getFirst() {
		if(size==0) {
			System.out.println("empty");
			return -1;
		}else {
			return head.data;
		}
	}
	
	public int getLast() {
		if(size==0) {
			System.out.println("empty");
			return -1;
		}else {
			return tail.data;
		}
	}
	
	public int getAt(int index) {
		if(size==0) {
			System.out.println("empty");
			return -1;
		}else if(index < 0 || index >= size){
			System.out.println("Invalid argument");
			return -1;
		}else {
			Node temp = head;
			for(int i=0 ; i < index ; i++) {
				temp = temp.next;
			}
			return temp.data;
		}
	}
	
	public void addFirst(int data) {
		Node temp = new Node();
		temp.data = data;
		temp.next = head;
		head = temp;
		if(size == 0) {
			tail = temp;
			
		}
		size++;
	}
	
	public void addAt(int data , int index) {
		if(index < 0 || index > size) {
			System.out.println("Invalid argumnet");
		}else if(index == 0){
			addFirst(data);
		}else if(index == size) {
			addLast(data);
		}else {
			Node node = new Node();
			node.data = data;
			Node temp = head;
			for(int i=0 ; i < index -1 ; i++) {
				temp = temp.next; 
			}
			node.next = temp.next;
			temp.next = node;
			size++;
			
		}
		
		
	}
	
	public void removeLast() {
		
		
		if(size == 0) {
			System.out.println("Empty list");
		}else if(size == 1) {
			head = tail = null;
		}
		else {
			Node temp = head;
			for(int i=0 ; i < size -2 ; i++) {
				temp = temp.next;
			}
			tail = temp;
			temp.next = null;
			size--;
		}
		
	}
	
	
	
	private Node getNodeAt(int index) {
		Node temp = head;
		for(int i= 0; i< index ; i ++) {
			temp = temp.next;
		}
		return temp;
	}
	
	//reverse  LL iteratively using data only. Do not touch next
	public void reverseDLL() {
		int li =0;
		int ri = size -1;
		while( li < ri) {
			Node left = getNodeAt(li);
			Node right = getNodeAt(ri);
			
			int temp = left.data;
			left.data = right.data;
			right.data = temp;
			li++;
			ri--;
		}
	}
	
	//reverse iteratively LL using pointers i.e next value without touching data property
	
	public void reversePLL() {
		Node prev = null;
		Node curr = head;
		
		while(curr != null) {
			Node next = curr.next;
			curr.next = prev;
		
			prev = curr;
			curr = next;
		}
		Node temp = head;
		head = tail;
		tail = temp;
		
	}
	
	public void removeAt(int index) {
		if(index< 0 || index >= size) {
			System.out.println("Invalid argument");
		}else if(index ==0){
			removeFirst();
		}else if(index == size -1){
			removeLast();
		}else {
			Node temp = head;
			for(int i=0 ; i < index -1; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
			size--;
		}
		
	}
	
	//--------------------------------
	//Kth from last node without using size property iteratively
	
	public int kthFromLast(int k) {
		Node slow = head;
		Node fast = head;
		for(int i=0; i < k ; i++) {
			fast = fast.next;
		}
		
		while(fast != tail) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow.data;
		
	}
	
	
	//----------------------
// -------Middle of LL without suing size propery iteratively
	
	public int middeOfLL() {
		Node slow = head;
		Node fast = head;
		
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
		
	}

}
