package lab_4;

public class execution {
	public static void main(String[] args) {
		Account smith=new Account("smithy",28,10000);
		Account kathy=new Account("kathy",25,110000);
		smith.deposit(2000);
		kathy.withdraw(2000);
		
		System.out.println(smith.getaccdetails()+"\nBalance: "+smith.getBalance()+"\n");
		System.out.println(kathy.getaccdetails()+"\nBalance: "+kathy.getBalance()+"\n");
	}

}
