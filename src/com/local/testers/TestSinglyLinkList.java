package com.local.testers;

import com.local.abstractions.SinglyLinkList;

public class TestSinglyLinkList {

	public static void main(String[] args) {

		TestSinglyLinkList testObj = new TestSinglyLinkList();
		//testObj.testLength();
		testObj.testinsertNodeAtStart();
		
		
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
}
