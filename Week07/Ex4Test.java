package Week07;

import Week07.Ex4.Account;
import Week07.Ex4.InvalidAmountException;

public class Ex4Test {
        public static void main(String[] args) {
            Account account = new Account("1234", "Vagif Huseynov", 500.0);
            try {
                account.withdraw(1500.0);
            } catch (InvalidAmountException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
            System.out.println(account);
        }
    }
    
