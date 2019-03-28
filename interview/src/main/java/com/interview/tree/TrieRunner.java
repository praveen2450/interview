package com.interview.tree;

public class TrieRunner {
	
	public static void main(String[] args) {
		 Trie trie=new Trie();
		 String keys[] = {"the", "a", "there", "answer", "any", 
                 "by", "bye", "their"};
		 for(int i=0;i<keys.length;i++) {
			 trie.insert(trie,keys[i]);
		 }
		 
		 
		System.out.println(trie.search(trie,"answer"));
		System.out.println(trie.search(trie,"ansewer"));
		System.out.println(trie.search(trie,"anyi"));
	}

}
