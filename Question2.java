import java.util.*;
public class Question2 {
	public static void main(String [] args) {
		int [] arr = {20,5,3,11,-6,0,8,12,-27,18};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
		 System.out.println(binarySearch(11,arr));
		System.out.println(binarySearch(13,arr));

	}
	
	public static void insertionSort(int[] a) {
		for (int i=0; i<a.length; i++) {
			int value = a[i];
			int j=i;
			while (j>0 && a[j-1]< value) {
				a[j]= a[j-1];
				j--;	
			}
			a[j]= value;
			
		}
	}
	public static int binarySearch(int x, int[] a) {
		int max = a.length-1; 
		int min =0 ;
		while(max>=min) {
	    int mid = (min+max)/2;
		 if (a[mid]==x) {
			 return mid;
		 }else if (a[mid]<x){
			max=mid-1;
		} else if(a[mid]>x){
			min = mid +1;
		}
		}
		return -1;
		}
	

}
