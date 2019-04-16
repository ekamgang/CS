package sorts;
import java.util.*;
public class selection_Sort {
	public static void swap(int i, int j, int []A) {
		int tmp = A[j];
		A[j]=A[i];
		A[i]=tmp;
	}
	public static void sort(int [] A) {
		for (int i = 0; i < A.length-1; i++) {
			int min = i;
			int max =A.length-1-i;
			
			for (int j = i; j < A.length-i; j++) {
				if (A[min] > A[j] ) {
				min= j;
				} 
				if (A[max] <A[j]) {
					max=j;
				}
			}
			swap(i,min,A);
			swap(A.length-1-i,max,A);
			
		}  
	}
	public static void main(String[] args) {
		int [] A = {10,2,500,-9,52,78,-45,10000};
		System.out.println("Array before sorting:"+Arrays.toString(A));
		sort(A);
		System.out.println(Arrays.toString(A));
	}

}
