package day03ifstatementsnt;

public class IfStatement02 {

	public static void main(String[] args) {
		/*
		 Logical Operators: 
		 1) && ==> And Operator: 
		 true && true = false
		 false && true = false
		 false && false = false
		 true && true = true
		 
		 2)|| ==> Or operator
		 true || true = true
		 true || false = true
		 false || true = true
		 false || false = false
		 
		 3) ! ==> Not Operator 
		 !true = false
		 !false = true
		 !!true = true
		 
		 Detail Information: Normally and Operator is &, but if you type && your code will run faster.
		 For "false && true = false" and "false && false = false" no need to check the second condition.
		 If you use &&, Java will not check the second condition, but if you use &,
		 Java checks both sides for all. In that way, your code will run slower.
		 That's why it's better to use &&(double operator).
		 
		 */
		if(9>7 && 8<9) {
			System.out.println("Good");
		}
		if(5>5 || 4>1) {
			System.out.println("Bad");
		}
		
		
		

	}

}
