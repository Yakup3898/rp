package day19varargsaccessmodifierdt;

import day18passbyvaluepassbyreferenceddatetime.AccessModifiers03;

public class AccessModifier02 extends AccessModifiers03{//If you type that code, it means that AccessModifier02 class become the child of 
	// AccessModifiers03. So you created parent-child relationship between these two classes to be able to reach the variables
	//in parent class from child class by using "protected" access modifier.

	public static void main(String[] args) {
		
		/*
		 1) In AccessModifiers01, I created private, protected, default, and public instance variables.
		 In AccessModifiers02, I created an object to access them but I could not access to the privated one.
		 So private class members cannot be accessed from other classes.
		 
		 2)From different packages, you cannot access to default class members.
		   For example; if you create a variable in package A, you can access to the variable from all 
		   classes in the package A but you cannot access to the variable from other packages.
		   
		 3) From different packages, hou have 2 options for "protected" ones.
		 If you are in "Child" class, you cannot access to the protected ones.
		 
		 4) public class members can be accessed from everywhere. There is no any restriction for 
		 public class members.
		 #just like accessing variables, methods have the same exact rules.
		 */
		
		AccessModifiers01 obj1 = new AccessModifiers01();
		
		System.out.println(obj1.defaultAge);//27
		System.out.println(obj1.protectedAge);//25
		System.out.println(obj1.publicAge);//29
		//If you want to use a class from another package you have to import
		AccessModifiers03 obj2 = new AccessModifiers03();
		System.out.println(obj2.publicNameInPackageDay18);
		System.out.println(obj1.protectedAge);
		
		
		
		

	}

}
