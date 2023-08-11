package week3day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		
		
		int [] inputNumbers = {1,2,6,4,9,3,8,7,10};
		//create a Set 
		Set<Integer> numberSet = new LinkedHashSet<Integer>();
		
		
		// Add all input numbers to the Set
		for (int number : inputNumbers){
		numberSet.add(number);
		}
		System.out.println(numberSet);
		
		int minNumber = Integer.MAX_VALUE;
		int maxNumber = Integer.MIN_VALUE;
		
		for(int number : numberSet) {
			if(number < minNumber) {
				minNumber = number;
			}
			if(number > maxNumber) {
				maxNumber = number;
			}
		}
		
		for (int i = minNumber; i <=maxNumber; i++) {
			if(!numberSet.contains(i)) {
				System.out.println("Missing Number is: " + i);
				break;
			}
		}
	}
}
