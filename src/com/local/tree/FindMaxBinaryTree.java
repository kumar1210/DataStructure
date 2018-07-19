/**
 * 
 */
package com.local.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.local.implementation.TreeNode;

import localjar.LocalPrinter;

/**
 * @author gaurav's
 * 
 * this class is to find element with max value in a binary tree
 * by iterative way or recursive way.
 *
 */
public class FindMaxBinaryTree {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TreeNode<Integer> root = new TreeNode<Integer>(12);
		root.setLeft(new TreeNode<Integer>(9));
		root.setRight(new TreeNode<Integer>(13));
		root.getLeft().setLeft(new TreeNode<Integer>(19));
		root.getLeft().setRight(new TreeNode<Integer>(25));
		LocalPrinter.printer("Recursive Max in tree is "+ findMaxRecursive(root, 0));
		LocalPrinter.printer("Iterative Max in tree is "+ findMaxIterative(root, 0));
		
	}
	
	/***
	 *  an recursive way to find the maximum element in 
	 *  the given tree.
	 * @param root
	 * @param max
	 * @return
	 */
	public static int findMaxRecursive(TreeNode<Integer> root, int max) {
		
		if(null != root) {
			if((Integer)root.getData() > max) {
				max =(Integer) root.getData();
			}
			LocalPrinter.printer("Calling findMax("+root+", "+max+")");
			max = findMaxRecursive(root.getLeft(), max);
			LocalPrinter.printer("Calling findMax("+root+", "+max+")");
			max = findMaxRecursive(root.getRight(), max);
		}
		return max;
	}
	
	/****
	 * an iterative way to find the maximum element 
	 * in the provided tree
	 * @param root
	 * @param max
	 * @return
	 */
	public static int findMaxIterative(TreeNode<Integer> root, int max) {
		
		TreeNode<Integer> temp;
		Queue<TreeNode<Integer>> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			temp = queue.poll();
			if((Integer)temp.getData() >max) {
				max =(Integer)temp.getData();
				LocalPrinter.printer("Update max is "+max);
			}
			if(null!= temp.getRight()) {
				queue.add(temp.getRight());
			} 
			if(null!= temp.getLeft()) {
				queue.add(temp.getLeft());
			}
		}
		return max;
	}
	
}
