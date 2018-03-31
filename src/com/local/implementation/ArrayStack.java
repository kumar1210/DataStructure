package com.local.implementation;

import java.util.EmptyStackException;

import com.local.abstractions.IStack;

@SuppressWarnings("unchecked")
public class ArrayStack<E> implements IStack<E>{

	private E [] stack ;
	private int pos=0;
	
	
	public ArrayStack() {
		stack= (E[]) new Object[100];
	}
	
	public ArrayStack (int n) {
		stack = (E[]) new Object[n];
	}
	
	@Override
	public void push(E i) /*throws Exception*/{
		if(isStackFull())
			//throw new Exception("full stack");
			System.out.println("Stack is full");
		stack[pos++] =i;
	}
	
	@Override
	public E top () throws EmptyStackException{
		
		if(isStackEmpty())
			throw new EmptyStackException();
		return stack[pos-1];
	}
	
	@Override
	public E pop () throws EmptyStackException{
		
		if(isStackEmpty())
			throw new EmptyStackException();
		return stack[--pos];
	}
	
	@Override
	public boolean isStackEmpty() {
		return (pos==0);
	}
	
	@Override
	public boolean isStackFull() {
		return (pos == stack.length);
	}
	
	@Override
	public int sizeOfStack() {
		return pos;
	}

}
