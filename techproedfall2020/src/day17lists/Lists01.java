package day17lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists01 {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		list1.add("Ali");
		list1.add("Veli");
		list1.add("Mary");//[Ali, Veli, Mary]
		list1.add(1, "Angie");
		System.out.println(list1);//[Ali, Angie, Veli, Mary]
		list1.add("Veli");// Java prints the additional elements according to the order of the line
		//so if you want to add smt on the last element, just add it on the last line.
		System.out.println(list1);//[Ali, Angie, Veli, Mary, Brad]
		
		System.out.println(list1.size());//5
		
		System.out.println(list1.get(3));//Mary
		System.out.println(list1.size());//5  .get() method doesn't destroy the element which you got.

		//How to check if an element exists in the list
		System.out.println(list1.contains("Veli"));//true
		System.out.println(list1.contains("XXX"));//false
		
		//How to get index of first occurrence of an element. indexOf() method.
		//If there are 2 same elements, indexOf() method will give you the first occurrence of the element. 
		//so if there would be 2 "Veli" inside of the list, you would get 2 again.
		System.out.println( list1.indexOf("Veli"));//2
		System.out.println( list1.indexOf("XXX"));//-1
		
		//How to get index of last occurence of an element
		//If you change the last element("Brad") into "Veli" you would get 4 on the console
		System.out.println(list1.lastIndexOf("Veli"));//actually 2 now but 4 if you do like the statement above.
		System.out.println(list1.lastIndexOf("XXX"));
		
		//How to remove an element by using index
		//If you use remove() method with index, it will return the element which is removed
		//For lists, using methods is enough to update, no need to make assignment
		//Because of that lists are called "mutable"
		System.out.println(list1.remove(1)); //Angie
		
		System.out.println(list1);//[Ali, Veli, Mary, Brad]
		
		//For Strings, if you want to see updates on the String, you have to make assignment.
		//Because of that Strings are called "immutable"
		String s = "Java oog Java";
		s.replace("a", "");
		System.out.println(s);//Java oog Java. it will print the same because you didn't make assignment just wrote the method.
		
		//How to remove a specific element by using the element
		//If you use remove() method with the element, it will remove the first occurence of the element
		System.out.println(list1.remove("Veli"));//true
		System.out.println(list1);//[Ali,Mary,Veli] if you change "Brad" with "Veli" . right now =>[Ali, Mary, Brad]
		
		System.out.println(list1.remove("XXX"));//false
		
		//Add some elements
		list1.add("Mary");
		list1.add("Mary");
		list1.add("Ali");
		list1.add("John");
		System.out.println(list1);//[Ali, Mary, Veli, Mary, Mary, Ali, John]
		
		//How to update an element with index
		list1.set(2, "Ahmet");
		System.out.println(list1);//[Ali, Mary, Ahmet, Mary, Mary, Ali, John]
		
		/*
		 Create an integer list which has 5 elements
		 Update all elements by adding "*"(asterisk) on the right of every element
		 Print the updated lists on the console.
		 Ex; [1,2,3,4,5] ==> [1*,2*,3*,4*,5*]
		 */
		
		List<Integer> list2 = new ArrayList<>();
		
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		System.out.println(list2);//[1, 2, 3, 4, 5]
		List<String> list3 = new ArrayList();
		
		for(int i =0;i<list2.size();i++) {
			list3.add(list2.get(i) + "*");
		}
		System.out.println(list3);//[1*, 2*, 3*, 4*, 5*]
		
		//How to get a part of List (just like subString method from Strings)
		System.out.println(list1.subList(2, 5));//[Ahmet, Mary, Mary]
		
		//How to add a list into another list at the end
		list1.addAll(list3);
		System.out.println(list1);//[Ali, Mary, Ahmet, Mary, Mary, Ali, John, 1*, 2*, 3*, 4*, 5*]
		System.out.println(list3);//[1*, 2*, 3*, 4*, 5*] this won't change because you updated list1 not list3
		 
		//How to add a list into another list at a specified index
	    list3.addAll(3, list1);
	    System.out.println(list3);//[Ali, Mary, Ahmet, 1*, 2*, 3*, 4*, 5*, Mary, Mary, Ali, John, 1*, 2*, 3*, 4*, 5*]
	    
	    //list3.removeAll() method removes all elements from a list1 from list3
	    list3.removeAll(list1);
	    System.out.println(list3);//[]
        
	    
	    //If you want to make a list empty use clear()
	    System.out.println(list2);//[1, 2, 3, 4, 5]
	    list2.clear();
	    System.out.println(list2.isEmpty());//true
	    System.out.println(list2);//[]
	    list2.clear();
	    
	    list3.add("1*");
	    list3.add("Ali");
	    list3.add("John");
	    System.out.println(list3);
	    //If you want to check if multiple elements exist in a list,
	    //put the elements into a list then use containsAll()
	   System.out.println( list1.containsAll(list3));//true
	   
	   //How to sort elements in a list  (important) 
	   System.out.println(list1);//[Ali, Mary, Ahmet, Mary, Mary, Ali, John, 1*, 2*, 3*, 4*, 5*]
	   Collections.sort(list1);
	   System.out.println(list1);//[1*, 2*, 3*, 4*, 5*, Ahmet, Ali, Ali, John, Mary, Mary, Mary]
	   //Java sorted according to the ASCII table.
	    
	}

}
