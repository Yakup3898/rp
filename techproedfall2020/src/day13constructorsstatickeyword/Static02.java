package day13constructorsstatickeyword;

public class Static02 {

	public static void main(String[] args) {
		
		Static01 obj1 = new Static01();
		System.out.println(obj1.age);//23
		obj1.subtract(11, 3);//8
		//obj1.add(10, 11);//21 not recommended because you can use just the class name easily.
		
		System.out.println(Static01.height);//6
		Static01.add(4, 15);//19
		
		Static01 obj2 = new Static01();
		
		//Update static variables
		Static01.height++;
		System.out.println(obj1.height);
        System.out.println(obj2.height);
        
        //Update instance variables
        obj1.age++;
        System.out.println(obj1.age);//24
        
        System.out.println(obj2.age);//23
        
        
        
        
        
        
        
	}

}
