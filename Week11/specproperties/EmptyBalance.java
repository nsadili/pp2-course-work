package specproperties;


public class EmptyBalance implements SpecificProperty<Account> {

    @Override
    public boolean check(Account obj) {
        return obj.getBalance() == 0;

    }
    
    
}
