package day17lists;

import java.util.Arrays;
import java.util.Scanner;

public class ForLoop06 {

	public static void main(String[] args) {
		/*
		 Ask user to enter an integer. and create a squared multi dimensional Array
		 Example: If user enters 3 ==> [[3,3,3].
		                                [3,3,3]
		                                [3,3,3]]
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int length = scan.nextInt();
		
		int arr[][] = new int [length][length];
		//you can only use for loop, not for-each loop because here you don't have any elements yet.
		for(int i=0 ; i<length;i++) {
			for(int k=0; k<length;k++) {
				arr[i][k] = length;
			}
		}
		System.out.println(Arrays.deepToString(arr));
		
		scan.close();
	}

}
