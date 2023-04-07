public class EmptyAccounts implements SpecificProperties<Account>{
    public boolean hasProp(Account a){
        if(a.getBalance() == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
