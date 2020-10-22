package day05ifelseifnestedifternary;

import java.util.Scanner;

public class IfElseIf02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an age");
		int age = scan.nextInt();
		
		if(age<0) {
			System.out.println("Enter a valid name");
		
		} else if(age < 13) {
				System.out.println("Should not work");
			}else if(age <=65) {
				System.out.println("Should work");
			}else {
				System.out.println("Retired");
			}
			
		scan.close();		
		
		

	}

}
