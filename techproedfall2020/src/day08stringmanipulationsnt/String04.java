package day08stringmanipulationsnt;

import java.util.Scanner;

public class String04 {

	public static void main(String[] args) {
		//#just a note ; char(0) means the first character in a string. substring(0,1) means the same.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String first = scan.nextLine().trim();
	    System.out.println("Enter your last name: ");
	    String last = scan.nextLine().trim();
	    System.out.println("Enter your social security number: ");
		String num = scan.nextLine().trim();
		
		first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
		
		last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();
		
		num = "*****" + num.substring(num.length()-4);
		
		System.out.println(first + " " + last +  " " + num);
		
		scan.close();
		
		
		
		
		
	}

	
	}

