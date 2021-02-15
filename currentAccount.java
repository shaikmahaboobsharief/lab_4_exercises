package lab_4;

public class currentAccount extends Account {
	private double overDraftinglimit=1000;
	currentAccount(String name, float age, double initialbal) {
		super(name, age, initialbal);
	}
	@Override
	public void withdraw(double withdrawAmt) {
		if(withdrawAmt>this.overDraftinglimit || withdrawAmt<balance) {
			System.out.println("Your account is low on balance");
		}
		else {
			super.balance=balance-withdrawAmt;
		}
	}
	

}
