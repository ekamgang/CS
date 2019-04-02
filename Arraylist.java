package extrapoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Arraylist {
	public static void main(String [] args ) {
		int[] num= {1,2,3,4,5,6,7,8,9};
		int index = Arrays.binarySearch(num, 8);
		System.out.print(index);
		ArrayList<String> z = new ArrayList<String>();
		String s="to be or not to be that is the question";
		Scanner console = new Scanner(s);
		
		
				while (console.hasNext()) {
		z.add(console.next());
		}
		System.out.println(z);
		
		Collections.sort(z);
		System.out.println(z);
	}

}
