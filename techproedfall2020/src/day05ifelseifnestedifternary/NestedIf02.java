package day05ifelseifnestedifternary;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		
		int num = scan.nextInt();
		
		if(num%2==0) {
		
			 if(num%3==0) {
		System.out.println("Perfect even number");
			
		} else {
			System.out.println("Good even number");
		}
			 
		} else {
		   if(num%3==0) {
			   System.out.println("Perfect odd number");
		   } else {
			   System.out.println("Good odd number");
		   }
		    
			
		

	 
		}
		scan.close();
	}

}
