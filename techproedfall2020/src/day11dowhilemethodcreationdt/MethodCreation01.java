package day11dowhilemethodcreationdt;

public class MethodCreation01 {
	
	

	public static void main(String[] args) {
		//To call a method from inside the main method a)Type the name of the method
		//                                             b)Put the values inside the method parenthesis
		// In a static method non-static things cannot be used. When you create a method which is out of the main method, you have to make it 
		// "static" otherwise you cannot use it inside the main method.
		
		/*
		 Java looks at the method names first to select the method to use, if the names are the same
		 Java looks at the parameters and makes the selection according to the parameters.
		 */
		
		/*
		 You can use same names for the methods by using the followings;
		 1) Change the number of parameters
		 2( Change the data type of the parameters
		 3) If the data types are different, change the order of parameters, 
		 otherwise changing the order won't work even when you change the names of the parameters.
		 */
		
		/*
		 Overloading : If you create methods whose names are same, it is called "(method) overloading"
		 */
		add(13.0,4.0);//17.0
		add(2,3,4);//9.0
		multiply(2,3,0.5);//3.0
	}
	/*
	 Create a method which adds two numbers 
	 Call the method from inside the main method.
	 */
	
	public static void add(double n1, double n2) {
		System.out.println(n1 + n2);
	}
	public static void add(int n1, double n2) {
		System.out.println(n1 + n2);
	}
	public static void add(double n1, int n2) {
		System.out.println(n1 + n2);
	}
	//Create a method which multiplies 3 numbers, call the method from main method.
	 // # When you create a method, if you create variables inside the method parenthesis, they are called "parameters"
		 public static void multiply(double n1, double n2, double n3) {//These are parameters, there are 3 of them here
			 
	// # When you call a method, if you use some values inside the method parenthesis, they are called "arguments"
			  
			 
			 System.out.println(n1*n2*n3);// These are arguments, there are 3 of them here also
		 }
		 //Create a method which adds 3 numbers
		 public static void add(double n1,double n2, double n3) {
			 
			 System.out.println(n1+n2+n3);
		 }
		 
	
	
	 }

	


