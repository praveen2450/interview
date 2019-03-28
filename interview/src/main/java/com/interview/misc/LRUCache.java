package com.interview.misc;

import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class LRUCache {
	 static Deque<Integer>d;
	 static HashSet<Integer>map; 
	 int cacheSize;
     LRUCache(int n){
    	 this.d=new LinkedList<>();
    	 this.map=new HashSet<>();
    	 this.cacheSize=n;
     }
     
     public void insertInCache(int pageNumber) {
    	 if(!map.contains(pageNumber)) {
    		 if(d.size()==cacheSize) {
    			 int last=d.removeLast();
    			 map.remove(last);
    		 }
    	 }else {
    		 int index=0,i=0;
    		 Iterator<Integer>itr=d.iterator();
    		 while(itr.hasNext()) {
    			
    			 if(itr.next()==pageNumber) {
    				 index=i;
    				 break;
    			 }
    			 i++;
    		 }
    		 d.remove(index);
    	 }
    	
		 d.push(pageNumber);
		 map.add(pageNumber);
     }
     
     public void display() {
    	 Iterator<Integer>itr=d.iterator();
    	 while(itr.hasNext()) {
    		 System.out.println(itr.next());
    	 }
     }
     
     public static void main(String[] args) {
    	 LRUCache cache=new LRUCache(4);
    	 cache.insertInCache(1);
    	 cache.insertInCache(2);
    	 cache.insertInCache(3);
    	 cache.insertInCache(1);
    	 cache.insertInCache(4);
    	 cache.insertInCache(5);
    	 cache.display();
     }
}
