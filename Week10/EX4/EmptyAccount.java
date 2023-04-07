package EX4;
import EX1.Account;

public class EmptyAccount implements SpecificProperty<Account>{
    @Override
    public boolean test(Account el) {
        return el.getBalance() == 0;
    }
}
