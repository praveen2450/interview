package com.interview.graph;

import java.util.Vector;

public class Graph {
	public int N;
	Cell[][] graph;
	boolean[][] visited;
	int[][] dist;
	Graph(int N){
		this.N=N+1;
	    this.graph=new Cell[this.N][this.N];	
	    this.visited=new boolean[this.N][this.N];
	    this.dist=new int[this.N][this.N];
	    for(int i=0;i<N;i++) {
	    	for(int j=0;j<N;j++) {
	    		visited[i][j]=false;
	    		dist[i][j]=0;
	    	}
	    }
	}
	public boolean isReachable(int x,int y,int N) {
		N=N-1;
		if(x>=1 &&x<=N &&y>=1&&y<=N) {
			return true;
		}
		return false;
	}
	public int minStepToTarget(Graph graph2, int pos_x, int pos_y, int target_x, int target_y) {
		 int dx[] = {-2, -1, 1, 2, -2, -1, 1, 2};  
		 int dy[] = {-1, -2, -2, -1, 1, 2, 2, 1};
		 Cell t=new Cell(pos_x,pos_y);
		 Vector<Cell> queue=new Vector<Cell>();
		 queue.add(t);
		 visited[t.x][t.y]=true;
		 //System.out.println(pos_x+pos_y+target_x+target_y);
		 while(!queue.isEmpty()) {
			 Cell temp=queue.firstElement();
			 //System.out.println(temp.x+" "+temp.y);
			 queue.remove(0);
			 if(temp.x==target_x&&temp.y==target_y) {
				 return dist[temp.x][temp.y];
			 }
			 for(int i=0;i<8;i++) {
				 int new_x=temp.x+dx[i];
				 int new_y=temp.y+dy[i];
				 boolean reachable=isReachable(new_x,new_y,N);
				 
				 if(reachable &&  !visited[new_x][new_y]) {
					 queue.add(new Cell(new_x,new_y));
					 dist[new_x][new_y]=dist[temp.x][temp.y]+1;
					 visited[new_x][new_y]=true;
				 }
			 }
		 }
		 System.out.println(dist[target_x][target_y]);
		 return Integer.MAX_VALUE;
	}
}
