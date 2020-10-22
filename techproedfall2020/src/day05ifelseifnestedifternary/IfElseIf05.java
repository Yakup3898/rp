package day05ifelseifnestedifternary;

import java.util.Scanner;

public class IfElseIf05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the annual salary.");
		int wage = scan.nextInt();
		
		if(wage<0) {
			System.out.println("Enter a valid data");
		} else if(wage<60000) {
		  System.out.println("I do not accept the offer");
		} else if(wage<=80000) {
			System.out.println("I negotiate to increase");
	    } else {
		System.out.println("I accept the offer!");
	    }
		scan.close();
}
}
