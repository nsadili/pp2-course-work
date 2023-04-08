package specificproperties;

import generics.Account;

public class EmptyAccount implements SpecificProperty<Account> {

    @Override
    public boolean check(Account obj) {
        return obj.getBalance() == 0;

    }
}
