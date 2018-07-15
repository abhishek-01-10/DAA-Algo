import java.util.*;
class merge_sort{
	public  void merge_sort(int a[],int left, int right){
		if(left<right){
			int mid=((left+right)/2);
			merge_sort(a,left,mid);
			merge_sort(a,mid+1,right);
			merge(a,left,mid,right);
		}
	}
	public void merge(int a[],int l,int mid	,int r){
		int[] b=new int[a.length];
		int k=0;
		int i=l;
		int j=mid+1;
		while((i<=mid)&&(j<=r)){
			if(a[i]<=a[j]){
				b[k]=a[i];
				i++;
				k++;
			}
			else{
				b[k]=a[j];
				j++;
				k++;

			}
		}
		while(i<=mid){
			b[k++]=a[i++];
		}
		while(j<=r){
			b[k++]=a[j++];
		}
				
		/*for(int x=l;x<k;x++){
			a[x]=b[x];
		}*/
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		Random r=new Random();
		for(int i=0;i<n;i++){
			int m=r.nextInt(1000)+0;
			a[i]=m;
		}
		merge_sort ms=new merge_sort();
		long startTime = System.nanoTime();
		ms.merge_sort(a,0,n-1);
		long endTime   = System.nanoTime();
		double totalTime = endTime - startTime;
		System.out.println((totalTime/1000000));
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}
	
}