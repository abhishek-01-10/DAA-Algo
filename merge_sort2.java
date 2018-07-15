import java.util.*;
class merge{
	public void merge_sort(int a[],int p,int r){
		System.out.println("jj");
		if(p<r){
			int q =((p+r)/2);
			merge_sort(a,p,q);
			merge_sort(a,q+1,r);
			//merge(a,p,q,r);
			
		}
			
	}
	/*public void merge(int a[],int p,int q,int r){
		System.out.println("he");
		int n1=q-p+1;
		int n2=r-q;
		int L[]=new int[n1+1];
		int R[]=new int[n2+1];
		System.out.println("he");
		for(int i=0;i<n1;i++){
			L[i]=a[p+i];
			System.out.println("ok");
		}
		for(int j=0;j<n2;j++){
			R[j]=a[q+j+1];
			System.out.println("ok2");
		}
		L[n1]=9999;
		R[n2]=9999;
		int i=0;
		int j=0;
		for(int k=p;k<r;k++){
			if(L[i]<=R[j]){
				a[k]=L[i];
				i++;
			}
			else{
				a[k]=R[j];
				j++;
			}
		}
	}*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		merge_sort ms=new merge_sort();
		ms.merge_sort(a,0,a.length-1);
		//System.out.println("he");

	}
		
	
}