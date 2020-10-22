package day09loops;

import java.util.Scanner;

public class ForLoop04 {

	public static void main(String[] args) {
		/*
		 Write a program to calculate the product of first 10 counting numbers 
		 I mean 1x2x3x4x5x6x7x8x9x10 =? This is very common interview question
		 They ask the question in this way: Find 10 factorial (10! = 1x2x3x4x5x6x7x8x9x10)
		 */
		
		int product = 1;
		
		for(int i=1;i<=10;i++) {
			product = product * i;
		}
		
		System.out.println(product);
		
		/*
		 Ask user to enter beginning and ending integers
		 Add all integers from the beginning to ending integer
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a beginning integer");
		int b = scan.nextInt();
		System.out.println("enter an ending integer");
		int e = scan.nextInt();
		
		int sum = 0;
		
		for(int i=b;i<=e;i++) {
			
			sum = sum + i;
		}
		if(b>e) {
			System.out.println("Beginning integer must be less than ending integer");
		}else {
			//If you want to see final result only once put System.out.println() after the loop
			System.out.println(sum);
		}
		
		scan.close();
		
		
	}

}
