package specproperties;
import generics.Account;

public class EmptyAccount implements Specific<Account>{
    
    @Override
    public boolean check(Account obj){
        return obj.getBalance() == 0;
    }

}
