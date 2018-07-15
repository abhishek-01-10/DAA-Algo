import java.util.*;
public class quick_sort {
	public void quick_sort(int A[],int p,int r){
		if (p<r) {
			int q=partition(A,p,r);
			quick_sort(A,p,q-1);
			quick_sort(A,q+1,r);
		}
	}
	public int partition(int A[],int p,int r){
		int x=A[p];
		int i=p;
		for(int j=p+1;j<=r;j++){
			if(A[j]<=x){
				i++;
				swap(A,i,j);
			}
			
		}
		swap(A,p,i);
		return i;
	}
	public void swap(int A[],int i,int j){
		int temp=A[i];
		A[i]=A[j];
		A[j]=temp;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int A[]=new int[n];
		Random rn=new Random();
		for(int i=0;i<n;i++){
			int m=rn.nextInt(10000000)+0;
			A[i]=m;
		}
		quick_sort qs=new quick_sort();
		long startTime = System.nanoTime();
		qs.quick_sort(A,0,n-1);

		long endTime   = System.nanoTime();
		double totalTime = endTime - startTime;
		/*for(int i=0;i<n;i++){
			System.out.print(A[i]+" ");
		}*/
		System.out.println("Time for execution is  "+(totalTime/1000000));
	}
}
	