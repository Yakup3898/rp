package day05ifelseifnestedifternary;

import java.util.Scanner;

public class IfElseIf04 {

	public static void main(String[] args) {
		/*
		 Ask user to enter year
		 Type java code by using if-else statement.
		 If the year is divisible by 100 then it must be divisible by 400.
		 If a year is not divisible by 100 then it must be divisible by 4.
		 #this is one of the most common interview question.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year to check if it is leap year or not.");
		int year = scan.nextInt();
		
		if(year<=0) {
			System.out.println("Enter a valid year");
			
		} else if(year%100==0 && year%400==0) {
			System.out.println("This is a leap year!");
			
		} else if(year%100!=0 && year%4==0) {
			System.out.println("This is a leap year!");
			
		} else
			System.out.println("This is not a leap year.");
	scan.close();
	
	}

}
