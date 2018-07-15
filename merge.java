import java.util.*;
public class merge{
	public void merge_sort(int a[],int p,int r){
		if(p<r){
			int q =((p+r)/2);
			merge_sort(a,p,q);
			merge_sort(a,q+1,r);
			merge(a,p,q,r);
			}
	}

	public void merge(int a[],int p,int q,int r){
		int n1=q-p+1;
		int n2=r-q;

		int L[]=new int[n1+1];
		int R[]=new int[n2+1];

		for(int i=0;i<n1;i++){
			L[i]=a[p+i];
		}

		for(int j=0;j<n2;j++){
			R[j]=a[q+j+1];
		}

		L[n1]=99999;
		R[n2]=99999;
		int i=0;
		int j=0;

		for(int k=p;k<=r;k++){
			if(L[i]<=R[j]){
				a[k]=L[i];
				i++;
			}
			else{
				a[k]=R[j];
				j++;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		Random rn=new Random();
		for(int i=0;i<n;i++){
			int m=rn.nextInt(10000)+0;
			a[i]=m;
		}
		long startTime = System.nanoTime();
		merge ms=new merge();
		ms.merge_sort(a,0,a.length-1);
		long endTime   = System.nanoTime();
		double totalTime = endTime - startTime;
		/*for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}*/
		System.out.println();
		System.out.println("Time for execution is  "+(totalTime/1000000));


	}
		
	
}