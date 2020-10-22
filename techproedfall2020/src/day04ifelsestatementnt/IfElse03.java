package day04ifelsestatementnt;

import java.util.Scanner;

public class IfElse03 {

	public static void main(String[] args) {
		/*
		 Ask user to enter a character, then check whether the character is in alphabet or not
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character:");
	    char ch = scan.next().charAt(0);
	    if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
	    	System.out.println("This is an alphabet letter");
	    }else {
	    	System.out.println("This is not an alphabet letter");
	    }
		scan.close();
		
		
	}

}
