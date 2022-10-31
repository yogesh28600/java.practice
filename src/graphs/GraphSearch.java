package graphs;

import java.util.ArrayList;
import java.util.Iterator;

//Initializing graph
public class GraphSearch {
	int v;
	ArrayList<Integer> adj[];
	GraphSearch(int noOfvertex){
		v=noOfvertex;
		adj=new ArrayList[v];
		for(int i=0;i<v;i++) {
			adj[i]=new ArrayList<>();
		}
	}
	
	//Add method to add edges to graph
	void edge(int x, int y) {
		adj[x].add(y);
	}
	
	//Breadth-First-Search Algorithm
	void bfs(int sourceVertex) {
		boolean[] visited=new boolean[v];
		ArrayList<Integer> a1=new ArrayList<>();
		visited[sourceVertex]=true;
		a1.add(sourceVertex);
		while(!a1.isEmpty()) {
			sourceVertex=a1.remove(0);
			System.out.print(sourceVertex+" ");
			Iterator i=adj[sourceVertex].iterator();
			while(i.hasNext()) {
				int n=(int)i.next();
				if(!visited[n]) {
					visited[n]=true;
					a1.add(n);
				}

			}
		}
	}

	public static void main(String[] args) {
		GraphSearch g=new GraphSearch(6);
		g.edge(0, 1);
		g.edge(0, 2);
		g.edge(0, 5);
		g.edge(1, 0);
		g.edge(1, 2);
		g.edge(2, 0);
		g.edge(2, 1);
		g.edge(2, 3);
		g.edge(2, 4);
		g.edge(3, 2);
		g.edge(4, 2);
		g.edge(4, 5);
		g.edge(5, 0);
		g.edge(5, 4);
		
		g.bfs(0);
	}

}
