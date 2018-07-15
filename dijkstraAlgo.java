import java.util.*;
public class dijkstraAlgo{
	public static void DIJKSTRA_MST(int[][] graph,int V){
		int arr[]=new int[V];
		boolean visited[]=new boolean[V];
		for(int i=0;i<V;i++){
			visited[i]=false;
			arr[i]=Integer.MAX_VALUE;
		}
		arr[0]=0;
		for(int i=0;i<V-1;i++){
				int u=minIndex(arr,visited);    
				visited[u]=true;
				for(int k=0;k<V;k++){
					if(!visited[k] && graph[u][k]!=0 && arr[u]!=Integer.MAX_VALUE && arr[k]>arr[u]+graph[u][k]){
						arr[k]=arr[u]+graph[u][k];
					}
				}
			}
			for(int i=0;i<V;i++){
				System.out.println("edge = "+i+"-->Weight-->"+arr[i]);
			}
	}
	static int minIndex(int arr[],boolean visited[]){
		int min=Integer.MAX_VALUE;
		int minindex=0;
		for(int i=0;i<arr.length;i++){
			if(visited[i]==false && arr[i]<=min){
				min=arr[i];
				 minindex=i;
			}
		}
		return minindex;
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
		DIJKSTRA_MST(graph,v);
	}
}