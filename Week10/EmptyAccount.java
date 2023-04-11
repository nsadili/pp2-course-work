package Week10;

import Week07.Account;

public class EmptyAccount 
implements SpecificProperty<Account>  {

    @Override
    public boolean hasProp(Account el) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'hasProp'");
       return el.getBalance();
    }
    
}
