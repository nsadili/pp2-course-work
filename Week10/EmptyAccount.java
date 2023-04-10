public class EmptyAccount implements SpecificProperty<Account>{
    @Override
    public boolean hasProp(Account el) {
        return el.getBalance()==0;
    }
}
