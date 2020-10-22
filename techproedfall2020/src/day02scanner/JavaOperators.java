package day02scanner;

public class JavaOperators {

	public static void main(String[] args) {
		//create an int variable and increase it by using addition then multiplication and
		// decrease it by using subtraction and division
		int a = 12;
		a= a + 3;// a=15
		System.out.println(a);
		a = a * 2; //a=30
		System.out.println(a);
		
		a = a - 5;//a =25
		System.out.println(a);
		a = a/5;//5
		System.out.println(a);
		//When you use multiple operations in one line, you should be careful about order of operations

		/* 
		 Subsequently>
		 1) do the operations in parenthesis
		 2) do * and / operations
		 3) do + and - operations
		 */
		int b = 12;
		b = b + 3 * 2 - 5 / 5;
		System.out.println(b);//b=17
		
		//question
		System.out.println(38 / 2 - (4 + 3) * 2);//=5
		
		
	}

}
