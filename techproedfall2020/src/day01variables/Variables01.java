package day01variables;

public class Variables01 {

	public static void main(String[] args) {
		
		/*
		 Variable is the name of reserved area in memory.
		 To create variable you need to type 1)Data type 2)Variable name 3)Semicolon
		 a)int stands for integer
		 b)After creating a variable if you put a value for it, we will tell
		 we "assigned a value" or "initialized the variable"
		 */
		int age = 23;
		int weight = 83;
		String enes = "yakup";
		//Typing codes short is very important in coding area
		//int height = 11;
	    //int length = 12;
		//int money = 13;
		//int salary = 14; instead of typing like that do this;
		int age1 = 27, height = 185, distance = 470;
		
        int height1 = 11, length = 12, money = 13, salary = 14;
        /* 
         Data types: There are 2 main data types 1)Primitive Data Types
                                                 2)Non-Primitive Data Types
           Primitive Data Types: 1)boolean : it is just used for "true" and "false" options
                                 boolean retired = true; means he is retired
                                 boolean data types just use 1 bit in memory 
                                 2)char : it is used for just/only single characters ==> A, c, 1,
                                 !, ?
                                 When you use char as data type, you have to put
                                 value between single quotes ==> ' '
                                 DO NOT forget that space is a character in java
                                 char initial = 'A';
                                 char number = '3';
                                 char num = '2';
                                 char num2 = ' ';
                                 char can be used single characters so if you do not
                                 put anything between the single codes you will get error.
                                 char num3 = '' don't do that one. In here, there is 
                                 not even space between the single quotes.
                                 Every char variable uses 16 bits/2 bytes in memory.
                                 3)byte : it is used for the integer values from 
                                 -128(inclusive/included) to 127(inclusive/included)
                                 byte age = 72;
                                 byte length = 12;
                                 byte debt = -100;
                                 byte uses 8 bits from memory
                                 4)short : it is used for the integers from -32768 to 32767
                                 short population = 23000;
                                 short uses 16 bits from memory
                                 5)int : it is used from -2,147,483,648 to
                                 2,147,483,647
                                 It uses 32 bits for every integer variable.
                                 6)long : It is used from -9,223,372,036,854,755,808 to
                                 -9,223,372,036,854,755,807
                                 It uses 64 bits from memory
                                 7)float It is used for decimal numbers(ondalik sayi)
                                 It uses 32 bits. If you want to use float, you have to put
                                 'f' or 'F' at the end of the number.
                                 If you don't write 'f' java will see this as double
                                 float num = 3.2f; (or F)
                                 for floats in decimal part, after the comma you can use 7 digits at most
                                 float num2 = 1.1234567f;
                                 8)double : It is also used for decimal numbers like float
                                 It uses 64 bits.
                                 double salary = 2345.43;
                                 In decimal part you can use 16 digits at most.
                                 
          Non-Primitive Data Types 
          String is a non-primitive data type. It is used for sentences, paragraphs, or
          single or multiple characters which are put between the double quotes. "
          String name = "Yakup";
          String name = "Yakup went to school."
          String initial = "A"; (you can use this for char also.
          Just don't forget to put single quotes, not double. char initial 'Yakup';)
          String num = "12"; as you can see, you can write anything between the double quotes.
          String str = " " ==> it is okay
          String str2 = "" == it is okay 
          
          Difference between "Primitive" and "Non-Primitive" date types
          1) Primitive data type names can be typed by using lower cases but
          the initial of the non-primitive data types must be upper-case.
          2)    Primitive data types use different amount of memory but
          all non-primitive data types use same amount of memory.
          3) Primitive data types are created by Java. We cannot create a
          new data type. We have to use only 8 of them.
          However, we can create new NON-PRIMITIVE data types.
          4) (the most important one) In primitive data types we have just values, but
          for non-primitive ones we have value and methods inside the reserved area.
          5) Primitive data types are stored in "Stack" memory and Non-Primitive data types
          are stored in "Heap" memory. Stack memory is small. Heap memory is huge.(remember by the initials)
          Heap memory is like an ocean. you cannot find anything when you throw smt into ocean.
          In order to find the variable you write, java creates an address of that non- primitive data,
          and sends the reference(address in java language) automatically to stack memory.
          We have to have the reference of the heap memory into stack memory.
          
           What is the difference between "stack" and "heap" memory?
           1)Stack is small, heap is huge
           2) Stack can store a)Primitive data types b)Address(reference) of the 
           non-primitive data types
           Heap can store only non-primitive data type                                       
         */
        
        char initial = 'Y';
        System.out.println("Java is easy");
        System.out.println("Yakup");
        System.out.println("Turkey");
        System.out.println("noneofyallbusiness");
        
        System.out.println(initial); //To print the value of a variable on the console, you just put
                                     //the variable's name without any quotes inside the parenthesis
        
        String name = "yaki";
        System.out.println(name);
        System.out.println();
       
	   //If you use println java will print then navigate to the next line
	
	     System.out.println("HelloWorld");
	                        //If you use print java will print and wait in the same line
	     System.out.print("Hello");
	     System.out.print("World");
	     
	     boolean retired = true;
	     System.out.println(retired);
	     int num = 54;
	     
	}
	
}

        
	

