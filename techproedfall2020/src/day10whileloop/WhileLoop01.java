package day10whileloop;

import java.util.Scanner;

public class WhileLoop01 {

	public static void main(String[] args) {
	  /*
	   Ask user to get the number of the rows to create the following image
	   exp; if user enters 5, the image:  
	                                                 *1
	                                                 **2
	                                                 ***3
	                                                 ****4
	                                                 *****5
	   */
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an integer");
		
		int n = scan.nextInt();
		int y=1;
		while(y<=n) {
			for(int i=1; i<=y; i++) {
				System.out.print("*");
			}
			
			System.out.println(y);
			y++;
		}
		scan.close();
		
		
		
		
		
	}

}
