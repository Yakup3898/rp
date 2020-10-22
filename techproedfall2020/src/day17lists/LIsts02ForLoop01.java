package day17lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LIsts02ForLoop01 {

	public static void main(String[] args) {
		
		//Working with lists is easier than working with arrays
		//Because of that sometimes we need to convert arrays to lists
		
		String s[] = {"A","C","M","B"};
		
		//To convert an array to a list, use asList() method from Arrays Class.
		List<String> ls = Arrays.asList(s);
		
		System.out.println(ls.size());
		
		ls.set(1, "CX");
		System.out.println(ls);
		
		//If you create a list from an array by using asList() method, you cannot use 
		//the methods which affects the size from ArrayList Class
		//ls.remove(1);
		//ls.clear();
		//Is.add("K"); it gives runtime error because a list which is converted from an Array(immutable) also becomes a kind of immutable 
	    
		//If you want to be able to use all methods, do not use asList() to convert
		//Use loops to transfer elements to a new list
		
		List<String> nls = new ArrayList<>();
		for(int i=0;i<s.length;i++) {
			nls.add(s[i]);
		}
		System.out.println(nls);//[A, CX, M, B] 
		//#Note: When you use remove() method with index, you will get the removed element on the console.
		//If you use the remove() method with the element, you will get boolean(true or false).
	    //remove(1); =>CX - remove("CX") => true/false
		nls.remove(1);
		
      	System.out.println(nls);//[A, M, B]
      	
      	//How to convert a list to an array (not very common because list is already an updated version of an array)
      	String arrayFromList[] = nls.toArray(new String[0]);//everytime you write new String[0] to convert an array from list
      	System.out.println(Arrays.toString(arrayFromList));// Same output but as an array

	}

}
