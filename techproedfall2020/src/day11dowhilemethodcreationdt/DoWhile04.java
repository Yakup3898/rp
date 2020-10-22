package day11dowhilemethodcreationdt;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
		/*
		 Ask user to enter a name.
		 If the name contains the letter 'a' then print "Won!" on the console
		 Otherwise ask user to enter another name.
		 Use do-while loop
		 
		 */
		Scanner scan = new Scanner(System.in);
		String s = "";
		
		do { System.out.println("Enter your name");
		s = scan.nextLine();
			if(s.contains("a")) {
				System.out.println("Won!");
			}
			
		}while(!(s.contains("a")));
		
		scan.close();
	}

}
