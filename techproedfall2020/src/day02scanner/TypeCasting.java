package day02scanner;

public class TypeCasting {

	public static void main(String[] args) {
	
		
		 //byte < short < int < long < float < double
		  
		  //1.Auto Widening; If you convert small data type 
		  //to large ones there is nothing to do. Java will
		   //convert automatically.
		    
		   byte num01 = 12;
		   short num02 = num01;
				   
		//2. Explicit Narrowing: If you convert large data types 
		// to small ones, its name is Explicit Narrowing. Java doesn't
		//do it you have to do it manually by typing
		//small data type inside the parenthesis.		   
			int num03 = 14;
		   byte num04 = (byte)num03; 
		 
		   /* 
		    1.Convert int to double 
		    2.convert float to double
		    3. convert double to short 
		    4. convert int to short
		    */
		   int smt01 = 15;  //Auto casting
		   double smt02 = smt01;
		   
		   float smt03 = 11f; //auto casting
		   double smt04 = smt03;
		   
		   double smt05 = 21.2;  // explicit narrowing
		   short smt06 = (short)smt05;
		   
		   int smt07 = 34;   //explicit narrowing
		   short smt08 = (short)smt07;	   
		   
		  // How many different ways I can fix the following error?
		   float num13 = 3.42f; //float num13 = 3;23f
		                       //float num13 = (float)3,23;
		                       //double num13 = 3,23;
		   
		   //What do you see on the console?
		   int a = 5;
		   int b = 2;
		   System.out.println(a/b);
		   //if you divide int by int the result always will be integer
		   //Java cancels the decimal part and returns the whole part.
		   //Java does not make round operation
		   //5/3 ==> 1 for example
		   
		   //What do you see on the console
		   int c = 5;
		   double d = 3;
		   //If the data types are different the result will be the large data type
		   System.out.println(c/d);//1,6666...
		   //When you put at the end of any number Java will accept it as double
		   System.out.println(5d/2d);// 2.5
		  
		   
				   
				   
		   

	}

}
