package day15arraysnt;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		
		int a[] = {2,7,1,5};
		int b[] = {1,7,5,2};
		int c[] = {2,7,1,5};
		// to say that two arrays are equal, their elements are the same and the indexes of the elements are the same also
		System.out.println(Arrays.equals(a, c));//true . it means that these two arrays have same elements in same indexes
		System.out.println(Arrays.equals(a, b));//false . it means that these two arrays don't have same elements in same indexes 
	    //even though their elements are the same. so order of the elements is a must.
		
		//How to check if 2 arrays have same elements
		Arrays.sort(a);//[1,2,5,7]
		Arrays.sort(b);//[1,2,5,7]
		System.out.println(Arrays.equals(a, b));//true
		
		//One more String method ==> split()
		String s = "I like Java but Java needs to study hard to learn so study hard";
		String words[] = s.split(" ");//When you use split() method in a character, that character will be disappeared because it is splitted from there
		System.out.println(Arrays.toString(words));//[I, like, Java, but, Java, needs, to, study, hard, to, learn, so, study, hard]
		System.out.println(words.length);//14
		String part1[] = s.split("Java");
		System.out.println(Arrays.toString(part1));//[I like ,  but ,  needs to study hard to learn so study hard]
		
		//How many characters are used in String "s" by using split()?
		String part2[] = s.split("");
		System.out.println(Arrays.toString(part2));
		System.out.println(part2.length);//63
		
		//Print the number of characters except space by using split()
		String part3[] = s.replace(" ", "").split("");
		System.out.println(Arrays.toString(part3));
		System.out.println(part3.length);//50
		
		//Count, how many times "a" is used in the String "s"
		//1.way
		String part4[] = s.split("a");
		System.out.println(Arrays.toString(part4));//[I like J, v,  but J, v,  needs to study h, rd to le, rn so study h, rd]
		System.out.println(part4.length-1);//7 (there are 8 parts, but the number of splitting point is one less than parts as always in daily life.)
		
		//2.way 
		//"I like Java but Java needs to study hard to learn so study hard"
		String part5[] = s.split("");
		int counter=0;
		for(int i=0;i<part5.length;i++) {
			if(part5[i].equals("a")) {
				counter++;
			}
			
		}  
		System.out.println("The number of characters: " + counter);
		
		//Count the number of occurence of every character in a String. common interview question and homework

	}

}
