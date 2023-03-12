public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(11, "Roya Alizada", 10);
        Account account = new Account(1, customer, 170.0);
       
        try{ 
            account.withdraw(180.0);
        }catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
        
        
       
        try{ 
            Invoice invoice = new Invoice("descript", 5, -50.0);
        System.out.println(invoice.getPrice());
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

    
