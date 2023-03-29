package banksystem;

import java.math.BigDecimal;
import java.util.List;

public class BankingDemo {

	public static void main(String[] args) {
		Bank bank = new Bank();

		// create customers
		Customer john = bank.getCustomer("1");
		Customer jane = bank.getCustomer("2");

		// create accounts
		CheckingAccount johnChecking = bank.createCheckingAccount(john, BigDecimal.valueOf(1000),
				BigDecimal.valueOf(500));
		SavingAccount johnSaving = bank.createSavingAccount(john, BigDecimal.valueOf(5000), BigDecimal.valueOf(0.05));
		
		CheckingAccount janeChecking = bank.createCheckingAccount(jane, BigDecimal.valueOf(2000),
				BigDecimal.valueOf(1000));
		SavingAccount janeSaving = bank.createSavingAccount(jane, BigDecimal.valueOf(10000), BigDecimal.valueOf(0.1));

		// add and remove accounts
		john.addAccount(johnChecking);
		john.addAccount(johnSaving);
		jane.addAccount(janeChecking);
		jane.addAccount(janeSaving);
//		john.removeAccount(johnChecking);

		// deposit and withdraw
		johnSaving.deposit(BigDecimal.valueOf(1000));
		janeChecking.withdraw(BigDecimal.valueOf(1500));

		// print customer information
		List<Customer> customers = bank.getCustomers();
		
		for (Customer c : customers) {
			
			System.out.println("Customer: " + c.getFullName());
			List<Account> accounts = c.getAccounts();
			
			for (Account a : accounts) {
			
				System.out.println("\tAccount ID: " + a.getId());
				System.out.println("\tAccount Balance: " + a.getBalance());
				
			}
			
			BigDecimal totalBalance = c.getTotalBalance();
			
			System.out.println("\tTotal Balance: " + totalBalance);
			System.out.println();
			
		}
	}
}
