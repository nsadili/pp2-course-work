package Week10.ex4;
import Week08.ex3.Account;
public class EmptyAccountProperty implements SpecificProperty<Account>{
    @Override
    public boolean test(Account el) {
        return el.getBalance() == 0;
    }
}
