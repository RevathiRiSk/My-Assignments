package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		
		int length = data.length;
			
		Arrays.sort(data);
		
		int largestNo = data[length - 2];
		
		
			
			System.out.println("Second From Last Is :" + largestNo);
			


	}

}
