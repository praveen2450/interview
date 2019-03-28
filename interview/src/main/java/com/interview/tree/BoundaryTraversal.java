package com.interview.tree;

public class BoundaryTraversal {
	void printBoundaryLeft(BinaryTree root) {
		if(root!=null) {
			if(root.left!=null) {
				System.out.println(root.data);
				printBoundaryLeft(root.left);
			}
			else if(root.right!=null) {
				System.out.println(root.data);
				printBoundaryLeft(root.right);
			}
		
		}
	}
	
	void printBoundaryRight(BinaryTree root) {
		if(root!=null) {
			if(root.left!=null) {
				printBoundaryRight(root.left);
				System.out.println(root.data);
			}
			else if(root.right!=null) {
				printBoundaryRight(root.right);
				System.out.println(root.data);
			}
		}
	}
	
	void printLeaves(BinaryTree root) {
		if(root!=null) {
			if(root.left==null&&root.right==null) {
				System.out.println(root.data);
			}
			printLeaves(root.left);
			printLeaves(root.right);
		}
	}
	void boundaryTraversal(BinaryTree root) {
		 if(root!=null) {
			System.out.println("printing boundary traversal");
			System.out.println(root.data);
			printBoundaryLeft(root.left);
			printLeaves(root.left);
			printLeaves(root.right);
			printBoundaryRight(root.right);
			System.out.println("end printing");
		 }
	}
}
