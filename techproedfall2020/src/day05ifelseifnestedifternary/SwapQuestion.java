package day05ifelseifnestedifternary;

import java.util.Scanner;

public class SwapQuestion {

	public static void main(String[] args) {
		/*
		 //How to switch the values of 2 variables.
		   For example: int a = 12 and int b =13 ==> a = 13 and b = 12
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me 2 integers to swap");
	
		//1.way by using 3rd variable
		//1.step
		
		
		   int a = scan.nextInt();
		   int b = scan.nextInt();
		   System.out.println("a: " + a);
		   System.out.println("b: " + b);
		   System.out.println("=============");
	    int temp = 0;
	    temp = a;
	    a = b;
	    b = temp;
	    System.out.println("a: " + a);
	    System.out.println("b: " + b);
	    System.out.println("===================");
	    
	    //2.way: Without using 3rd variable. This is a common interview question
	    System.out.println("a: " + a);
	    System.out.println("b: " + b);
	    a = a + b;
	    b = a - b;
	    a = a - b;
	    
	    scan.close();
	    
	    
	    
	  
	    
	    

	}

}
