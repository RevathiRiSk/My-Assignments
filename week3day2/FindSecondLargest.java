package week3day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest  {
	
	
	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		//Create a empty Set Using TreeSet
		Set<Integer> dataSet = new TreeSet<Integer>();
		System.out.println(dataSet);
		
		//Declare for loop iterator from 0 to data.length and add into Set 
		for(int i=0;i<data.length;i++) {
			dataSet.add(data[i]);
		}
		
		//converted Set into List
		List<Integer> dataList = new ArrayList<Integer>(dataSet);
		System.out.println(dataList);
		
		// Print the second last element from List
		if(dataList.size() >= 2) {
			
			System.out.println("Second Last Element from List: " + dataList.get(dataList.size() - 2 ));
		}
		else {
			System.out.println("No such element found");
		}
			
		
	}
	
}