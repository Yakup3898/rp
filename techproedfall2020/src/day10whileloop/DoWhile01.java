package day10whileloop;

public class DoWhile01 {

	public static void main(String[] args) {
		
		
		int i =1;
		//While Loop. in the while loop condition is checked first then if the condition 
		// is true loop body runs. If the condition is false loop body does not run
		// When you use while-loop it is possible to make the loop body not to run
		while(i<1) {
			
			System.out.println("While Loop");
		}
		
		//do-while Loop . int the do-while loop, loop body runs first then condition is checked.
		//Because of that, in do-while loop, loop body runs at least once. Regardless the condition is
		// true or not.
		do {
			System.out.println("do-while loop");
			i++;
		}while(i<1);
		
		
		
		
		
		
		

	}

}
