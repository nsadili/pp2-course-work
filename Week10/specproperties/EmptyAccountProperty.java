package specproperties;

import generics.Account;

public class EmptyAccountProperty implements SpecificElement<Account> {

    @Override
    public boolean check(Account obj) {
        return obj.getBalance() == 0;
    }

}
