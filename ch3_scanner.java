package csc1302;
import java.util.*;
public class ch3_scanner {
// Scanner is used to get input from user
	public static void ScannerProblemDescrition() {
		System.out.println("Write a program that runs as the following:");
		System.out.println("Program: What is your name?");
		System.out.println("you: Dhara Shah");
		System.out.println("Program: Welcome, D. Awesome Shah, what is your age?");
		System.out.println("you: 55");
		System.out.println("Program: Oh! you still have 3 years to retire! What is your street address?");
		System.out.println("you: 25 Park Place");
		System.out.println("Program: Cool, what is city do you live in?");
		System.out.println("You: Atlanta");
		System.out.println("Program: Oh, once I grow big and intelligent, I am going to send you a cool gift for D. Awesome Shah, at 25 Park Place, Atlanta. Thanks a lot!");
	}
	
	public static void main(String[] args) {
		//ScannerProblemDescrition();
		Scanner console = new Scanner(System.in);
		System.out.println("What is your name and last name?");
		String name = console.nextLine();
		int index = name.indexOf(" ");
		String first_letter = name.substring(0,1).toUpperCase();
		String last_name = name.substring(index);
		String new_name = first_letter+"."+" Awesome"+last_name;
		System.out.println("Welcome,"+new_name+", what is your age?");
		int age = console.nextInt();
		if (age >58) {
			System.out.println("Oh! you may have already retired!");
		}
			else {
				if (age == 58) {
					System.out.println("Oh! you may be planning to retire this year!");
				}else {
						System.out.println("Oh! You still have "+(58-age)+" years to retire!");
					}
				
			}
		System.out.println("What is your street address?");
		String street = console.nextLine();
		
		System.out.println(street+"Cool, what is city do you live in?");
		//String city = console.next();
		
		/*System.out.println("Oh, once I grow big and intelligent, I am going to send you a cool gift for"
				+new_name+", at "+
				street+ "," +city+"Thanks a lot!");
				*/
		
	}

}
