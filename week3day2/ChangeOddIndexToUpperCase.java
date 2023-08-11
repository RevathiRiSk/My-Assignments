package week3day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		

		String test = "changeme";
		
		 //Convert the String to character array
		
		char[] charArray = test.toCharArray();
		

		
		for(int i =0; i <charArray.length;i++) {
			if(i % 2 != 0) {
				charArray[i] = Character.toUpperCase(charArray[i]);
			}
		}
		
		String modifiedValue = new String(charArray);
		System.out.println(modifiedValue);
		
		
		
		
		
		
		
		
		
	}

}
