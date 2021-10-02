package banking;

public class BankAccount {
	String accType;
	double bal;
	Customer customer;
	
	public BankAccount(String accType, Customer customer) {
		this.accType = accType;
		this.customer = customer;
	}
	
	public void deposit(double amount) {
		this.bal += amount;
	}
	
	public void withdraw(double amount) throws Exception {
		if (amount > this.bal) {
			throw new Exception("u have less ammount");	
		}
		this.bal -= amount;
	}
	
	public String getAccInfo() {
		return this.accType + ": " + this.bal;
	}
	
	public String getCusInfo() {
		return this.customer.getName() + ": " + this.customer.getAddress();
	}
}