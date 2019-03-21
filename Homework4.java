//Edwin Kamgang
public class Homework4 {
	public static void writeSquares(int n) {
    	if(n<1)
            throw new IllegalArgumentException();
        if (n==1)
            System.out.print(1 + ",");
        else if (n % 2 == 1) {
        	writeSquares (n - 1);
            System.out.print(n*n +",");
            
        } else { 
        	System.out.print(n*n + ",");
            writeSquares (n - 1);
           
        }
    }
	public static int multiply(int a, int b) {
		if (b==0) {
			return 0;
		} else {
				return a + multiply(a,b-1);
		}
	}
	public static void main (String [] args) {
		System.out.println(multiply(1,7));
		writeSquares(11);
	}
}
