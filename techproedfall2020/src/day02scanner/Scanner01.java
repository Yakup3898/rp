package day02scanner;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
	
		/*
		 In every application, we need to communicate with the user
		 To communicate with the user we use Scanner Class.
		 */

		//1.Step in order to communicate with user you have to use this syntax
	
	 Scanner scan = new Scanner(System.in);
	//2.step
	 System.out.println("Enter your age");
	 
	 //3.step 
	 int age = scan.nextInt();
	 System.out.println(age);
	 
     scan.close();
	 
	}

}
