package lab_4;

class Person{
	private String name;
	private float age;
	Person(String name,float age){
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return this.age;
	}
	public void setAge(float age) {
		this.age = age;
	}
}
class Account{
	long accNum;
	double balance;
	Person accHolder;
	static long autoacc=41020000;
	
	Account(String name,float age,double initialbal){
		this.accNum=++autoacc;
		this.balance=initialbal;
		this.accHolder=new Person(name,age);
		
	}
	public void deposit(double depamount) {
		this.balance=balance+depamount;
	}
	public void withdraw(double withdrawamo) {
		this.balance=balance-withdrawamo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getaccdetails() {
		return "Account number: "+this.accNum+"\n Account Holders Name: "+accHolder.getName()+"\n Account Holders Age: "+accHolder.getAge();
	}
}

