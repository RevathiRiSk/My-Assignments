package week3day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueChar {

	public static void main(String[] args) {
		
		
		//Convert String to Character array
		String name = "RevathiMohan";
		char[] charArray = name.toCharArray();
		
		//Create a new Set -> HashSet
		Set <Character> uniqueLetter = new HashSet<Character>();
		
		//Add each character to the Set and if it is already there, remove it
		
		for(char c : charArray ) {
			if (uniqueLetter.contains(c)) {
				uniqueLetter.remove(c);
			}
			else {
				uniqueLetter.add(c);
			}
		}
		for(char c : uniqueLetter) {
			System.out.print(c + " ");
		}

	}

}
