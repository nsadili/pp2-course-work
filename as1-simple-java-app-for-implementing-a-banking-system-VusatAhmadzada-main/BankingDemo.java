import java.math.BigDecimal;
import java.util.List;
public class BankingDemo {
    public static void main(String[] args) {
        CheckingAccount acc1 = new CheckingAccount("237214", new BigDecimal("50000"), new BigDecimal("1000"));
        SavingAccount acc2= new SavingAccount("12321", new BigDecimal("2500"), new BigDecimal("0.2"));
        SavingAccount acc3= new SavingAccount("43264", new BigDecimal("5500"), new BigDecimal("0.2"));
        SavingAccount acc4= new SavingAccount("45722", new BigDecimal("26600"), new BigDecimal("0.2"));
        SavingAccount acc5= new SavingAccount("12347", new BigDecimal("22200"), new BigDecimal("0.2"));
        CheckingAccount acc6 = new CheckingAccount("752143", new BigDecimal("40000"), new BigDecimal("5000"));
        CheckingAccount acc7 = new CheckingAccount("574812", new BigDecimal("20000"), new BigDecimal("4000"));
        CheckingAccount acc8 = new CheckingAccount("758293", new BigDecimal("60000"), new BigDecimal("2000"));

        Customer user1= new Customer("Fred Thomas");
        Customer user2= new Customer("Leyla Mammadli");
        Bank localBank= new Bank((List<Customer>) null);

        user1.addAccount(acc2);
        user2.addAccount(acc8);
        localBank.addCustomer(user2);
        localBank.addCustomer(user1);
        System.out.println(localBank.getCustomers());
    }
}
