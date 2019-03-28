package com.interview.linkedList;

import com.interview.tree.BinaryTree;

public class App {
	public static void main(String args[]) {
		List list=new List(1);
		ListMethods listMethods=new ListMethods(list);
		for(int i=2;i<6;i++) {
			list.push(list, i);
		}
		
		BinaryTree root=listMethods.toBst(list,6);
		root.inorder(root);
	}
}
