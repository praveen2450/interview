package com.interview.tree;

public class TreeToList {
	BinaryTree head=null;
	 
	
	TreeToList(){
		
	}
	void printList() {
		while(head.right!=null) {
			System.out.println(head.data);
			head=head.right;
		}
	}
	void  convertTreeToList(BinaryTree root) {
		if(root==null) {
			return;
		}
		convertTreeToList(root.right);
		root.right=head;
		if(head!=null) {
			head.left=root;
		}
		head=root;
		convertTreeToList(root.left);
		
	}
}
