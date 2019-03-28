package com.interview.linkedList;

public class List {
	int data;
	List next;
	List(int data){
		this.data=data;
		this.next=null;
	}
	List push(List head,int data) {
		List temp=new List(data);
		List crawl=head;
		if(head==null) {
			head=temp;
			return temp;
		}
		while(crawl.next!=null) {
			crawl=crawl.next;
		}
		crawl.next=temp;
		head=crawl;
		return crawl;
	}
}
