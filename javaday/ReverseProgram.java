package javaday;

public class ReverseProgram{

	public static void main(String[] args) {
	
	String original = "hello";
	String reversed = reverse(original);
	System.out.println("Input: "+original);
	System.out.println("Output: "+reversed);
	
	}
	
	public static String reverse(String str) {
		
		StringBuilder reversed = new StringBuilder(str);
		return reversed.reverse().toString();
	
	}
	
	

	

}
