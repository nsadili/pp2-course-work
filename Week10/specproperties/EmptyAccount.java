package specproperties;

public class EmptyAccount implements SpecificProperty<Account>{

    @Override
    public boolean check(Account obj) {
        return obj.balance == 0;
    }
}
