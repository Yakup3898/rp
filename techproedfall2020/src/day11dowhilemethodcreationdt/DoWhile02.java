package day11dowhilemethodcreationdt;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		
		/*
		 Ask user to enter his first name
		 If the initial is lowercase print a message like "make the initial uppercase"
		 If the initial is uppercase print a message like "you did it right"
		 */
		
		Scanner scan = new Scanner(System.in);
		char init = 'a'; // value doesn't matter 
		
	  do { 
		  System.out.println("Enter your first name");
		  init = scan.next().charAt(0);
		  
		  if(init>='A' && init<='Z') {
		  System.out.println("You did it right");
		  }else {
			  System.out.println("make the initial uppercase");
		  }
	  }while(!(init>='A' && init<='Z'));
		
	  scan.close();
		
		

	}

}
