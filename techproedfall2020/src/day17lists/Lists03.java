package day17lists;

import java.util.ArrayList;
import java.util.List;

public class Lists03 {
	
	/*
	 for-each loop is the updated version of for-loop
	 ==> It is easy to type
	 ==> It is easy to read
	 ==> It eliminates the possible programmer errors
	 */

	public static void main(String[] args) {
		/*
		 Create an integer array with 5 elements 
		 Convert it to a list 
		 Add 11, and 13 into the list, 11 will be at the beginning, 13 will at index 3 
		 Increase the value of every element by 3
		 Print the multiplication of the elements from index 2 to index 5
		 */

		List<Integer> list1 = new ArrayList<>();
		list1.add(11);
		list1.add(13);
		list1.add(15);
		list1.add(12);
		list1.add(14);
		System.out.println(list1);
		
		//Use for loop to print all elements on the console in the same line with a space between the elements
		for(int i=0;i<list1.size();i++) { 
			System.out.print(list1.get(i) + " ");
			
		}
		
		System.out.println();
		
		//Use for-each loop to print all elements on the console in the same line with a space between elements 
		for(Integer w : list1) {
			System.out.print(w + " ");
		}
		
		System.out.println();
		
		//Use for-each loop to print even elements in the list
		//1.way:
		for(Integer w : list1) {
			if(w%2==0) {
				System.out.print(w + " ");
			}
		}
		
		System.out.println();
		
		//2.way: "continue;" keyword
		for(Integer w : list1) {
			if(w%2!=0) {
				continue;
			}
			System.out.print(w + " ");
		}
		
		System.out.println();
		
		//Use for-each loop to print last 3 elements in the list
		//1.way
		for(Integer w : list1) {
			if(list1.indexOf(w)<list1.size()-3) {
				continue;
			}
			System.out.print(w + " ");
		}
		
		System.out.println();
		
		//2.way
		for(Integer w : list1) {
			if(list1.indexOf(w)>=list1.size()-3) {
				System.out.print(w + " ");
			}
		}
		
		System.out.println();
		
		//Use for-each loop to print first 3 elements in the list
		
		//1.way
		for(Integer w : list1) {
			if(list1.indexOf(w)<3) {
				System.out.print(w + " ");
			}
		}
		System.out.println();
		
		//In the interview they can ask the difference between continue() and break()
		//2.way:
		for(Integer w : list1) {
			if(list1.indexOf(w)>=3) {
			break;
			}
			System.out.print(w + " ");
		}
		
		
	}

}
