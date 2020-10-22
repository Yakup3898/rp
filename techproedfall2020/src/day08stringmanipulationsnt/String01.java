package day08stringmanipulationsnt;

public class String01 {

	public static void main(String[] args) {
	
		//12.
		String s1 = "Java is Java";
		System.out.println(s1.substring(3));//a is Java
		
		//Get just "Java" on the console.
		System.out.println(s1.substring(8));//Java. 8th character will be inclusive
		//Get just the last character by removing the rest.
		System.out.println(s1.substring(s1.length()-1));//length()-1 this is the method of
		                                                //getting the last character in a string.
		//If you use length() as index in substring method, you will get "nothing". not error
		System.out.println(s1.substring(12));//nothing ""
		//If you use an index more than the length you will get Exception on console.
		//System.out.println(s1.substring(13));//Exception error
		/*
		 Java has 2 main errors;
		 1) Compile Time Error: When you type code if you see red underline, it is called compile time error
		 2) Run Time Error: When you get red error messages on the console after running your code it is called Run Time Error
		 
		 
		 
		 *///String s1 = "Java is Java";
		
		//Get all String by using substring()
		System.out.println(s1.substring(0));
		//substring(2,9) ==> 2 is inclusive, 9 is exclusive. It's always like that.
		System.out.println(s1.substring(2,9));//va is J
		
		//Get "is" and print it on the console
		System.out.println(s1.subSequence(5,7));// is
		//If you use same indexes for beginning and ending indexes, you will get nothing.
		//because always the second character is valid and is printed on the console.
		System.out.println(s1.subSequence(5,5));//nothing
		//IN substring(), beginning index cannot be greater than ending index. can be equal but not greater
		//System.out.println(s1.subSequence(8,5));//compile time error
		
		//13. toLowerCase( and 14. toUpperCase()
		String s2 = "TEACH and LEARN, that is the life";
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
		//Convert "life" to uppercase ==> TEACH and LEARN, that is the LIFE
		//1 easy way
		System.out.println(s2.replace("life", "LIFE"));//TEACH and LEARN, that is the LIFE
		//2. way by using substring()
		System.out.println(s2.substring(0, 29) + (s2.substring(29).toUpperCase()));//TEACH and LEARN, that is the LIFE
		
		//15. trim() : it cuts/truncates the spaces at the beginning and at the end.
		//We use this method to cut the user's accidental spaces when he write smt.
		//this method don't touch the space/s between the words.
		String s3 = "  John Mark   ";
		System.out.println(s3.trim());//John Mark
		
		

	}

}
