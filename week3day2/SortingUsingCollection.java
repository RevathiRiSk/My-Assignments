package week3day2;

import java.util.Arrays;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		 String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};

	        // Get the length of the array
	        int arrayLength = companies.length;
	        System.out.println("Array length: " + arrayLength);

	        // Sort the array
	        Arrays.sort(companies);

	        // Iterate in reverse order and print the array
	        for (int i = arrayLength - 1; i >= 0; i--) {
	            System.out.print(companies[i] + " ");
	        }
	    }
	}
	



