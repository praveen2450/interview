package com.interview.tree;

public class TreeProperties {
	int height;
	int diameter;
	
	
	BinaryTree tree;
	TreeProperties(){
		
	}
	TreeProperties(BinaryTree binaryTree){
		this.tree=binaryTree;
	}
	
	int height(BinaryTree root) {
		if(root==null) {
			return 0;
		}else {
			return 1+Math.max(height(root.left),height(root.right));
		}
	}
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	void printNodeKDown(BinaryTree root,int k) {
		if(root==null)
		return;
		if(k==0) {
			System.out.println(root.data);
		}
		printNodeKDown(root.left, k-1);
		printNodeKDown(root.right, k-1);
		
	}
	int printNodeAtKdistance(BinaryTree root,BinaryTree target,int k) {
		if(root==null) {
			return -1;
		}
		if(root==target) {
			printNodeKDown(root, k);
			return 0;
		}
		int distance_left=printNodeAtKdistance(root.left,target,k);
		int distance_right=printNodeAtKdistance(root.right,target,k);
		
		if(distance_left!=-1) {
			if(1+distance_left==k) {
				System.out.println(root.data);
			}
			else{
				printNodeKDown(root.right, k-distance_left-2);
			}
			return 1+distance_left;
		}
		if(distance_right!=-1) {
			if(1+distance_right==k) {
				System.out.println(root.data);
				
			}else {
				printNodeKDown(root.left,k-distance_right-2);
			}
			return 1+distance_left;
		}
		return -1;
	}
	int diameter(BinaryTree root) {
		if(root==null) {
			return 0;
		}
		int left_height=diameter(root.left);
		int right_height=diameter(root.right);
		int value=left_height+right_height+1;
		this.diameter=Math.max(this.diameter, value);
		return Math.max(left_height, right_height)+1;		
	}
}
