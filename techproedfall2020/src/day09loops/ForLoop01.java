package day09loops;

public class ForLoop01 {

	public static void main(String[] args) {
		
		//If you need to do same action many times then using loop is the best solution
		//For example; I want to print "Hello World" 10 times on the console
//		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.println("Hello World");
//		System.out.println("Hello World");
		
		//By using for loop 
		for(int i=1;i<=10 ;i++) {
			System.out.println("Hello World");
		}
 		
		//Print the integers from 10 to 44 in the same line with a space between two numbers
		
		for(int i=10;i<45;i++) {
			System.out.print(i + " ");
		}
		//Print the integers from 44 to 10 in the same line with a space between two numbers
		System.out.println();
		for(int i =44; i>9;i--) {
			System.out.print(i + " ");
		}
		//Print the even integers from 44 to 10 in the same line with a space between two numbers
		System.out.println("============");
		
		for(int i=44;i>9;i--) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}
		//Print the odd integers from 11 to 46 in the same line with a space between two numbers
				System.out.println("============");
		for(int i=11;i<=46;i++) {
			if(i%2!=0) {
				System.out.print(i + " ");
			}
		}
		//Print all positive integers which are divisible by 6 and 8 and less than 500
		System.out.println("==============");
				
		for(int i=1;i<500;i++) {
			
			if(i%6==0 && i%8==0 ) {
				
				System.out.print(i + " ");
			}
		}
		
		
		

	}

}
