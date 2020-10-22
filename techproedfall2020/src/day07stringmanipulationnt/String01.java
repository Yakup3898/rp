package day07stringmanipulationnt;

import java.util.Scanner;

public class String01 {

	public static void main(String[] args) {
		
		
		/*
		 There are useful methods in String Class to manipulate Strings
		 */
		
		//1. 
//		String s1 = "Java is easy.";
//		System.out.println(s1.charAt(0));// ===> To get first character in a String use 0 as index ->J
//		System.out.println(s1.charAt(4));// I will get space on the console
//		s1.charAt(s1.length()-1);// "." Length()-1 returns the last character everytime
//		//System.out.println(s1.charAt(23));// If you use non-existing index you will get a Exception(like error)
//		
//		//2. concat()
//		String s2 = "Learn Java earn money";
//		System.out.println(s2.concat(" Really?"));
//		
//		//3.contains()
//		String s3 = "Study hard stay humble";
//		System.out.println(s3.contains("s"));//true
//		System.out.println(s3.contains("hard"));//true
//		System.out.println(s3.contains(" "));//true
//		System.out.println(s3.contains(""));//true
//		System.out.println(s3.contains("T"));//false
//		System.out.println(s3.contains(s3));//true
		
		//4.endswith()
//    	String s4 = "Study hard get offer in a week";
//		System.out.println(s4.endsWith("k"));//true
//		System.out.println(s4.endsWith(""));//true
//		System.out.println(s4.endsWith("m"));//false
//		System.out.println(s4.endsWith("week"));//true
		
		//5.equals() Cases are important for equals()
		String s5 = "Fast is slow slow is fast in IT";
	//	System.out.println(s5.equals("Fast is low slow is fast in IT"));//true
	//	System.out.println(s5.equals("fast is low slow is fast in it"));//false
		
		//6. Cases are  not important for equalsIgnoreCase()
		s5.equalsIgnoreCase("fast is slow slow is fast in it");
		System.out.println(s5.equalsIgnoreCase("fast is slow slow is fast in it"));//true
		System.out.println(s5.equalsIgnoreCase("Fast is slow slow is fast in IT"));//true
		System.out.println("A".equalsIgnoreCase("a"));//true
		
		//7.indexOf()
		String s6 = "Learn coding by typing";
		System.out.println(s6.indexOf("i"));//9 ==> It returns the index of first occurence
		System.out.println(s6.indexOf("ing"));//9 ==> For multiple characters it returns the index of first character
		System.out.println(s6.indexOf("l"));// ==> If you look for the index of non-existing character/s it returns -1
		System.out.println(s6.indexOf("Coding"));//-1
		System.out.println(s6.indexOf(""));//0
		System.out.println(s6.indexOf(" "));//5
		System.out.println(s6.indexOf("i", 11));//19
		System.out.println(s6.indexOf("n", 6));//10
		System.out.println(s6.indexOf("", 5));//5
	    
		
		//8. isEmpty() : If isEmpty() returns true it means the length of the String is 0
		System.out.println(s6.isEmpty());//false
        System.out.println("".isEmpty());//true
     
     //9. lastIndexOf()
     System.out.println(s6.lastIndexOf("n"));//20
     System.out.println(s6.lastIndexOf("y"));//17
     System.out.println(s6.lastIndexOf(""));//22
     System.out.println(s6.lastIndexOf("ing"));//19
     System.out.println(s6.lastIndexOf("xxx"));//-1
     System.out.println(s6.lastIndexOf("n", 15));//10
     System.out.println(s6.lastIndexOf("g", 11));
    
     //10.We use replace method to remove a/some character/s from a String.
     String s7 = "Java is OOP language";
     System.out.println(s7.replace('P', 'p'));
     System.out.println(s7.replace('P', '0'));
     System.out.println(s7.replace('a', 'A'));
     System.out.println(s7.replace(' ', '*'));
     System.out.println(s7.replace("language", "concept"));
     System.out.println(s7.replace("i", "code"));//Java codes OOP language
     System.out.println(s7.replace("a", " "));//J v  is OOP l ngu ge
     System.out.println(s7.replace("", "!"));//!J!a!v!a! !i!s! !O!O!P! !l!a!n!g!u!a!g!e!
     
     //11.startsWith()
     System.out.println(s7.startsWith("J"));//true
     System.out.println(s7.startsWith("Java"));//true
     System.out.println(s7.startsWith("Java is OOP language"));//true
     System.out.println(s7.startsWith(""));//true
     System.out.println(s7.startsWith("is", 5));//true
     
     //Ask user to enter the price of a product. If the first character in the price is "$"
     //print "Price is in expected format" Otherwise print "Price is not in expected format"
    
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the price of the product");
     String price = scan.next();
       
      if(price.startsWith("$")) {
    	  System.out.println("Price is in expected format");
      } else {
    	  System.out.println("Price is not in expected format");
      }
      scan.close();
     
     
	}

}
