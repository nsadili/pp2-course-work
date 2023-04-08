package specificproperties;

import generics.Account;

public class EmptyAccountProperty
        implements SpecificProperty<Account> {

    @Override
    public boolean test(Account el) {
        return el.getBalance() == 0;
    }

}