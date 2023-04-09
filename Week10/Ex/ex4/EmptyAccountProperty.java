package Ex.ex4;

import Ex.ex1.Account;

public class EmptyAccountProperty implements SpecificProperty<Account> {
    

    @Override

    public boolean check(Account obj){

        return obj.getBalance() == 0;

        
    }
}
