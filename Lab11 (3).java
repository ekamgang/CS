import java.util.*;
public class Lab11 {
	
public static void swap(int i, int j, List <Character> A) {
	Character tmp = A.get(i);
	A.set(i, A.get(j));
	A.set(j, tmp);	
	}
public static void insertionSort(List <Character> A) { // time complexity is O(N^2)
		int swap=0;
		int compare=0;
	for (int i =1; i<A.size(); i++){
			char c =A.get(i);
			int j = i-1;
			while ( j>=0 && c<A.get(j)){
				char d=A.get(j);
				A.set((j+1),d);
				j=j-1;
				swap++;
				compare++;
			}
			compare++;
			A.set((j+1),c);
				
			}
	System.out.println("insertion number of swaps "+swap);
	System.out.println("insertion number of comparisons "+compare);
			
			
	}
public static void selectionSort(List <Character> A) { // time complexity is O(N^2)
	int swap=0;
	int compare = 0;
	for (int i =0;i<A.size()-1; i++){
       char smallest = A.get(i);
        int smallestIndex = i;
        for (int j = i+1; j < A.size(); j++) {
            char c = A.get(j);
            if (c<smallest) {
                smallest =  c;
                smallestIndex = j;
                swap++; 
            }compare++;
        }
        swap(smallestIndex,i,A);
       
	        }
	System.out.println("selection number of swaps "+swap);
	System.out.println("selection number of comparisons "+compare);
	    }
public static void bubbleSort(List <Character> A) { // time complexity is O(N^2)
	int swap=0;
	int compare=0;
	 for (int i =1;i<A.size()-1; i++){
		 for  (int j =0;j<A.size()-1; j++){
			 if (A.get(j)>A.get(j+1)){
				 swap(j,j+1 ,A);
				 swap++;
		 }
			 compare++;
		 }
			 
	 }
	 System.out.println("bubble number of swaps "+swap);
		 System.out.println("bubble number of comparisons "+compare);
}

public static void main (String[] args){
		List <Character> A = new ArrayList(Arrays.asList('a','b','c','d','e'));
		List <Character> B = new ArrayList(Arrays.asList('e','d','c','b','a'));
		insertionSort(B);
		System.out.println("output of insertion sort");
		System.out.println(B);
		B = Arrays.asList('e','d','c','b','a');
		//
		selectionSort(B);
		System.out.println("output of selection sort");
		System.out.println(B);
		B = Arrays.asList('e','d','c','b','a');
		//
		bubbleSort(B);
		System.out.println("output of bubble sort");
		System.out.println(B);
		B = Arrays.asList('e','d','c','b','a');
		////////////////////////////////////////////////
		insertionSort(A);
		System.out.println("output of insertion sort");
		System.out.println(A);
		A = Arrays.asList('a','b','c','d','e');
		//
		selectionSort(A);
		System.out.println("output of selection sort");
		System.out.println(A);
		A = Arrays.asList('a','b','c','d','e');
		//
		bubbleSort(A);
		System.out.println("output of bubble sort");
		System.out.println(A);
		A =Arrays.asList('a','b','c','d','e');
		
		
	}



}
// 8 selection does the least amount of work
// 9 insertion sort because it will insert the added value to its appropriate position without altering the list
//10 switch the operators, change < with > and > with <

