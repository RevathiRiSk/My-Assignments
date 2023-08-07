package banking;

public class AxisBank extends BankInfo {

	@Override
	public void deposit() {
		System.out.println("Deposit the amount in Axis Bank");
	}
	
	public static void main(String[]args) {
		
		AxisBank account = new AxisBank();
		account.deposit();
		account.saving();
		account.fixed();
	}
}
