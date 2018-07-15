import java.util.*;
class SelectionSort{
		public static void SelectionSort(int a[]){
			for(int i=0;i<a.length-1;i++){
				int min=i;
				for(int j=i+1;j<a.length;j++){
					if(a[j]<a[min]){
						min=j;
					}
				}
				swap(a,i,min);	
			}
		}
	    public static void swap(int a[],int i,int min){
	    	int temp=a[i];
				a[i]=a[min];
				a[min]=temp;

	    }
	public static void main(String...s){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		Random rn=new Random();
		for(int i=0;i<n;i++){
			int m=rn.nextInt(10000)+0;
			a[i]=m;
		}
		long startTime = System.nanoTime();
		SelectionSort(a);
		long endTime   = System.nanoTime();
		double totalTime = endTime - startTime;
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Time for execution is  "+(totalTime/1000000));

	}
}