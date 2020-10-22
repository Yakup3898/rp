package day12methodcreationconstructorsnt;


public class Constructors01 {
	/*
	 1) When you create a class Java creates a default constructor for the class.
	 Default constructor is invisible inside the class
	 
	 2)Constructor's  names must be the same with the class name (Scanner class= Scanner(System.in)=>Scanner constructor
	 
	 3)When you create a constructor, Java cancels the default one
	 
	 4) Constructor is not a method because it has no return type, constructor is a constructor
	 What is the difference between "method" and "constructor"?
	 a)Constructors do not have return type but methods have.
	 b)Constructors' name must be same with the class name but method can use different names
	 */

	public Constructors01() {
		System.out.println("Constructor without parameter");
	}
	
	
	
	
	
	public static void main(String[] args) {
		// Class name Object name    new keyword     Constructor
		 //   Scanner     scan =         new            Scanner(System.in);
       Constructors01     obj     =     new         Constructors01();
	}

}
