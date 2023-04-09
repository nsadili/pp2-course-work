package generics.specproperties;

import generics.Account;

public class EmptyAccountProperty implements SpecificProperty<Account> {

    @Override
    public boolean check(Account obj) {


        return obj.getBalance() == 0;
    }
    
}
