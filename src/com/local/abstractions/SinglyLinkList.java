/**
 * 
 */
package com.local.abstractions;

/**
 * @author gaurav's
 * 
 *  <p> An abstract generic implementation of the SinglyLinkList
 *  	with the basic utility function provided. </p>
 *
 */
public class SinglyLinkList<E> {
	
	private E data;
	private SinglyLinkList<E> pointer;
	
	
	/**
	 *  <p> default constructor </p>
	 */
	public SinglyLinkList () {

	}
	
	/**
	 * 
	 * @param value
	 * <p> constructor which takes the data as a parameter
	 * </p>
	 */
	public SinglyLinkList(E value) {
		this.setData(value);
	}
	
	
	/***
	 * <br> this method is to insert a node 
	 * 		at the end of the linklist. <br>
	 * @param node
	 */
	public void insertNodeAtLast(SinglyLinkList<E> node) throws NullPointerException {

		if (null == node) {
			throw new NullPointerException("Node to entered at last is an empty element.");
		} else {
			SinglyLinkList<E> head = this;
			
			while(null != head.pointer) {
				head = head.pointer;
			}
			head.pointer= node;
		}
	}
	
	/***
	 * 
	 * @param node
	 * @return
	 * @throws NullPointerException
	 * 
	 *  <br> This method is to insert a node at the head
	 *  	 and return the same node as head. </br>
	 */
	public SinglyLinkList<E> insertNodeAtStart(SinglyLinkList<E> node) throws NullPointerException {

		if (null == node) {
			throw new NullPointerException("an Empty element can not be referred as head.");
		} else {
			node.setPointer(this);
			return node;
		}
	}
	
	/***
	 * <code> a utility method to print all the elements of
	 * 		  the link list from the node it will be called.
	 */
	public void printAllElements() {
		
		SinglyLinkList<E> obj = this;
		while (null != obj) {
			System.out.print(obj.getData() + " --> ");
			obj = obj.getPointer();
		}
		System.out.println("NULL");
	}
	
	/***
	 * 
	 * @return
	 * 
	 * <code> method which will return the length
	 *  	  i.e. the number of nodes in the list.
	 *  </code>
	 */
	public int length() {

		int count = 1;
		SinglyLinkList<E> obj = this;
		while (null != obj.pointer) {
			obj = obj.pointer;
			count++;
		}
		return count;
	}
	
	
	/**
	 * @return the data
	 */
	public E getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(E data) {
		this.data = data;
	}
	/**
	 * @return the pointer
	 */
	public SinglyLinkList<E> getPointer() {
		return pointer;
	}
	/**
	 * @param pointer the pointer to set
	 */
	public void setPointer(SinglyLinkList<E> pointer) {
		this.pointer = pointer;
	}
	

}
