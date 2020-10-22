package day19varargsaccessmodifierdt;

public class AccessModifiers01 {
	
	/*
	 1) If a class member is "private" it can be seen / used/ accessed just from inside the class.
	  If you are in a different class,private class members cannot be seen/ cannot be used/ cannot be accessed.
	 2) If a class member is "default", it cannot be seen ,used, accessed from other packages. but you can in the same package.
	  "default" and "package private" are synonyms.
	  They are most probably ask what are the access modifiers.
	  3)  If a class is "public", it can be accessed from everywhere, there is no any restriction
	  
	  4) If a class member is "protected", it can be accessed from the package and it can be accessed from classes in different packages
	  if the class is child class.
	  
	  Note: For classes, "private" amd "protected" access modifiers cannot be used. It is not meaningful because we create
	  classes to be able to use objects from it. It is not good to make them unaccessible.
	    You can use just "public" or "default" access modifiers.
	 */
	private int privateAge = 23;
	protected static int protectedAge = 25;
	int defaultAge =27;//If you don't type any access modifier, it means default access modifier
	public int publicAge = 29;

	public static void main(String[] args) {
		
		

	}

}
