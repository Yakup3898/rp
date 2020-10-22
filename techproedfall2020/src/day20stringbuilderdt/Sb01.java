package day20stringbuilderdt;

public class Sb01 {
	
	/*
	 1) String class is immutable, sometimes we need mutable Strings but String class cannot provide 
	 mutable Strings. Because of that, Java created another class which is "StringBuilder" class.
	 When you create a String by using StringBuilder it will be mutable.
	 2) StringBuilder doesn't have "synchronization" feature. To able to do synchronization Java 
	 uses "StringBuffer" class. StringBuilder and StringBuffer have almost same methods. The difference is
	 in "synchronization" and "speed". StringBuilder is faster than StringBuffer.
	 */

	public static void main(String[] args) {
		
	String str1 = "Java";
    concat(str1);
    //Java uses pass by value and Strings are immutable , because of that we get "Java" as output.
    System.out.println(str1);
    
    //How to create StringBuilder
    //1.way:
    StringBuilder sb1 = new StringBuilder();//You created an empty String
    System.out.println(sb1.capacity());//16 if you don't declare the number. Java will declare 16
    
    
    //How to add String to a StringBuilder. you will use append() [concat() in Strings, add() in Lists] method. it can be used in chain mode/method
    sb1.append("Animal");
    System.out.println(sb1);
    System.out.println("Before trim " + sb1.capacity());//16
    sb1.trimToSize();//if you use this method. it will trim the extra sizes, so the capacity will be 6, so you save memory.
    //trimToSize() removes the unused reserved area.
    System.out.println("After trim " + sb1.capacity());//6
    
    sb1.append("X");
    System.out.println(sb1);
    
    sb1.append("Y").append("ZZZZZZZZZZZZZZZZ");
    System.out.println(sb1);
    System.out.println(sb1.capacity());//34 but normally less than that ==. 16*2 +2 = 34 IF you exceed 16, the next capacity would be this
    
    
    //2.way:
    StringBuilder sb2 = new StringBuilder(10);//You want to create a StringBuilder,
                                              //which its capacity(name of its length) is 10 characters.
                                              //if you are sure about how many characters you will use declare the number
                                              //of characters to save memory just in case although you can write more than that
    
    sb2.append("People");
    System.out.println(sb2);//People. so you can use less characters 

    sb2.append("XYZTU");
    System.out.println(sb2);//PeopleXYZTU more than 10 characters. so if you want to write more than 10 no problem. 
    //it is very flexible like lists.
    
    //3.way:
    StringBuilder sb3 = new StringBuilder("Learn Java!");//If you are sure about to String content use this way
    
    sb3.append("X");
    System.out.println(sb3);//Learn Java!X

    //How can I get the number of characters in a StringBuilder
    StringBuilder sb4 = new StringBuilder("Sleep less, life is short");

    //1.way
    sb4.trimToSize();// ==> Before capacity() method if you use trimToSize() you can get the 
    //number of characters but not recommended. Because there is a length() method. use it easily.
    System.out.println(sb4.capacity());//41 before trimming after 25

    //2.way  Recommended
    System.out.println(sb4.length());//25
    
    //How to delete multiple characters from a StringBuilder
    //Starting index is inclusive , ending index is exclusive
    sb4.delete(10,sb4.length());
    System.out.println(sb4);
    
    //How to delete a character at a specific index
    sb4.deleteCharAt(sb4.length()-1);
    System.out.println(sb4);//Sleep les
    
    //How to get a part of StringBuilder
    System.out.println(sb4.substring(0, 5));//Sleep   you have to put in system.out because subString() method returns String, which is 
    //immutable. If you don't put the method in syso and put it just the method, the result will not be updated.
    //You can see the definitions of what methods will return what on the right side of the methods.
    System.out.println(sb4);
    
    //How to get index of a specific character
    System.out.println(sb4.indexOf("p"));//4
    System.out.println(sb4.indexOf("e"));//2 first occurence of "e" same as Strings
    System.out.println(sb4.indexOf("ep"));//3
    
    
    //How to get a character at specified index 
    System.out.println(sb4.charAt(0));//S
     
    //How to add character/s to a specified index you can also use method chain
    sb4.insert(5, "X").insert(sb4.length()-1, "s");
    System.out.println(sb4);//SleepX less
    
    //How to reverse String
    sb4.reverse();
    System.out.println(sb4);//ssel XpeelS
    
    //How to convert StringBuilder to String
    //toString() is returning String because of that it cannot update the StringBuilder
    //If you want to use StringBuilder as a String use method chain.
    sb4.toString();
    

	}
	
	public static String concat(String str) {
		return str + "X";
	}

}
