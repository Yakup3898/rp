package day02scanner;

public class IncrementAndDecrement {

	public static void main(String[] args) {
	 /*
	  Increment means increase the value of a variable
	  */
		int num01 = 12;
		System.out.println("before incrememt: " + num01);
		//1. Way to increase the value of a  variable
		num01 = num01 + 5;
		System.out.println("after incrememt: " + num01);
		
		//create an int variable and increase its value by 3, then by 4 then by 5
		int num02 = 2;
				num02 = num02 + 3;
				num02 = num02 + 4;
				num02 = num02 + 5;
		System.out.println(num02);
		
		//2. Way to increase the value of a  variable
		
		//num03 = num03 + 3; ==> num03+=3;
		int num04 = 1;
		num04+=3;
		num04+=4;
		num04+=5;
		System.out.println(num04);
		//3.way to increase the value of a  variable by 1. just for increasing by 1
		int num05 = 12;
		num05++;
		System.out.println(num05);
		
		//create an int variable and increase its value by multiplication
		int num06 = 6;
		num06 = num06 * 2;
		System.out.println(num06);
		//Do not put any space between operation and equal sign
		num06*=3;
		System.out.println(num06);
	 
	/*
	 1)Decrement: decrease the value of a variable
	 
	 */
		//create a variable and decrease it by 5,3, and 1 by using 3 different ways
		int num07 = 10;
		num07 = num07 - 5;
		num07-=3;
		num07--;
		System.out.println(num07);
		
		//create a variable and decrease it by 2 and 3 by using division operation
		int e = 20;
		e = e / 2;
		e/=2;
		System.out.println(e);
		
		//Post and Pre Increment / Post and Pre Decrement
		int x = 12;
		
		System.out.println(x++); // Post Increment
		System.out.println(x);
		System.out.println(++x);
		int y = 15; 
		System.out.println(++y);
		System.out.println(y++);
		System.out.println(y);
		++x; // pre increment 
		
		 //--z pre declement
		
		int z = 21;
		System.out.println(--z);
		System.out.println(z--);
		System.out.println(--z);
		
		
		
		
	}

}
