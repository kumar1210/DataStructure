package com.local.abstractions;


/***
 *  extending AutoCloseable interface, implementing classes
 *  need to implement close method and they can do the 
 *  resource handling in that. With this we can create object 
 *  on the try itself and no finally is needed.  TestStack
 *  class has an example of it.
 *  
 * @author gaurav's
 *
 * @param <E>
 */
public interface IStack<E> extends AutoCloseable{
	
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
