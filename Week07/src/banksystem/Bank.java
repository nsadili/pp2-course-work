package banksystem;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Customer> customers;
    
    public Bank() {
        customers = new ArrayList<>();
        
        
        
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) throws IllegalArgumentException {
        if (!customers.remove(customer)) {
            throw new IllegalArgumentException("Customer does not exist");
        }
    }

    public void removeCustomer(String customerId) throws IllegalArgumentException {
        
    	for (Customer customer : customers) {
            if (customer.getId().equals(customerId)) {
                customers.remove(customer);
                return;
            }
        }
        throw new IllegalArgumentException("Customer does not exist");
    }

    public List<Customer> getCustomers() {
    	return customers;
    }

    public Customer getCustomer(String customerId) throws IllegalArgumentException {
    	
    	for (Customer customer : customers) {
            if (customer.getId().equals(customerId)) {
                return customer;
            }
        }
        throw new IllegalArgumentException("Customer does not exist");
    }

    public CheckingAccount createCheckingAccount(Customer customer, BigDecimal balance, BigDecimal overDraftLimit) {
        CheckingAccount account = new CheckingAccount(customer, balance, overDraftLimit);
        customer.addAccount(account);
        return account;
    }

    public SavingAccount createSavingAccount(Customer customer, BigDecimal balance, BigDecimal interestRate) {
        SavingAccount account = new SavingAccount(customer, balance, interestRate);
        customer.addAccount(account);
        return account;
    }

}
