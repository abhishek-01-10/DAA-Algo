 import java.util.*;
public class nQueen{
	public boolean isPLACE(int k,int i,int[] x){
		for(int j=0;j<k;j++){
			if((x[j]==i)|| ((int)Math.abs(x[j]-i)==(int)Math.abs(j-k))){
				return false;
			}
		}
		return true;
	}
	public void N_QUEEN(int k,int n,int x[]){
		//int c=0;
		for(int i=0;i<n;i++){
			if(isPLACE(k,i,x)){
				x[k]=i;
				if(k==n-1){
					System.out.println(Arrays.toString(x));
				}
				else{
					N_QUEEN(k+1,n,x);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Queens:");
		int n=sc.nextInt();
		int x[]=new int[n];
		nQueen nq=new nQueen();
		nq.N_QUEEN(0,n,x);
	}
}