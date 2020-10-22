package day04ifelsestatementnt;

import java.util.Scanner;

public class IfElse05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the quantity you want to buy");
		int q = scan.nextInt();
		System.out.println("Enter the unit price");
		double up = scan.nextDouble();
		if(q > 1000) {
			System.out.println(q * 0.9 * up);
		}else {
			System.out.println(q*up);
		}
		scan.close();

	}

}
