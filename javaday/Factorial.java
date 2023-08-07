package javaday;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		int num = scanner.nextInt();
		scanner.close();
		
		int factorial = getFactorial(num);
		System.out.println("Factorial of "+ num + "is:" + factorial);
	}
	public static int getFactorial(int num) {
		if (num<0) {
			System.out.println("Execption System Error");
		}
		if(num==0 || num == 1) {
			return 1;
		}else {
			return num * getFactorial(num-1);
		}
			
			
		
		
		
	}
}
