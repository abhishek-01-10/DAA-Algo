import java.util.*;
public class heapSort{
	int heapSize;
	public void Heap_Sort(int A[]){
		Build_max_heap(A);
		for(int i=A.length-1;i>0;i--){
			swap(A,0,i);
			heapSize--;
			max_heapify(A,0);
		}
	}
	
	public void Build_max_heap(int A[]){

		heapSize=A.length;
		for(int i=(heapSize/2)-1;i>=0;i--){
			max_heapify(A,i);
		}
	}

	public void max_heapify(int A[],int i){
		int largest;
		int l=2*i+1;
		int r=2*i+2;
		if(l<heapSize && A[l]>A[i]){
			largest=l;
		}
		else {
			largest=i;	
		}
		if(r<heapSize && A[r]>A[largest]){
			largest=r;
		}
		if(largest!=i){
			swap(A,i,largest);
			max_heapify(A,largest);
		}
		
	}

	public void swap(int A[],int i,int j){
		int temp=A[i];
			A[i]=A[j];
			A[j]=temp;
	
	}
	public int HEAP_EXTRACT_MIN(int A[]){
		if(heapSize<0){
			System.out.println("Heap UnderFlow");
		}
		int min=A[0];
		A[0]=A[heapSize];
		heapSize--;
		max_heapify(A,0);
		return min;
	}

}