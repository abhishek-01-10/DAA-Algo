import java.util.*;
public class matrixChainMul{
	public int[] MATRIX_CHAIN_ORDER(int p[],int arr[]){
		int n=p.length-1;
		int q;
		int m[][]=new int[p.length][p.length];
		int s[][]=new int[p.length][p.length];
		for(int i=1;i<=n;i++){
			m[i][i]=0;
		}
		for(int l=2;l<=n;l++){
			for(int i=1;i<=n-l+1;i++){
				int j=i+l-1;
				m[i][j]=Integer.MAX_VALUE;
				for(int k=i;k<=j-1;k++){
					q=m[i][k]+m[k+1][j]+p[i-1]*p[k]*p[j];
					if (q<m[i][j]) {
						m[i][j]=q;
						s[i][j]=k;
					}
				}
			}
			arr[0]=m[1][n];
			//arr[1]=s[2][n];
		}
		System.out.print("Optimal Parenthesization: ");
		printOptimalParen(s,1,n);
		System.out.println();

		return arr;
	}
	public void printOptimalParen(int s[][],int i,int j){
		if(i==j){
			System.out.print("A"+i);
		}
		else{
			System.out.print("(");
			printOptimalParen(s,i,s[i][j]);
			printOptimalParen(s,s[i][j]+1,j);
			System.out.print(")");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int p[]=new int[a];
		for(int i=0;i<a;i++){
			p[i]=sc.nextInt();
		}
		int arr[]=new int[2];
		matrixChainMul mcm=new matrixChainMul();
		mcm.MATRIX_CHAIN_ORDER(p,arr);
		System.out.println("Minimal cost of Multiplication: "+arr[0]);
	}
}