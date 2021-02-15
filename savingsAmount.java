package lab_4;

public class savingsAmount extends Account{
	final double minimumBal=500;
	savingsAmount(String name, float age, double initialbal) {
		super(name, age, initialbal);
	}
	@Override
	public void withdraw(double withdrawAmt) {
		if(withdrawAmt>this.minimumBal) {
			System.out.println("Account has amount less than minimumamount");
		}
		else {
			super.balance=balance-withdrawAmt;
		}
	}

}
