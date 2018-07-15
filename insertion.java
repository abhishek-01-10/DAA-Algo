import java.util.*;
class insertion{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements which you want to sort:");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		for(int i=1;i<a.length;i++){
			int key=a[i];
			int j=i-1;
			while((j>=0)&&(a[j]<key)){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
			
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}