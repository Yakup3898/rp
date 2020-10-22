package day06nestedternaryswitch;

import java.util.Scanner;

public class NestedTernary01 {

	public static void main(String[] args) {
	
		/*
		 Ask user to enter an integer.
		 If the integer is greater than equal or equal to 0 check 
		 If it has 2 digits or not.
		 If it has 2 digits print its square(a*a) otherwise print its cube (a*a*a*)
		 
		 If the integer is less than equal or equal to 0 check 
		 If it is less than -10 or not 
		 If it is less than -10 print the number itself otherwise print its absolute value.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int n = scan.nextInt();
		
		int result = n>=0 ? n>9 && n<100 ? n*n : n*n*n : n<-10 ? n : -1*n;
		System.out.println(result);
	scan.close();
		
		
		
		
		

	}

}
