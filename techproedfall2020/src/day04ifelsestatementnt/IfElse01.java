package day04ifelsestatementnt;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
        /*
         If it rains I will cancel the picnic else I will not
         */
		
		//Ask user to enter an integer .
		//If the integer is even print "even" on the console.
		// IF the integer is odd print odd on the console.
		
		Scanner scan = new Scanner(System.in);
	 System.out.println("Enter an integer");
	 int num = scan.nextInt();
	 //1.way of using if-else statement 
	 if (num%2 == 0) {    //this way is better because there is only one condition. This means that 
		                  //your application will be faster. so java work less
		 System.out.println("Even");
	 }else {
		 System.out.println("Odd");
	}
      if(num % 2 == 0) {
    	  System.out.println("Even");
      }
	 if(num % 2 == 1) {
		 System.out.println("Odd");
	 }
	 scan.close();

	}

}
