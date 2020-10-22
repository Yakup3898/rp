package day05ifelseifnestedifternary;

import java.util.Scanner;

public class IfElseIf01 {

	public static void main(String[] args) {
		/*
		 When you have more than 2 options use if-else-if
		 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to check its sign");
		int a = scan.nextInt();
		if(a>0) {
			System.out.println("Positive");
			
		} else if(a==0) {
			System.out.println("Neutr");
			
		}else {
			System.out.println("Negative");
		}
		scan.close();
	}

}
