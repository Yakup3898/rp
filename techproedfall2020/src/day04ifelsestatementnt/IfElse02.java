package day04ifelsestatementnt;

import java.util.Scanner;

public class IfElse02 {

	public static void main(String[] args) {
        
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = scan.nextInt();
		if (age >= 18 && age <= 65) {
			System.out.println("You should work");
		}else {
			System.out.println("No need to work");
		}
		
      scan.close();
	}

}
