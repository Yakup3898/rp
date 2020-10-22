package day15arraysnt;

import java.util.Arrays;

public class Arrays03 {
	
	//Multi Dimensional Arrays

	public static void main(String[] args) {
		//1.way to create multi dimensional array
		int arr[][] = new int[3][2];
		System.out.println(Arrays.deepToString(arr));//[[0, 0], [0, 0], [0, 0]]
		//How to index multi dimensional elements
		arr[0][0] =1;
		System.out.println(Arrays.deepToString(arr));//[[1, 0], [0, 0], [0, 0]]
		arr[1][1] =11;
		System.out.println(Arrays.deepToString(arr));//[[1, 0], [0, 11], [0, 0]]
		arr[0][1] =2;
		arr[1][0] =10;
		arr[2][0] =0;
		arr[2][1] = 6;
		System.out.println(Arrays.deepToString(arr));//[[1, 2], [10, 11], [0, 6]]
		//2.way to create multi dimensional array. This one is easier and more convenient
		String names[][] = {{"Ali"}, {"Veli","Can","Mary"}, {}, {"Brad","Tom"} };
		System.out.println(Arrays.deepToString(names));//[[Ali], [Veli, Can, Mary], [], [Brad, Tom]]
		
		
		
		
		
		
		
		
		

	}

}
