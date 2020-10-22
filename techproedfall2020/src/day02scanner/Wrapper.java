package day02scanner;

public class Wrapper {

	public static void main(String[] args) {
	
		/* 
		 1) Wrapper Class contains primitive value and some methods which can be used by primitives
		 2) How to name Wrapper Classes
		  *** int ==> Integer
		 byte ==> Byte
		 short ==> Short
		 long ==> Long 
		 float ==> Float
		 double ==> Double
		 *** char ==> Character
		 boolean ==> Boolean
		 */
		
		// What is the maximum value of byte data type?
		
		byte maxValueByte = Byte.MAX_VALUE;
		System.out.println(maxValueByte);

		// What is the minimum value of byte data type?
		byte minValueByte = Byte.MIN_VALUE;
		System.out.println(minValueByte);
		
		// What is the minimum and minimum value of short data type?
		short maxValueShort = Short.MAX_VALUE;
		System.out.println(maxValueShort);
		short minValueShort = Short.MIN_VALUE;
		System.out.println(minValueShort);
		//Hm: find the max and min values of int, long, float, double
		
		int maxValueInteger = Integer.MAX_VALUE;
		System.out.println(maxValueInteger);
		int minValueInteger = Integer.MIN_VALUE;
		System.out.println(minValueInteger);
		
		long maxValueLong = Long.MAX_VALUE;
		System.out.println(maxValueLong);
		long minValueLong = Long.MIN_VALUE;
		System.out.println(minValueLong);
		
		float maxValueFloat = Float.MAX_VALUE;
		System.out.println(maxValueFloat);
		float minValueFloat = Float.MIN_VALUE;
		System.out.println(minValueFloat);
		
		double maxValueDouble = Double.MAX_VALUE;
		System.out.println(maxValueDouble);
		double minValueDouble = Double.MIN_VALUE;
		System.out.println(minValueDouble);
	
		
	}

}
