import java.util.*;
public class primsAlgo{
	public static void PRIMS_MST(int[][] graph,int V){
		int u=0;
		int v=0;
		int total=0;
		boolean visited[]=new boolean[V];
		for(int i=0;i<V;i++){
			visited[i]=false;
		}
		visited[0]=true;
		System.out.println("Edges Are in MST::");
		for(int i=0;i<V-1;i++){
			int min=Integer.MAX_VALUE;
			for(int j=0;j<V;j++){
				if(visited[j]){
					for(int k=0;k<V;k++){
						if(!visited[k]){
							if(min>graph[j][k] && graph[k][j]!=0){
								min=graph[j][k];
								u=j;
								v=k;
							}
						}
					}
				}
			}
			visited[v]=true;
			total+=min;
			System.out.println(u+"-->"+v);
		}
		System.out.println("Minimum Cost of MST = "+total);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of vertices::");
		int v=sc.nextInt();
		int graph[][]=new int[v][v];
		for(int i=0;i<v;i++){
			for(int j=0;j<v;j++){
				graph[i][j]=sc.nextInt();
			}
		}
		PRIMS_MST(graph,v);
	}
}