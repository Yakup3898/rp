package day09loops;

import java.util.Scanner;

public class ForLoop05 {

	public static void main(String[] args) {
	
	//Print the counting numbers which are less than 100 and divisible by 3 on the console.	
		
	
		//1.way
		for(int i=3;i<100;i+=3) {
			System.out.print(i + " ");
		
		}
		//2.way
	System.out.println();
		for(int i=1; i<100;i++) {
			if(i%3==0) {
				System.out.print(i + " ");
			}
			
		}
		System.out.println();
		/*
		 Print first 70 counting numbers which are divisible by 4 and 6
		 */
		
		for(int i=12;i<=70;i+=12) {
			System.out.print(i + " ");
		} 
		
		/*
		 1.Ask user to enter a positive integer
		 2.Calculate and print the factorial of the integer
		 for exp; 5 factorial = 1x2x3x4x5 = 120
		 This is a very common interview question
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int a = scan.nextInt();
		
		int result = 1;
		
		if(a<0) {
			System.out.println("Enter a positive number");
		}else {
			for(int i=1;i<=a;i++) {
				result = result*i;
				
			}
			System.out.println(a +  "!=" + result);
		}
		
		scan.close();
		
		
		
		

	}

}
