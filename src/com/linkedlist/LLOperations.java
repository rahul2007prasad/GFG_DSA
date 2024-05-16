package com.linkedlist;

public class LLOperations {
	public static void main(String[] args) {
		CustomLinkedList ll = new CustomLinkedList();
		System.out.println("Add first");
		ll.addFirst(0);
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		ll.addFirst(4);
		ll.addFirst(5);
		
		System.out.println("Display LL");
		ll.display();
		
		System.out.println("Add last");
		ll.addLast(9);
		System.out.println("Display LL");
		ll.display();
		
		System.out.println("Remove first");
		ll.removeFirst();
		ll.display();
		System.out.println("get first " + ll.getFirst());
		
		ll.display();
		System.out.println("get at " + ll.getAt(3));
		
		ll.display();
		System.out.println("get last " + ll.getLast());
		
		
		System.out.println( "add at ");
		ll.addAt(10, 2);
		ll.display();
		System.out.println("remove last");
		ll.removeLast();;
		ll.display();
		
		System.out.println("reverse using data");
		ll.reverseDLL();
		ll.display();
		
		System.out.println("reverse itrativeky using pointer");
		ll.reversePLL();
		ll.display();
		
		System.out.println("Remove at");
		ll.removeAt(2);
		ll.display();
		
		
		//---------------LL to Stack
		
		LLToStackAdapter llToStack =new  LLToStackAdapter();
		
		System.out.println("-------STACK------");
		System.out.println("Stack push");
		llToStack.push(1);
		llToStack.push(2);
		llToStack.push(3);
		llToStack.push(4);
		llToStack.push(5);
		
		
		System.out.println("Stack display");
		llToStack.displayStack();
		System.out.println("");
		System.out.println("Top");
		llToStack.top();
		
		System.out.println("POP");
		llToStack.pop();
		llToStack.displayStack();
		
		
		
		
	
	}
	
	
}
