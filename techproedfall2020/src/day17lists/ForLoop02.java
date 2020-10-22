package day17lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		/*
		 Ask user to enter 5 full names(no middle name)
		 Get the initials of the first and last name, concatenate, and store them in a list
		 Print the list on the console
		 Exp; if user enters "Ali Can", "Veli Han", "Kemal Mert" ==> [AC, VH, KM]
		 */
		
		Scanner scan = new Scanner(System.in);
		//Created names list by getting names from the user
		List<String> names = new ArrayList<>();
		
		int i =0;
		
		do {
			System.out.println("Enter " + (i+1) + ". full name");
			names.add(scan.nextLine());
			i++;
		}while(i<5);
		
		System.out.println(names);
		
		//How to get initials 
		List<String> initials = new ArrayList<>();
		
		for(String w : names) { 
			initials.add("" + w.charAt(0) + w.charAt(w.indexOf(" ")+1));
		}
		System.out.println(initials);
		
		scan.close();
        
	}

}
