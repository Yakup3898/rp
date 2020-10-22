package day05ifelseifnestedifternary;

import java.util.Scanner;

public class IfElseIf03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter marks and print the corresponding grade.");
		int num = scan.nextInt();
		if(num<0) {
			System.out.println("Enter a valid grade");
	}else if(num<50) {
			System.out.println("D");
			
		} else if(num<=59) {
			System.out.println("C");
			
			
		} else if(num<=79) {
			System.out.println("B");
		}else if(num<=100) {
			System.out.println("A");
		}else {
			System.out.println("Enter a valid grade");
		}
		
		scan.close();
		
	}

}
