package day05ifelseifnestedifternary;

import java.util.Scanner;

public class NestedIf04 {

	public static void main(String[] args) {
		/*
		 Type java code by using nested if() statement
		 Write a program to check if a year is leap or not.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter year");
		int year = scan.nextInt();
		
		if(year<0) {
		System.out.println("Enter a valid year");
		}else if(year%100==0) {
			if(year%400==0) {
				System.out.println("leap year");
			}else
				System.out.println("not leap year");
		}else {
			if(year%4==0) {
				System.out.println("Leap year");
			} else {
				System.out.println("not leap year");
				
				scan.close();
			}
		}
			
		
		
		
		
		
		
		
	}

}
