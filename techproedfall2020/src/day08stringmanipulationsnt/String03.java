package day08stringmanipulationsnt;

import java.util.Scanner;

public class String03 {

	public static void main(String[] args) {
		
    Scanner scan = new Scanner(System.in);
	
		/*
		 Ask user to enter a password
		 -remove all spaces from the beginning and ending of password
		 -make the first character uppercase 'A'
		 -make the last 2 characters "**"
		 -The password must have at least 6 characters
		 -then give the password to the user
		 */
		System.out.println("Enter a password:");
		String pwd = scan.nextLine().trim();
		
		 if (pwd.length()<6) {
			 System.out.println("Please enter at least 6 characters");
			 
		 }else {
			 //In replace method you can use charAt() or substring() instead of using a specific character
		     //pwd = pwd.replace(pwd.charAt(0), 'A');
			 //pwd = pwd.replace(pwd.substring(pwd.length()-2), "**");
			 pwd = "A" + pwd;
			 pwd = pwd.substring(0, pwd.length()-2) + "**";
			 
			 System.out.println(pwd);
			 
				 
			 }
		
		     scan.close();
		
		
		

	}

}
