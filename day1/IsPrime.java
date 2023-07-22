package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		
		int n=15;
		boolean flag = false;
		
		for (int i = 2; i<=n-1/2;i++) {
		if (n%i==0) {
			System.out.println("This is not a Prime No");
			flag = true;
			break;
		}
		
		
		}
		if(!flag) {
			System.out.println("This is a Prime No");
}
		

	}

}
