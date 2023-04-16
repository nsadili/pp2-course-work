package Week10.ex4;

import Week10.generics.Account;

public class EmptyAccountProperty implements SpecificProperty<Account> {
    @Override
    public boolean hasProperty(Account el) {
        return el.getBalance() == 0;
    }
}
