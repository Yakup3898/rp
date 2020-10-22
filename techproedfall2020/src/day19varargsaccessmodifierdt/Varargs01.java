package day19varargsaccessmodifierdt;

public class Varargs01 {
	
	/*
	 1) If you want a method to rum with different number of arguments, you can use
	 "varargs(Variable Arguments)".
	 2)"varargs" can run with from 0 arguments ot infinitely many,there is no any limitation
	 3)Varargs must be the last parameter every time.
	 4)In a method as a parameter you can use just one varargs because, if you use more than 1 varargs at least 
	 one of them will not be the last elements. This is a conflict with the 3rd rule.
	 So don't put more than one varargs in a method parenthesis.
	 4)If you use varargs in a method parenthesis, always it should be the last parameter.
	 5)You cannot use more than one varargs in a method parenthesis
	 */

	public static void main(String[] args) {
		
		//Create a method which adds 2 integers
		addByVarargs(3,5);
		addByVarargs();
		addByVarargs(2);
		addByVarargs(2,4,6,8,10);
		concat("*", "A", "l", "i"); 
		m(5,6,7,8);// length is 2
		m(11,12);// length is 0 
		
		
	}
	
//	public static void  add(int a, int b) {
//		System.out.println(a+b);
//		
//		
//	}
	
	public static void addByVarargs(int... a) {
		int sum =0;
		for(int w : a) {
			sum = sum + w;
		}
		System.out.println(sum);
	}
	
	public static void concat(String x, String... s) {
		String result = "";
		for(String w : s) {
			result = result + w + x;
		}
		System.out.println(result);
	}
	
	public static void m(int x, int y, int... z) {
		System.out.println(z.length);
	}
	
	
	
	
	
	
	
	
	

}
