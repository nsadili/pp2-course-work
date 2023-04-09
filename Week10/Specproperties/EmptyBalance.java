package Specproperties;

import generics.Account;
public class EmptyBalance implements SpecificProperty<Account> {

    @Override
    public boolean check(Account obj) {
        return ((Account) obj).getBalance() == 0;

    }
    
    
}

