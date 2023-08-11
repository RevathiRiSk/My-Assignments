package week3day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
	
		
        String inputString = "PayPal India";

        // Convert the string to a character array
        char[] charArray = inputString.toCharArray();

        // Declare a Set for unique characters and a Set for duplicate characters
        Set<Character> charSet = new HashSet<>();
        Set<Character> dupCharSet = new HashSet<>();

        // Iterate through the character array
        for (char c : charArray) {
            if (!charSet.add(c)) {
                dupCharSet.add(c);
            }
        }

       
        charSet.removeAll(dupCharSet);

       
        
        for (char c : charArray) {
            if (charSet.contains(c) && c != ' ') {
                System.out.print(c);
            }
        }
    }
}