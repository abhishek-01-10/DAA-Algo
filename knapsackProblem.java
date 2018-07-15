import java.util.*;
public class knapsackProblem{
	static int KNAPSACK(int n,int[] value,int[] weight,int W){
		int b[][]=new int[n+1][W+1];
		for(int w=0;w<W;w++){
			b[0][w]=0;
		}
		for(int i=1;i<=n;i++){
			b[i][0]=0;
		}
		for(int i=1;i<=n;i++){
			for(int w=0;w<=W;w++){
				if(weight[i]<=w){
					if(value[i]+b[i-1][w-weight[i]]>b[i-1][w]){
						b[i][w]=value[i]+b[i-1][w-weight[i]];
					}
					else{
						b[i][w]=b[i-1][w];
					}
				}
				else{
					b[i][w]=b[i-1][w];
				}
			}
			
		}
		for(int i=0;i<=n;i++){
			for(int j=0;j<=W;j++){
				System.out.printf("%4d",b[i][j]);
			}
			System.out.println();
		}
		return b[n][W];
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements(n)");
		int n=sc.nextInt();
		System.out.println("Enter the total weight in knapsack(W)");
		int W=sc.nextInt();
		int value[]=new int[n+1];
		int weight[]=new int[n+1];
		for(int i=1;i<=n;i++){
			value[i]=sc.nextInt();
			weight[i]=sc.nextInt();
		}
		int ans=KNAPSACK(n,value,weight,W);
		System.out.println("Maximum value in "+W+" unit weight in kanpsack is ::"+ans);
	}
}