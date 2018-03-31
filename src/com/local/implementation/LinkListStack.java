/**
 * 
 */
package com.local.implementation;

import java.util.LinkedList;
import java.util.List;

import com.local.abstractions.IStack;

/****
 * 
 * @author gaurav's
 *
 * @param <E>
 */
public class LinkListStack<E> implements IStack<E> {
	
	private List<E> list = null;
	
	public LinkListStack() {
		list = new LinkedList<E>();
	}

	@Override
	public void push(E obj) {
		
		list.add(obj);
	}

	@Override
	public E top() {
		if(isStackEmpty()) {
			return null;
		}
		return list.get(0);
	}

	@Override
	public E pop() {

		if(isStackEmpty()) {
			return null;
		}else {
			E obj =list.get(0);
			list.remove(0);
			return obj;
		}
	}

	@Override
	public boolean isStackEmpty() {
		
		if(null == list || list.size()==0) {
			return true;
		}
		return false;
	}

	@Override
	public int sizeOfStack() {

		if(isStackEmpty()) {
			return 0;
		}
		return list.size();
	}

	@Override
	public boolean isStackFull() {

		return false;
	}

}
