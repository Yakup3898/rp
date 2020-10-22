package day12methodcreationconstructorsnt;

public class InstanceAndLocalVariables {
	
	
	/*
	 1)If you create a variable outside of the main method, it is called "instance variable"
	 a) If you don't initialize(assigning value) an instance variable, Java will assign them default values.
	    for byte, short, int , long,    default value is 0
	    for char ,    default value is 0 
	    for boolean, default value is "false"
	    for float and double, default value is 0.0
	    for String, default value is null(like an empty object)
	    
	 b) Instance variables can be used in entire class. but local variables are only used inside the method which you created in
	 
	 2) If you created a variable inside a method, it is called "local variable"
	    a) Do not forget to initialize(assign) local variables. for "instance" variables there's no problem to initialize it.
	    If you try to use local variables before initializing Java complains
	 */
	static int i;
	static boolean b;
	static double d;

	public static void main(String[] args) {
		
     int k =7;
		
		System.out.println(i + " - " + b + " - " + d);
		
		
	}
	
	public static void add(int n1, int n2) {
		int m =11;
		i++;
	}

}
