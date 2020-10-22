package day03ifstatementsnt;

import java.util.Scanner;

public class Modulus {

	public static void main(String[] args) {
		/*
		Modulus: Modulus returns the returns the remainder in division operation
		Modulus operator sign is %
		 */
		
		int a = 13;
		int b = 5;
		System.out.println(a % b);//3
		
		//ask user to enter 2 integers, print the reminder on the console if you divide
		//the integer by the second.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 integers");
		int num = scan.nextInt();
		
		int num1 = scan.nextInt();
	
		System.out.println("Remainder: " + num % num1);
		
		//Ask user to enter an integer and check it "odd" or "even"
		//Note; When you divide and integer by 2, if the remainder is 1 then the integer is odd.
		//When you divide and integer by 2, if the remainder is 0 then the integer is even.
		
		
		
	    
	    System.out.println("Enter an integer check it odd or even");
	    int q = scan.nextInt();
	    System.out.println("if the remainder is 1 then the integer is odd. If remainder 0 then it's even. " + q % 2);
		
	    scan.close();
		
		
		
	    
		
		
		

	}

}
