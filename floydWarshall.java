timport java.util.*;
public class floydWarshall{
	 static int[][] FLOYD_WARSHALL(int graph[][],int[][] parent,int v){
		int temp[][]=new int[v][v];
		for(int i=0;i<v;i++){
			for(int j=0;j<v;j++){
				temp[i][j]=graph[i][j];
			}
		}
		for(int k=0;k<v;k++){
			for(int i=0;i<v;i++){
				for(int j=0;j<v;j++){
					if(temp[i][k]+temp[k][j]<temp[i][j]){
						temp[i][j]=temp[i][k]+temp[k][j];
						parent[i][j]=parent[k][j];
					}
					else{
						parent[i][j]=parent[i][j];
					}
				}
			}

		}
		for(int i=0;i<v;i++){
			for(int j=0;j<v;j++){
				graph[i][j]=temp[i][j];
			}
		}
		System.out.println("Parent Matrix:");
		for(int i=0;i<v;i++){
			for(int j=0;j<v;j++){
				System.out.printf("%3d",parent[i][j]);
			}
			System.out.println();
		}
		return graph;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of vertices");
		int v=sc.nextInt();	
		int graph[][]=new int[v][v];
		int parent[][]=new int[v][v];
		for(int i=0;i<v;i++){
			for(int j=0;j<v;j++){
				graph[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<v;i++){
			for(int j=0;j<v;j++){
				parent[i][j]=sc.nextInt();
			}
		}
		int ans[][]=FLOYD_WARSHALL(graph,parent,v);
		System.out.println("Matrix below shows the shortest distances between every pair of vertices:");
		for(int i=0;i<v;i++){
			for(int j=0;j<v;j++){
				System.out.printf("%3d",graph[i][j]);
			}
			System.out.println();
		}
	}
}