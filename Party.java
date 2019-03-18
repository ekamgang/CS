package extrapoint;

import java.util.*;

public class Party {
public static void main(String[] args) {
	person bob = new person("Bob", 15);
	person other_bob = new person("Bob", 16);
	person elise = new person("Elise", 15);
	person tammie = new person("Tammie", 15);
	person daniel = new person("Daniel",17);
	person katie = new person("Katie", 18);
	person other_elise = new person("Elise", 18);
	person [] guests = {other_bob,bob, elise, tammie, daniel, katie, other_elise};
	
	
	Arrays.sort(guests);
	for (int i = 0; i < guests.length; i++) {
		System.out.println(guests[i].toString());
	}
	
	System.out.println();
	
	for (int i = 0; i < guests.length; i++) {
		System.out.println(guests[i].toString());
		System.out.println(search(guests, guests[i],0, guests.length-1));// should return true for each of these
		System.out.println(search(guests,new person(guests[i].name, guests[i].age-2) , 0, guests.length-1)); // should return false
		System.out.println(search(guests,new person(guests [i].name+"S", guests[i].age) , 0, guests.length-1)); // should return false 
	}

}

public static boolean search(person [] guests, person Target, int low, int high) {
	// base case 1 
			if (low>high) {
				return false;
			} else {
			int mid = (low+high)/2;
			int r = Target.compareTo(guests[mid]);
			// base case 2 
			if (r==0) {
				return true;
			} else if(r<0) { 
				return search(guests, Target, low, mid-1);
				 
			}else {
			return search (guests, Target, mid+1, high);
			}
}
}}


