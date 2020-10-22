package day11dowhilemethodcreationdt;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		
		/*
		 Ask user to enter an integer
		 If the integer is even print "You Won!" on the console
		 Otherwise ask user to enter another integer
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		
		int a =0;
		
		do {
			System.out.println("Enter an integer");
			a = scan.nextInt();
			if(a%2==0) {
				
			}
		//Everytime while condition must be opposite of the true condition in these kind of questions
		}while(a%2!=0);
		System.out.println("you won!");
		
		
		
		
	}

}
