package com.interview.tree;

public class App {
	public static void main(String args[]) {
		
		BuildTree tree=new BuildTree();
		BinaryTree root=tree.buildTree();
		
		//tree.inorder(root);
		
		BoundaryTraversal boundaryTraversal=new BoundaryTraversal();
		//boundaryTraversal.boundaryTraversal(root);
		
		BinaryTree head=null;
	//	TreeToList treeToList=new TreeToList(head);
		
		//treeToList.convertTreeToList(root);
		//treeToList.printList();
		
		
		TreeProperties treeProperties=new TreeProperties();
		//System.out.println(treeProperties.height(root));
		//treeProperties.setDiameter(0);
		//treeProperties.diameter(root);
		
		//System.out.println(treeProperties.getDiameter());
		
		
		// ----- this is code for printing all the node at k distance from a given node
		//treeProperties.printNodeKDown(root, 3);
		treeProperties.printNodeAtKdistance(root, root.left.right, 3);
	}
}
