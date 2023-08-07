package javaday;

import java.util.HashSet;

public class ArrayFive {

	public static void main(String[] args) {
		
		int[] nums1 = {1, 2, 3, 4, 5};
		int[] nums2 = {1, 2, 3, 2, 4, 5};

		        System.out.println(containsDuplicate(nums1));
		        System.out.println(containsDuplicate(nums2)); 

	}	

		    public static boolean containsDuplicate(int[] nums) {
		        HashSet<Integer> set = new HashSet<>();
		        
		        for (int num : nums) {
		            if (set.contains(num)) {
		                return true;
		            }
		            set.add(num);
		        }
		        
		        return false;
		    }

		   
		   
		}


	




