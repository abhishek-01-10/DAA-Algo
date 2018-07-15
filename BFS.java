import java.util.*;
public class BFS{
	static class Graph{
		int v;
		LinkedList<Integer> adjList[];
		Graph(int v){
			this.v=v;
			adjList=new LinkedList[v];
			for(int i=0;i<v;i++){
				adjList[i]=new LinkedList<>();
			}
		}
	}
	static void addEdge(Graph g,int src,int dest){
		g.adjList[src].addFirst(dest);
	}
	static void traversal(int s,Graph g){
		boolean[] visited=new boolean[g.v];
		Queue<Integer> q=new LinkedList<>();
		visited[s]=true;
		q.add(s);
		while(q.size()!=0){
			s=q.poll();
			System.out.print(s+" ");
			Iterator<Integer> itr=g.adjList[s].iterator();
			while(itr.hasNext()){
				int n=itr.next();
				if(!visited[n]){
					visited[n]=true;
					q.add(n);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Vertices");
		int v=sc.nextInt();
		System.out.println("Enter the Number of edges");
		int e=sc.nextInt();
		Graph g=new Graph(v);
		for(int i=0;i<e;i++){	
			int src=sc.nextInt();
			int dest=sc.nextInt();
			addEdge(g,src,dest);
		}
		System.out.println("Enter the source vertex where you want to start traversal");
		int s=sc.nextInt();
		traversal(s,g);
	}
}