package com.interview.tree;

public class DoublyList {
int data;
   DoublyList prev;
   DoublyList next;
   DoublyList(){
	   
   }
   DoublyList(int data){
	   this.data=data;
	   this.prev=null;
	   this.next=null;
   }
   
   void printList(DoublyList head){
	   DoublyList list1=head;
	   while(list1!=null) {
		   System.out.println(list1.data);
		   list1=list1.next;
	   }
   }
}
