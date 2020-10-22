package day09loops;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		

		for(int i=1; i<=20;i++) {
			System.out.print(i + " "); 
		}
		System.out.println();
		
		for(int i=15; i>=1; i--) {
			System.out.print(i + " ");
			
		}
		System.out.println();
		for(int i=2; i<=30;i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i=1; i<30;i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i=1; i<=15; i++) {
			System.out.print((i*2)-1 + " ");
		}
		
		/*
		 1) Ask user to enter a string
		 2)Print the String reverse
		 For exp; Germany ===> ynamreG
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a String");
		
		String s = scan.nextLine();
		for(int i =s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
			
		}
		
		scan.close();
		
		
	}

}
