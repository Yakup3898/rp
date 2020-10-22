package day16multidimensionalarraysnt;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {
	
	/*
	 1) Lists are used to store multiple data like arrays.
	 2) Lists are flexible in length, but Arrays are not.
	 3) Lists accept just non-primitive ones as data type
	 */

	public static void main(String[] args) {
		
		// To create a list we have 3 ways
		
		//1.Way: 
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		//2.Way:
		ArrayList<Integer> list2 = new ArrayList<>();
		
		//3.Way
		//On the left side you can type just "List", but on the right side 
		//do not do it.
		List<Integer> list3 = new ArrayList<>();
		
		//How to print a list on the console
		System.out.println(list3);//[]
		
		//How to add elements in a list
		list3.add(11);
		list3.add(12);
		list3.add(0, 23);
		list3.add(2, 44);
		System.out.println(list3);//[23, 11, 44, 12]
		
		//How to get a specific element from the list
		System.out.println(list3.get(1));//11  so mention the index of the element you want to get by using get() method.
		
		//How to get the number of elements in a list
		System.out.println(list3.size());//4 (we use "length" to get this but in lists we use size() method.) 


	}

}
