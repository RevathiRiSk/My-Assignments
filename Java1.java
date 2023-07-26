package javaday;

import java.util.HashSet;

public class Java1 {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,2,3,5};
		int result = findSingleElement(a);
		 System.out.println("Single Elements : " + result);
		 
	}
		public static int findSingleElement(int[]a) {
			
			HashSet<Integer> set = new HashSet<>();
			
		for(int num : a) {
			if(set.contains(num)) {
			set.remove(num);
		} 	else {
			set.add(num);
		
			
		}
		
}	return set.iterator().next();
	
}
}