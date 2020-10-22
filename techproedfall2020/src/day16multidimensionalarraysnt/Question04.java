package day16multidimensionalarraysnt;

public class Question04 {

	public static void main(String[] args) {
		
		int ma[][] = { {5}, {9,6,2}, {11,12} };
		
		//Find the sum of all elements
		
		int sum =0;
		
		for(int i=0;i<ma.length;i++) {
			
			for(int k=0;k<ma[i].length;k++) {
				
				sum = sum + ma[i][k];
			}
			
		}
		System.out.println(sum);
		
		//Find the multiplication of all elements(Homework)
		
		int mul=1;

		for(int a =0;a<ma.length;a++) {
			
			for(int j=0;j<ma[a].length;j++ ) {
				
				mul = mul * ma[a][j];
				
			}
			
		}
		System.out.println(mul);
		
		
		
		
		
		
		
		
	}

}
