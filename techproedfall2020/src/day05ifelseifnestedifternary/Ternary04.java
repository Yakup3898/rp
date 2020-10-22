package day05ifelseifnestedifternary;

import java.util.Scanner;

public class Ternary04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int n1 = scan.nextInt();	
		
		String result = (n1>99 && n1<1000) || (n1<-99 && n1>-1000) ? "This number has 3 digits." : "This number has no 3 digits";
	System.out.println(result);
		
		scan.close();
		
	}

}
