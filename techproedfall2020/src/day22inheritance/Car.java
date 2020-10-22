package day22inheritance;

public class Car extends Vehicle {
	/*
	 When you create a constructor with parameter in parent class, Java will remove the default
	 constructor from parent class.
	 
	 When you create a constructor in Child Class, it will look for the
	 default constructor from the parent class automatically. But it is removed.
	 Because of that Java complains, to stop that you must call the existing parent constructor by using super keyword.
	 
	 Homwork: Explain the differences:
	 a) super() and this()
	 b) super and this
	 c) super() and super
	 d) this() and this
	 */
	
	public int price = 10;
	public String make = "Toyota";
	
	public Car() {
		super(5);
		System.out.println(this.price);//10
		System.out.println(super.price);//20
		System.out.println("Car no-parameter");
	}
	
	public Car(String make) {
		super(7);//no difference with the values inside the super class. just for the existing constructor calling. don't be confused
		System.out.println("Car with parameter");
	}

}
