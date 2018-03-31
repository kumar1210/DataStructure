package com.local.abstractions;

public interface IStack<E> {
	
	/***
	 * 
	 * @param i
	 */
	public void push(E i);
	
	/****
	 * 
	 * @return
	 */
	public E top ();
	
	/***
	 * 
	 * @return
	 */
	public E pop ();
	
	
	/***
	 * 
	 * @return
	 */
	public boolean isStackEmpty();
	
	/***
	 * 
	 * @return
	 */
	public int sizeOfStack();
	
	/***
	 * 
	 * @return
	 */
	public boolean isStackFull();

}
