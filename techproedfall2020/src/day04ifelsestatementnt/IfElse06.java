package day04ifelsestatementnt;

import java.util.Scanner;

public class IfElse06 {

	public static void main(String[] args) {
		/*
		 Type java code by using if-else statement,
		 Write a program to print absolute value of a number entered by user.
		 Absolute Value: If the number is positive or zero return the number itself
		                 If the number is negative return the number after multiplying by -1
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = scan.nextInt();
		
		if(num >= 0) {
			System.out.println(num);
	   
	    }else {
			System.out.println(-1 * num);
		}
		scan.close();

	}

}
