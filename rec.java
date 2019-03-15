
import java.io.*;
import java.util.*;

public class rec {
	public static void main(String [] args) throws FileNotFoundException {
		
		System.out.print(pow(3,7));
	}
	
		public static void reverse(Scanner input) {
			if  (!input.hasNextLine() ) {
				System.out.print(0);
			}
			else {
				String line =input.nextLine();
				reverse(input);
				System.out.print(line);
			}
			
		}
			public static int pow(int x, int y) {
				if (y==0) {
					return 1;
				}
				else {
					return x* pow(x,y-1);
				}
			}
	

}
