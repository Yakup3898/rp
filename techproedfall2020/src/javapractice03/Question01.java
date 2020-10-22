package javapractice03;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		//Type the codes which asks the user to put the letters for the favourite football club in Turkey.
		//It prints "Galatasaray" for gs, "Tranzonspor" for ts, "Fenerbahçe" for fb, "Besiktas" for bjk
		//Use switch statements in your codes.
		
		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter one of the options (gs-fb-bjk-ts)");
//	    String team = scan.next().toLowerCase();
//	    
//	    switch(team) {
//	    case "gs":
//	    	System.out.println("You support Galatasaray");
//	    	break;
//	    case "ts" :
//	        System.out.println("You support Tranzonspor");
//	    break;
//	    case "bjk" :
//	    	System.out.println("Beşiktaş");
//		    System.out.println("You support Beşiktaş");
//	    	break;
//	    case "fb" : 
//	    	System.out.println("You support Fenerbahçe. you twat!");
//	    	break;
//	    default:
//	    		System.out.println("You entered an invalid letter/figure");
//	    	
//	    }
//		
		
		//Q2: Type the codes which asks the user the name and the last name. It prints the initials
		//of the first and the last name.
//		System.out.println("What's your name?");
//		String name = scan.nextLine();
		
//		char firstInt =name.toUpperCase().charAt(0);
//		char secondInt = name.toUpperCase().charAt(name.indexOf(" ")+1);
		
		//or it can be done like this: char firstInt =name.toUpperCase().charAt(0);
		//int idx - name.indexOf(" ")+1;
		//char secInt = name.charAt(idx);
		
//		System.out.println("The first and the second the second initials are: " + firstInt + secondInt);
		
		//Type the codes which asks the user to enter a name. It prints the first three characters of the name and puts * for the rest of the characters.
		
//		System.out.println("Please enter your name");
//		String name = scan.nextLine().trim();
//		
//		String first = name.substring(0,3);
//		String second = name.substring(3, name.length());
//		
//		String star = second.replaceAll("\\D", "*" );
//		System.out.println(first + star);
		
		// \\w means all words , \\W means all non-words , \\d means all digits, \\D means all non-digits, \\s means all spaces, \\S means all non-spaces
		
		//Type the program which asks the user to enter 10 character code to be able to create a new account. This code should start with a capital
		//letter. If the codes is valid it prints, you can create a new account. Otherwise, it prints please enter a valid code.
		
//		System.out.println("Enter a 10 character code.");
//		String ch = scan.next().trim();
//		
//		
//		if((ch.charAt(0)>='A' && ch.charAt(0)<='Z') && ch.length()==10) {
//			System.out.println("You can create a new account");
//		}else {
//			System.out.println("Please enter a valid code");
//		}
		
		//Type the program which asks the users to enter any words which they think it is a palindrome.
		//The program checks whether it is a palindrome or not.
		
//		System.out.println("Please put some words which you think is a palindrome");
//		String words = scan.nextLine().trim();
//		
//		String reverse = "";
//		
//		for(int i =0;i<words.length();i++) {
//			reverse = reverse + words.charAt(words.length()-i-1);
//		}
//		if(reverse.equalsIgnoreCase(words)) {
//			System.out.println("It is a palindrome");
//		}else {
//			System.out.println("It is not a palindrome");
//		}
//		
		
		//Type the program which asks the user to enter a 3-digit number. Then it reverses without using the String variable
		//and prints the reversed number provided by the user.
		
//		System.out.println("Enter a 3 digit number.");
//		int num =scan.nextInt();
//		
//		String reversed = "";
//		
//		while(num>0) {
//			int a = num%10;
//			reversed += a;
//			num = num/10;
//		}
//		System.out.println(reversed);
		
		//Type the program which adds the even number from 23 through 77 by using the for loop.
//		int sum=0;
//		for(int i =23;i<=77;i++) {
//			if(i%2==0) {
//				sum = sum + i;
//			
//			}
//			
//		}
//		System.out.print(sum);
//		
		
		//Type the program which counts how many even numbers are between 20 through 99 by using the while loop.
		
//		int counter =0;
//		int i =20;
//		while(i<=99) {
//			if(i%2==0) {
//				counter++;
//			}
//			i++;
//		}
//		System.out.println("There are " + counter + " even numbers between 20 through 99");
//		
		
		//Type the program which asks the user to put an integer. It calculates the factorial of that number.
		
		System.out.println("Enter a number");
		int num = scan.nextInt();
		
		int fact =1;
		
		for(int i =1;i<=num;i++) {
			fact = fact * i;
		}
		System.out.println(fact);
		

	}

}
