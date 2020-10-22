package day05ifelseifnestedifternary;

import java.util.Scanner;

public class NestedIf03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a password");
		String pass = scan.nextLine();
		
		char initial = pass.charAt(0);
		
		if(initial>='A' && initial<='Z') {
			if(initial=='A') {
				System.out.println("Valid Password");
			} else {
				System.out.println("Invalid Password");
			}
		} else if(initial>='a' && initial<='z') {
			if(initial=='z') {
				System.out.println("Valid Password");
		}else {
			System.out.println("Invalid Password");
		
		}
		} else {
			System.out.println("Start with a letter");
		}
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
