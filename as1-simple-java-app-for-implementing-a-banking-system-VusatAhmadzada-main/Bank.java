import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> customers;
    

    public Bank(List<Customer> customers) {
        this.customers = customers;
    }
    

    public List<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    public void removeCustomer(String customerId) {
        for (var cus : customers) {
            if (customerId.equals(cus.id)) {
                customers.remove(cus);
            }
        }
    }

    public List<Customer> getCustomers(String type) {
        List<Customer> result = new ArrayList<>();
        for (var cus : customers) {
            result.add(cus);
        }
        return result;
    }

    public Customer getCustomer(String customerId) {
        Customer temp = null;
        for (var cus : customers) {
            if (customerId.equals(cus.id)) {
                temp = cus;
            }
        }
        return temp;
    }

    public void createCheckingAccount(Customer customer, String id, BigDecimal balance, BigDecimal overDraftLimit) {
        CheckingAccount checkingAccount = new CheckingAccount(id ,balance, overDraftLimit);
        customer.addAccount(checkingAccount);
    }

    public void createSavingAccount(Customer customer, String id, BigDecimal balance, BigDecimal interestRate) {
        SavingAccount savingAccount = new SavingAccount(id ,balance, interestRate);
        customer.addAccount(savingAccount);
    }
}
