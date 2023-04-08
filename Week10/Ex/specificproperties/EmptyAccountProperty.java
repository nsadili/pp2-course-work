package specificproperties;
import generics.Account;

public class EmptyAccountProperty  implements SpecificProperty<Account>{

    @Override
    public boolean test(Account obj) {
        return obj.getBalance()==0;
        
       
    }


   
}
