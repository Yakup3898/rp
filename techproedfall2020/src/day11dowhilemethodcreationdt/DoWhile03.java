package day11dowhilemethodcreationdt;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		/*
		 Ask user to enter his first name
		 If the length of his first name is greater than 6 print "long name" and ask again
		 Otherwise, print "normal name" and finish the loop
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String s = "";
		
		do { System.out.println("Enter your fist name");
		   s = scan.nextLine();
			
			if(s.length()>6) {
				System.out.println("Long name");
			}else {
				System.out.println("Normal name");
			}
		
		}while((s.length()>6));
		
		/*
		 Ask user to enter password
		 If the password has more than 6 characters print "it's OK"
		 Otherwise, print "make the password longer than 6 characters" and ask user to enter a new password
		 */
		
		String pwd = "";
		
		do {System.out.println("Enter password");
			pwd=scan.next();
		if(pwd.length()>6) {
			System.out.println("it's ok");
		}else {
			System.out.println("make the password longer than 6 characters");
		}
			
			
		}while(!(pwd.length()>6));// it can also be while(pwd.length()<=6  . same thing
		
		
		
		
		
		
		
		
		
	}

}
