package day05ifelseifnestedifternary;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two integers");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		int result = n1 > n2 ? n2 : n1;
		System.out.println("Minimum " + result);
		
		scan.close();

	}

}
