package javaday;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArraySeven {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 2, 1, 1, 3};
        int[] arr2 = {1, 2};

        System.out.println(areOccurrencesUnique(arr1)); 
        System.out.println(areOccurrencesUnique(arr2)); 
    }
		public static boolean areOccurrencesUnique(int[] arr) {
	        Map<Integer, Integer> countMap = new HashMap<>();
	        
	        // Count the occurrences of each value
	        for (int num : arr) {
	            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
	        }
	        
	        Set<Integer> uniqueCounts = new HashSet<>();
	        
	        // Check for unique counts
	        for (int count : countMap.values()) {
	            if (uniqueCounts.contains(count)) {
	                return false;
	            }
	            uniqueCounts.add(count);
	        }
	        
	        return true;
	    }

	
	        
	}


