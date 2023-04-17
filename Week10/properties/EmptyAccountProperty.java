package properties;
import generics.Account;
public class EmptyAccountProperty
        implements SpecificProperty<Account> {

                @Override
                public boolean hasProp(Account obj) {
                       return obj.getBalance()==0;
                }
    
}
