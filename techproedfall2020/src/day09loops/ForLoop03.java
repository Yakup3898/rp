package day09loops;

import java.util.Scanner;

public class ForLoop03 {

	public static void main(String[] args) {
		//Write a program to calculate the sum of first 10 counting numbers.
		
		//Create a sum variable assign it 0
		int sum = 0;
		//Create for loop and type sum = sum + i; inside the for loop
		for(int i=1;i<=10;i++) {
			
			sum  = sum + i;
			
			}
		//Type this after the for loop not inside to see the last result once only
		System.out.println(sum);
		
		/*
		 1)Ask user to enter a String
		 2)Check the String if it is "Palindrome" or not
		 This is a very common interview question. Try to understand
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		
		String s = scan.nextLine();

		String r = "";
		
		for(int i=s.length()-1;i>=0;i-- ) {
			
			r = r + s.charAt(i);
			
		}
		System.out.println(r);
		if(s.equalsIgnoreCase(r)) {
			System.out.println("Palindrome");
		}else  {
			System.out.println("Not Palindrome");
		}
		scan.close();
		
	}

}
