package com.local.testers;

import com.local.abstractions.SinglyLinkList;

public class TestSinglyLinkList {

	public static void main(String[] args) {

		TestSinglyLinkList testObj = new TestSinglyLinkList();
		//testObj.testLength();
		//testObj.testinsertNodeAtStart();
		//testObj.testinsertNodeAtLast();
		testObj.testInsertNodeAtNthPosition();

	}	
	public void testInsertNodeAtNthPosition() {
		
		SinglyLinkList<Integer> head = createTestLinkList();
		
		SinglyLinkList<Integer> node1 = new SinglyLinkList<>(8);
		System.out.print("Element inserted at the 0th Position --> ");
		head = head.insertNodeAtNthPosition(node1, 0);
		head.printAllElements();
		SinglyLinkList<Integer> node2 = new SinglyLinkList<>(9);
		System.out.print("Element inserted at the last Position --> ");
		head = head.insertNodeAtNthPosition(node2, head.length());
		head.printAllElements();
		SinglyLinkList<Integer> node3 = new SinglyLinkList<>(10);
		int pos =2;
		System.out.print("Element inserted at the " +pos +" Position --> ");
		head = head.insertNodeAtNthPosition(node3, pos);
		head.printAllElements();
	}
	
	public void testinsertNodeAtLast() {
		
		SinglyLinkList<Integer>  start = createTestLinkList();
		SinglyLinkList<Integer> node2 = new SinglyLinkList<>(4);
		start.insertNodeAtLast(node2);
		start.printAllElements();
		start.insertNodeAtLast(null);
	}

	public void testinsertNodeAtStart() {
		SinglyLinkList<Integer>  start = new SinglyLinkList<Integer>();
		start.setData(5);
		SinglyLinkList<Integer> node1 = new SinglyLinkList<>(6);
		start.setPointer(node1);
		start.printAllElements();
		SinglyLinkList<Integer> node2 = new SinglyLinkList<>(4);
		start = start.insertNodeAtStart(node2);
		start.printAllElements();
	}
	
	public void testLength() {
		SinglyLinkList<Integer>  start = new SinglyLinkList<Integer>();
		start.setData(5);
		System.out.println(start.length());
		
		SinglyLinkList<Integer> node1 = new SinglyLinkList<>(6);
		start.setPointer(node1);
		System.out.println(start.length());
	}
	
	public static SinglyLinkList<Integer> createTestLinkList() {
		
		SinglyLinkList<Integer>  start = new SinglyLinkList<Integer>();
		start.setData(5);
		SinglyLinkList<Integer> node1 = new SinglyLinkList<>(6);
		start.setPointer(node1);
		SinglyLinkList<Integer> node2 = new SinglyLinkList<>(7);
		start.insertNodeAtLast(node2);
		System.out.print("Link List Created ");
		start.printAllElements();
		return start;
		
	}
}
