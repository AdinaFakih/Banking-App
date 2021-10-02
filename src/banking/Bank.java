package banking;

import java.util.Scanner;

/**
 * 
 * @author addyf
 *
 */
public class Bank {

	public static void main(String[] args) {
		// new instance of bank class
		Bank bank = new Bank();
		bank.run();

	}
	
	public void run() {
		System.out.println("What is ur name?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("Name: " + name);
		Customer customer = new Customer(name);
		System.out.println("What is ur address?");
		String address = scanner.next();
		customer.setAddress(address);
		
		BankAccount checkingAcc = new BankAccount("checking", customer);
		BankAccount savingAcc = new BankAccount("saving", customer);
		
		System.out.println();
		System.out.println(checkingAcc.getCusInfo());
		
		System.out.println();
		System.out.println(checkingAcc.getAccInfo());
		
		System.out.println();
		System.out.println(savingAcc.getAccInfo());
		
		System.out.println();
		System.out.println("deposit checking");
		double amount = scanner.nextDouble();
		checkingAcc.deposit(amount);
		
		System.out.println();
		System.out.println("deposit saving");
		amount = scanner.nextDouble();
		savingAcc.deposit(amount);
		
		System.out.println(checkingAcc.getAccInfo());
		System.out.println(savingAcc.getAccInfo());
		
		System.out.println();
		System.out.println("withdraw checking");
		amount = scanner.nextDouble();
		try {
			checkingAcc.withdraw(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		System.out.println("withdraw saving");
		amount = scanner.nextDouble();
		try {
			savingAcc.withdraw(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println(checkingAcc.getAccInfo());
		System.out.println(savingAcc.getAccInfo());
		
		scanner.close();
	}
}
