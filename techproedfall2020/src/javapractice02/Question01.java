package javapractice02;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		//Type the codes which asks the user to put a number. Then it calculates its absolute value.
		
		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter a number");
//	    int abs = scan.nextInt();
//	    
//	    if(abs <0) {
//	    	System.out.println("The absolute vaule of the given number is: " + (abs*(-1)));
//	    }else {
//	    	System.out.println(abs);
//	    }
//		
		//System.out.println("Please enter a number between 1 and 10");
		//int n = scan.nextInt();
		
		
		
//		if((n >0) && (n<11) && (n==7)) {
//			System.out.println("Congrats! You hit the lucky number!");
//		}else {
//			System.out.println("I am sorry, try again.");
//		}
		
//		System.out.println("Put a number man");
//		int n = scan.nextInt();
//		
//		if(n%2==0 && n%5==0) {
//			System.out.println("It is multiple of 10.");
//		}else if(n%2==0 || n%5==0) {
//			System.out.println("It is divisible by 2 or 5");
//		}else {
//			System.out.println("It is not multiple of 10");
//		}
		
//		System.out.println("Enter a character");
//		char c = scan.next().charAt(0);
//		
//		if(c>='a' && c<='z' || c>='A' && c<='Z') {
//			System.out.println("it is in alphabet");
//		}else {
//			System.out.println("It is not in alphabet");
//		}
//		
//		System.out.println("Enter your age (until 55)");
//		int age = scan.nextInt();
//		
//		if(age<16) {
//			System.out.println("You are not eligible to get a driver license.");
//		}else if(age>=16 && age<18) {
//			System.out.println("You can only to permit to drive with an adult.");
//		}else if(age>=18 && age<=55) {
//			System.out.println("You are  eligible to get a driver license.");
//		}else {
//			System.out.println("Please write a valid age");
//		}
		
//	    System.out.println("Enter your annual income according to the US $ dollars");
//		int salary = scan.nextInt();
//		
//		if(salary >0 && salary<50000) {
//			System.out.println("You are not eligible to buy a home.");
//		}else if(salary>=50000 && salary<90000) {
//			System.out.println("You are eligible to buy a home costst less than $300K.");
//		}else {
//			System.out.println("You are good to purchase any type of home.");
//		}
		 
//		System.out.println("Enter your birth year.");
//        int year = scan.nextInt();
//       
//        
//      int  age = 2020 - year;
//		
//	  String result = (age >= 65) ? ("You are eligible to get retired.") : ("You are not eligible to get retired.");
//		System.out.println(result);
		
//		System.out.println("Enter a number");
//		int n = scan.nextInt();
//		
//		int result = (n>9 && n<100) ? n%10 : n*n;
//		 System.out.println(result);
		
		System.out.println("Enter your preference for the size of your coffee");
		String size = scan.next();
		char ch = size.toLowerCase().charAt(0);
		
		switch(ch) {
		case 't':
			System.out.println("Tall");
			    break;
		case 'g':
			System.out.println("Grande");
		        break;
		case 'v':
				System.out.println("Venti");
				break;
		default:
			System.out.println("Please put the correct size name");
		}
		
		
		
	}

}
