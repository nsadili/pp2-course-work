package Week10.SpecificProperty;

import Week10.generics.Account;


public class AccountProperty implements PropertyTester<Account>  {
    
    @Override
    public boolean test(Account el) {
        return el.getBalance()==0;
    }
}
