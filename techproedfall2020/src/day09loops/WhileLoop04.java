package day09loops;

import java.util.Scanner;

public class WhileLoop04 {

	public static void main(String[] args) {
		/*
		 Type java code by using while loop.
		 Write a program that promts the user to input an integer.
		 It should then find sum of digits of that number.
		 123 ==> 1+2+3 = 6
		 (very common interview question.) # couldn't get it cuz the lesson was broken!
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int n =scan.nextInt();
		
		
	
	int sum =0;
	
	while(n!=0) {
		sum = sum + n%10;
		n = n/10;
	}
	System.out.println(sum);
	scan.close();
	}

}
