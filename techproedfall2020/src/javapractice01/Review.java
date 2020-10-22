package javapractice01;


public class Review {

	public static void main(String[] args) {
		
		add();
		add(3,5,7,9,123,43);
		concat("A","l","i");
			
	}
		
    public static void add(int... a) {
    	int sum =0;
    	for(int w : a) {
    		sum = sum + w;
    	}
    	System.out.println(sum);
    }
    
    
    public static void concat(String... s) {
    	String sum ="";
    	for(String w : s) {
    		sum = sum+w;
    	}
    	System.out.println(sum);
    	
    }
	
    
	}
	
	
	
	
	
	
	
	
