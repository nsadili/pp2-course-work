package specproperties;
import generics.Account;

public class EmptyyAccountProperty implements Specificproperty {
    @Override
    public boolean check(Object obj) {
        return obj.getBalance()==0;
    }
}
