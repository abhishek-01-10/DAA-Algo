import java.util.*;
public class prims{
	static class Graph{
		int v;
		LinkedList<Integer> adjList[];
		Graph(int v){
			this.v=v;
			adjList=new LinkedList[v];
			for(int i=0;i<v;i++){
				adjList[i]=new LinkedList<Integer>();
			}
		}
	}
	static void addEdge(Graph g,int src,int dest){
		g.adjList[src].addFirst(dest);
		//g.adjList[dest].addFirst(src);
	}
	static void printGraph(Graph g){
		for(int i=0;i<g.v;i++){
			System.out.print("Adjacency list of vertex->"+i);
			System.out.print(" :: ");
			for(Integer ll:g.adjList[i]){
				System.out.print("-->"+ll);
			}
			System.out.println();
		}

	}
	public static void main(String[] args) {
		System.out.println("Enter the number of vertices");
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		System.out.println("Enter the number of Edges");
		int e=sc.nextInt();
		Graph g=new Graph(v);
		for(int i=0;i<e;i++){
			int src=sc.nextInt();
			int dest=sc.nextInt();
			addEdge(g,src,dest);
    	}
    	printGraph(g);	
	}
}