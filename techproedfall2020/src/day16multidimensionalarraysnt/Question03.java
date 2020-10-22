package day16multidimensionalarraysnt;

public class Question03 {

	public static void main(String[] args) {
		int arr[] = {3,1,7,13,9,11};
		//Using continue method. it is used to skip a value or some values in a code.
		//Print just last 2 elements
		for(int i=0;i<arr.length;i++) {
			
			if(i<arr.length-2) {
				continue;
			}
			System.out.print(arr[i] + " ");//9 11
		}
		System.out.println();
		
		//Print just first 3 elements
		//int arr[] = {3,1,7,13,9,11};
		for(int i=0;i<arr.length;i++) {
			if(i>2) {
				break;
			}
			
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//Print the elements from index 2 to index 4
		//int arr[] = {3,1,7,13,9,11};
		for(int i=0;i<arr.length;i++) {
			if(i<2) {
				continue;//to skip steps in loop use this
			}
				
			if(i>4) {
				break;//to break the loop use this
			}
			System.out.print(arr[i] + " ");
		}
		

	}

}
