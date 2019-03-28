package com.interview.linkedList;

import com.interview.tree.BinaryTree;

public class ListMethods {
	List list;
	ListMethods(List list){
		this.list=list;
	}
	
	void printList(List list) {
		 List temp=list;
		 while(temp!=null) {
			 System.out.println(temp.data);
			 temp=temp.next;
			 
		 }
	}
	
	BinaryTree toBst(List list,int n) {
		if(n<=0) {
			return null;
		}
		BinaryTree left=toBst(list, n/2);
		BinaryTree root=new BinaryTree(list.data);
		root.left=left;
		list=list.next;
		BinaryTree right=toBst(list,n-n/2-1);
		return root;
	}
}
