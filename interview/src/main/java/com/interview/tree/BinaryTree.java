package com.interview.tree;
public class BinaryTree {
	int data;
	public BinaryTree left,right;
	public BinaryTree(int data){
		this.left=left;
		this.right=right;
		this.data=data;
	}
	
	public void inorder(BinaryTree root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
	}
}
