package com.interview.tree;

public class BuildTree {
	BinaryTree root;
	public BinaryTree buildTree() {
		BinaryTree root=new BinaryTree(15);
		root.left=new BinaryTree(8);
		root.right=new BinaryTree(20);
		root.left.right=new BinaryTree(12);
		root.left.left=new BinaryTree(4);
		root.left.left.left=new BinaryTree(2);
		root.left.left.left.right=new BinaryTree(1);
		root.left.left.left.right.left=new BinaryTree(0);
		root.left.right.left=new BinaryTree(10);
		root.right.right=new BinaryTree(14);
		root.right.left=new BinaryTree(16);
		root.left.right.left.right=new BinaryTree(3);
		root.left.right.left.right.left=new BinaryTree(11);
		return root;
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
