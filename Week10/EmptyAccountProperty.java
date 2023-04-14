package Week10;

public class EmptyAccountProperty implements SpecificElementCount<Account> {
    @Override
    public boolean hasProp(Account el){
        return true;
    }
    
}
