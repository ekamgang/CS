
public class Lab10 {
	public static void main(String [] args) {
		int[] a = {1,3,4,5,7};
		System.out.println(sequentialSearch(10,a));
		System.out.println(binarySearch(6,a));
		System.out.println(recursiveBinarySearch(4,a,0,a.length-1));
	}
	
	
	public static int sequentialSearch(int x, int[] a) {
		for (int i=0; i<a.length; i++) {
			if (a[i]==x) {
			return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int x, int[] a) {
		int min = 0; 
		int max = a.length-1;
		int mid = 0;
		while(min<=max) {
	 mid = (min+max)/2;
		 if (a[mid]>x){
			max=mid-1;
		} else if(a[mid]<x){
			min = mid + 1;
		}
		else {
			return mid;
					
		}
		}
		return -(mid+1);
		}
	
	
	public static int recursiveBinarySearch(int x, int[] a, int min, int max) {
		if (min>max) {
			return-1;
		}else {
			int mid =(max+min)/2;
			if (a[mid]==x) {
				return mid;
			} else if (a[mid]>x) {
				return recursiveBinarySearch( x, a,  min,  mid-1);
			}else {
				return recursiveBinarySearch( x, a,  mid+1,  max);
			}
		}
			
			
		}
	}


	
	
	
	


