package org.system;

public class Desktop extends Computer {

	
	public void desktopSize() {
		System.out.println("13 ich pro display");
	}
	
	public static void main(String[] args) {
		
		Desktop model = new Desktop();
		model.computerModel();
		model.desktopSize();
	}
}
