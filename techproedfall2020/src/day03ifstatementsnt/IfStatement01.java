package day03ifstatementsnt;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
	 /*
	  If it rains I will cancel the picnic
	  
	  
	  */
		if(5>=3) {
			System.out.println("Good");
			
		}
		
		//Ask user to enter an integer.
	    //If the integer is even, print "even' on the console.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to check if it is odd or even.");
		int num = scan.nextInt();
		
		
		if(num % 2 == 0) {
			System.out.println("Even");
	
			}
		
		if(num % 2 == 1)
			 {
			System.out.println("Odd");
			}
		
		//ask user to enter the width and the length of a rectangle.
		//If the width and the length are equal to each other print "Square" on the console
		//If they are not equal to each other print "Rectangle" on the console.
		
		System.out.println("Enter the width and the length of a rectangle.");
		double sideWidth = scan.nextDouble();
		double sideLength = scan.nextDouble();
		
		if(sideWidth != sideLength) {
			System.out.println("Rectangle");
			
		}
		if(sideWidth == sideLength) {
			System.out.println("Square");
			}
		//Ask user to enter the initial of a day name in uppercase . Print the days on the console.
		//if their initial is matching with user's.
		//S ==> Sunday, Saturday   F==> Friday 
		System.out.println("Enter the initial of a day name in uppercase.");
		//If you want to get a char from user use the following syntax:
		char initial = scan.next().toUpperCase().charAt(0);
	
		
		if (initial == 'S') {
			System.out.println("Saturday, Sunday");
		}
		if (initial == 'T') {
			System.out.println("Tuesday, Thursday");
		}
		if (initial == 'M') {
			System.out.println("Monday");
		}
		if 	(initial == 'W') {
			System.out.println("Wednesday");
		}
		if (initial == 'F') {
			System.out.println("Friday");
		}
				
	   if(initial!='S' || initial!='W' || initial!='F' || initial!='M' || initial!='T')
System.out.println("There's no any day like that. Which planet are you living?");

	}

}
