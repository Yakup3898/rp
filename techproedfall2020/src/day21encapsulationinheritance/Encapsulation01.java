package day21encapsulationinheritance;

public class Encapsulation01 {
	
	/*
	 1)We use "encapsulation" to hide data and method implementations.
	 2)Encapsulated codes should have following characteristics:
	    a)Everyone knows how to access to the encapsulated data or method
	    b)It should be used easily even the code is complicated
	    c)There should not any side effects of the code, to the rest of the application
	    
	 3)How to make encapsulation 
	    a)Make the access modifier "private"
	    b)Create "getter" and "setter" methods.
	      "getter method" is used to read the encapsulated data 
	      "setter method" is used to update the encapsulated data
	      
	       
	 4)The advantages of Encapsulation
	   a)It gives us flexibility, whenever we want we can update encapsulated data by using setter methods
	   b)Reusability, we create getter and setter methods just once and use them again and again from
	     different classes.
	   c)Maintainability, by using setter methods we can update the value whenever we want.      
	 5) After creating private variables, if you don't create any setter method it means nothing will 
	    be updated in the class. Because of that the class is called "Immutable Class"  
	*/
	
	private String collegeName = "FIU";
	private int age = 23;
	private boolean old = false;

	public static void main(String[] args) {
		
	}
	/*
    #Getter method. You have to make getter method public because you want to let user to
    access to read your code/method. It should be public so everyone in different classes get access to it.
    after writing public, getter method's return type should be same with the variable. [private String collegeName = "FIU";]
    -method name can be whatever you want but write it according to the camelCase rules and write get at the beginning.(getCollegeName)
    -then parenthesis and curly braces. it is different from void(String) so you write return keyword at the end.
    then you write whatever you read. (collegeName in this case.)
    */
	//public String getCollegeName() {
	//	return collegeName;
	//}
    //How to create setter method. it should be public again because we want to access to hidden data from every class
	//return type should be void because setter method will return anything, but only change the data(just doing an action.)
	//to get the old variable and update it, put it into the set parenthesis with data type of course.
	//then write this class and reach the getter method, put equal sign and write the parameter on the right, which is collegeName, ;. that's it
	// this method is used to change the value of the variable.
	//public void setCollegeName(String collegeName) {
	//	this.collegeName = collegeName;
	//}

	//public int getAge() {
	//	return age;
	//}

	public void setAge(int age) {
		this.age = age;
	}

	//For booleans getter method's name starts with "is" if you use "get" it works 
	//but this is the naming convention. it's better to obey the IT culture. when you work in a company, you always see this as "is"
	public boolean isOld() {
		return old;
	}

	public void setOld(boolean old) {
		this.old = old;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getAge() {
		return age;
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	


