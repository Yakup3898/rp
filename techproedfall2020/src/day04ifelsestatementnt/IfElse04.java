package day04ifelsestatementnt;

import java.util.Scanner;

public class IfElse04 {

	public static void main(String[] args) {
		
		//String s = "Learn Java";
		
		//System.out.println(s.charAt(6));//J
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any name of the days");
	    String day = scan.next();
	    day = day.toLowerCase();
	    if(day.equals("monday")  || day.equals("tuesday")  || day.equals("wednesday")  || day.equals("thursday")  || 
	    		day.equals("friday") || day.equals("saturday")  || day.equals("sunday") ) {
	    System.out.print(day.charAt(1));
	    System.out.print(day.charAt(3));
	    System.out.print(day.charAt(5));	
	    	
	    }else {
	    	System.out.println("Please write a valid day");
	    }
		
	    scan.close();
		 
		 

	}

}
