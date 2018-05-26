package com.local.testers;

import com.local.abstractions.IStack;
import com.local.implementation.ArrayStack;
import com.local.implementation.LinkListStack;

public class TestStack {

	public static void main(String[] args) {

		//test LinkListStack
		IStack<String> stackObj = new LinkListStack<String>();
		stackObj.push("Gaurav");
		System.out.println(stackObj.top());
		System.out.println(stackObj.isStackEmpty());
		System.out.println(stackObj.pop());
		System.out.println(stackObj.isStackEmpty());
		
		
		//test ArrayStack
		stackObj = new ArrayStack<String>(50);
		
		stackObj.push("Vidhu");
		System.out.println(stackObj.top());
		System.out.println(stackObj.isStackEmpty());
		System.out.println(stackObj.pop());
		System.out.println(stackObj.isStackEmpty());
		
		try (IStack<String> stackObj1 = new LinkListStack<String>()) {
			
		} catch (Exception ex) {
			
		}
	}

}
