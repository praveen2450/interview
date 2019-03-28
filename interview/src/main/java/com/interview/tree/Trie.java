package com.interview.tree;

public class Trie {
	char c;
	boolean isEnd;
	Trie[]children=new Trie[26];
	
	
	//constructor with no params
	Trie(){
		this.isEnd=false;
		for(int i=0;i<26;i++) {
			this.children[i]=null;
		}
	}
	
	// constructor with a char as param
	Trie(char c){
		this.c=c;
		this.isEnd=false;
		for(int i=0;i<26;i++) {
			children[i]=null;
		}
	}
	
	//insert method of trie
	
	void insert(Trie trie,String keys) {
		int length=keys.length();
		Trie crawl=trie;
		for(int i=0;i<length;i++) {
			int index=keys.charAt(i)-'a';
			//System.out.println(keys.charAt(i));
			if(crawl.children[index]==null) {
				
				crawl.children[index]=new Trie();
			}
			crawl=crawl.children[index];	
		}
		crawl.isEnd=true;
	}
	
	boolean search(Trie trie,String keys) {
		int length=keys.length();
		Trie crawl=trie;
		for(int i=0;i<length;i++) {
			
			int index=keys.charAt(i)-'a';
			if(crawl.children[index]==null) {
				return false;
			}
			crawl=crawl.children[index];
		}
		if(crawl.isEnd==false)
			return false;
		return true;
	}
}
