package com.linkedlist;

public class ListNode {

	int val =0;
	ListNode next = null;
	
	public ListNode(int val) {
		this.val = val;
	}
	
	public ListNode reverse(ListNode head) {
		
		if(head == null || head.next == null) {
			return head;
		}
		ListNode curr = head;
		ListNode prev = null;
		ListNode forw = null;
		
		while(curr != null) {
			forw = curr.next;
			curr.next = prev;
			prev = curr;
			curr = forw;
		}
		return prev;
	}
}
