package week3day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
        String[] wordsArray = text.split("\\s+"); // Split the text into an array of words

        Set<String> uniqueWordsSet = new LinkedHashSet<String>();

        // Iterate through the words array and add each word to the set
        for (String word : wordsArray) {
            uniqueWordsSet.add(word);
        }

        // Print the unique words from the set
        for (String uniqueWord : uniqueWordsSet) {
            System.out.print(uniqueWord + " ");
        }
    }
}
