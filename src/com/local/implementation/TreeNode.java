/**
 * 
 */
package com.local.implementation;

/**
 * @author gaurav's
 * 
 * generic binary tree node
 *
 */
public class TreeNode<E> {

	private E data;
	private TreeNode<E> left;
	private TreeNode<E> right;
	/**
	 * @param data
	 */
	public TreeNode(E data) {
		this.data = data;
		left = null;
		right = null;
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
	 * @return the left
	 */
	public TreeNode<E> getLeft() {
		return left;
	}
	/**
	 * @param left the left to set
	 */
	public void setLeft(TreeNode<E> left) {
		this.left = left;
	}
	/**
	 * @return the right
	 */
	public TreeNode<E> getRight() {
		return right;
	}
	/**
	 * @param right the right to set
	 */
	public void setRight(TreeNode<E> right) {
		this.right = right;
	}
	
	
	@Override
	public String toString() {
		return ""+getData();
	}
	
}
