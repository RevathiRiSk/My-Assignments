package mywork;

import java.util.Arrays;
import java.util.HashSet;

public class CheckingMajority {

	

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,3};
		int [] numbers1 = {1,2,3,6,7};
		System.out.println(checkingMajority(numbers));
		System.out.println(checkingMajority(numbers1));	

	}

	public static boolean checkingMajority(int[] numbers) {
		HashSet<Integer>  seenNumbers = new HashSet<>();
		
		for(int number : numbers) {
			if (seenNumbers.contains(number)) {
				return true;
			}
				seenNumbers.add(number);
		}
		return false;
	}

}
