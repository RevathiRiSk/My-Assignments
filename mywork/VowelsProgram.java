package mywork;

import java.util.Scanner;

public class VowelsProgram {

	public static void main(String[] args) {
		/*Write a Java method that checks whether all the characters in a 
		 * given string are vowels (a, e,i,o,u) or not. 
		 * Return true if each character in the string is a vowel, otherwise return false.
		 */

	
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a string: ");
		        String input = scanner.nextLine();

		        if (containsVowel(input)) {
		            System.out.println("The string contains a vowel.");
		        } else {
		            System.out.println("The string does not contain any vowel.");
		        }
		    }

		    public static boolean containsVowel(String str) {
		        
		        str = str.toLowerCase();

		       
		        return str.matches(".*[aeiou].*");
		    }
		}
