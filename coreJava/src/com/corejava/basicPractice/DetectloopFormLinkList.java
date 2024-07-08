package com.corejava.basicPractice;

import java.util.*;

public class DetectloopFormLinkList {
	static Node head;
	
	public static void main(String[] args) {
		DetectloopFormLinkList llist = new DetectloopFormLinkList();
		 
	        llist.push(20);
	        llist.push(4);
	        llist.push(15);
	        llist.push(10);

	        /*Create loop for testing */
	        llist.head.next.next.next.next = llist.head;

	        if (detectLoop(head))
	            System.out.println("Loop Found");
	        else
	            System.out.println("No Loop");
	}

	static class Node {
		int data;
		Node next;
		public Node(int n) {
			this.data = n;
			next = null;
		}
	}
	
	public static void push(int n) {
		Node newNode = new Node(n);
		newNode.next = head;
		head = newNode;
	}
	
	public static boolean detectLoop(Node h) {
		HashSet<Node> s = new HashSet<Node>();
		
		while (h != null) {
			if(s.contains(h)) {
				return true;
			}
			s.add(h);
			head = h.next; 
		}
		return false;
	}
}


