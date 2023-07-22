package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		
		int n = 11,fn = 0, sn = 1;
		System.out.println("The Fibbinocci series till " + n + " terms:");
		
		for (int i = 1; i <= 11; ++i) {
		System.out.println(fn);
		
		int x = fn + sn;
		fn = sn;
		sn = x;
		
		}
	}

}
