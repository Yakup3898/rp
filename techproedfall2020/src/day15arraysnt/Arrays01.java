package day15arraysnt;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		//Create an array which has 4 integer elements with first way
		
		int a[] = new int[4];//[0,0,0,0]
		a[0]=14;
		a[1]=12;
		a[2]=13;
		a[3]=11;
		System.out.println(Arrays.toString(a));
		
		//How to put elements in ascending order
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		//Type a program to add all elements in the array "a"
		int sum =0;
		for(int i =0;i<a.length;i++) {
			sum = sum + a[i];
		
		}
		System.out.println("Sum : " + sum);
		// Create a char array which has 6 elements with second way
		
		char b[] = {'a','d','A','b','c','D'};
		System.out.println(Arrays.toString(b));
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		
		//Type a program to concatenate the elements in the array "b"
        String concat = "";
        for(int i = 0;i<b.length;i++) {
        	concat = concat + b[i];
        }
        System.out.println("Concatenated: " + concat);//Concatenated: ADabcd
        
        String c[] = {"Ali", "John", "ALI", "Brad", "Mary", "Angie"};//These are stored in heap memory, but inside
        //the array only the references of these elements is stored. When you print the elements,
        //Java take the Strings from the heap memory an then print them on the console.
        //So do not forget that arrays cannot store non-primitive things. But can store only the addresses(references) of them.
        System.out.println(Arrays.toString(c));//[Ali, John, ALI, Brad, Mary, Angie]
        
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));//[ALI, Ali, Angie, Brad, John, Mary]
        
        //Print the elements whose indexes are even on the console.
        for(int i =0;i<c.length;i++) {
        	if(i%2==0) {
        		System.out.print(c[i] + " ");//ALI Angie John (index 0,2,6)
        	}}
        //How to check if a specific element exists in the array or not
        		
        //To check if an element exists in an array or not we use "binarySearch()"
        //Be Careful!!! ==> Before using "binarySearch()" method you HAVE TO use sort()
        //If you use "binarySearch()" without using sort(), you will get a result but
        //it will not be meaningful
        		
        int d[] = {3,5,2,12,4,3,6};
        //Check if 12 exists in array "d"
        		Arrays.sort(d);
        		System.out.println(Arrays.toString(d));//[2, 3, 3, 4, 5, 6, 12]
        		//binarySearch() returns NON NEGATIVE values if the element exists.
        		//If the element exists you will get the index of the element from binarySearch() method.
        		System.out.println(Arrays.binarySearch(d, 12));//6 (6 is the index of the element which after sorted=>12)
        		
        		System.out.println(Arrays.binarySearch(d, 9));//-7 "-" means it doesn't exists in the array. 7 means if the number(9) 
        		//exists, it would be in the 7th order(not index just number) according to the sorted array.
        		//If the element does not exist, you will get NEGATIVE number. Negative sign displays
        		//non-existance, the number displays the order number IF the element exists
        		System.out.println(Arrays.binarySearch(d, 15));//-8
        		//binarySearch() method cannot be used for repeated elements, you can get output but 
        		//it is not meaningful.
        		System.out.println(Arrays.binarySearch(d, 3));
        		
        		
        	}
        }
        
        
        
	


