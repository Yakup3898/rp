package day10whileloop;

import java.util.Scanner;

public class ForLoop01 {

	public static void main(String[] args) {
		
        // Ask user to enter a String
		//Print the number of "letters" and number of "digits" int the string on the console
		//exp; "1?ab!23_cd" ==> number of letters:4
		 //                   ==> number of digits:3
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string");
		
		String s = scan.nextLine();
		
		int letterCounter = 0;
		int digitCounter = 0;
		
		for(int i=0; i<s.length(); i++) {
			
			if(s.charAt(i)>='a' && s.charAt(i)<='z' || 
					s.charAt(i)>='A' && s.charAt(i)<='Z') {
				
				letterCounter++;
			}
			if(s.charAt(i)>='1' && s.charAt(i)<='9' ) {
				
				digitCounter++;
			}
		}
		System.out.println("number of letters: " + letterCounter);
		System.out.println("number of digits: " + digitCounter);
		scan.close();
		
		
		
		
		
		
		
	}

}
