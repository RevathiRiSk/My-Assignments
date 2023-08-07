package javaday;

import java.util.HashMap;
import java.util.Map;

public class ArraySix {

	public static void main(String[] args) {
		 int[] nums = {1, 2, 3, 1};
	        int k = 3;

	        System.out.println(containsNearbyDuplicate(nums, k)); 
	    }
	
	 public static boolean containsNearbyDuplicate(int[] nums, int k) {
		        Map<Integer, Integer> indexMap = new HashMap<>();
		        
		        for (int i = 0; i < nums.length; i++) {
		            if (indexMap.containsKey(nums[i]) && Math.abs(i - indexMap.get(nums[i])) <= k) {
		                return true;
		            }
		            indexMap.put(nums[i], i);
		        }
		        
		        return false;
		    }

		  
		       
		}
