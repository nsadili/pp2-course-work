package specificproperties;
import generics.Account;

public class EmptyAccountProperty implements SpecificProperty<Account>{
    @Override
    public boolean test(Account a) {
        return a.getBalance()==0;
    }
}
