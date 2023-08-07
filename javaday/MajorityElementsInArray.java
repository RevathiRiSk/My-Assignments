package javaday;


public class MajorityElementsInArray {

	public static void main(String[] args) {
		
		int[] nums = {3,5,6,3,2,6,6,5,5};
		System.out.println("Majority Elements: " + majorityElements(nums) );
		
	}

	public static int majorityElements(int[] nums) {
		
		int duplicate = 0;
		int count = 0;
		
		for(int num:nums) {
			
			if(count == 0) {
				duplicate = num;
				
			} 
			else if (num == duplicate) {
				count++;
			}
			else {
				count--;
			
			}
				
		}
		
		
		
		return duplicate ;
	}
}