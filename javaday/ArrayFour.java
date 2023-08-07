package javaday;

public class ArrayFour {

	public static void main(String[] args) {
		 int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};

	        System.out.println(findMajorityElement(nums)); // Output: 4
	    }
	
	
		 public static int findMajorityElement(int[] nums) {
		        int majority = nums[0]; // Initialize the majority element
		        int count = 1; // Initialize the count
		        
		        // Find the majority element
		        for (int i = 1; i < nums.length; i++) {
		            if (count == 0) {
		                majority = nums[i];
		                count = 1;
		            } else if (majority == nums[i]) {
		                count++;
		            } else {
		                count--;
		            }
		        }
		        
		        return majority;
		    }

		   

}
