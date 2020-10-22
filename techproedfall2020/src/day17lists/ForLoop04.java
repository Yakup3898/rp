package day17lists;

import java.util.ArrayList;
import java.util.List;

public class ForLoop04 {

	public static void main(String[] args) {
		/*
		 Create 2 integer lists and print the common elements on the console
		 If there is no any common element print "No common elements" on the console
		 Example: list1 = [1,3,2,4] list2 = [2,4,6,8,10] ==> 2 4 
		 */
		
  List<Integer> list1 = new ArrayList<>();
		
		list1.add(11);
		list1.add(12);
		list1.add(13);
		list1.add(14);
		list1.add(15);
		System.out.println(list1);
		
  List<Integer> list2 = new ArrayList<>();
		
		list2.add(7);
		list2.add(14);
		list2.add(11);
		list2.add(14);
		list2.add(15);
		list2.add(17);
        System.out.println(list2);
        
  List<Integer> common = new ArrayList<>();//t listinin icinde birden fazla bulunan "14" elementi  w listiyle karsilastirilip
        // yazdirildiginda birden fazla cikmasin diye yeni list kurup asagidaki metodu olusturmak lazim.
        
        
        for(Integer w : list1) {
        	
        	for(Integer t : list2) {
        		
        		if(w == t) {
        			
        			if(!common.contains(w)) { //Bu method ortak elementten sadece 1 defa alinmasina yariyor
        				common.add(w);
        				 
        			//yada soylede yapilir ayni isi gorur
    				//if(common.contains(w)) { ayni sey 
    				//	continue;
        			}
        		    
        		}
        	}
        }
		System.out.println(common);//[11, 14, 15]  14 is only mentioned once which we wanted to
		
	}
}

