package specproperties;


public  class EmptyAccountProperty implements SpecificProperty<Account>{
    public boolean check(Account obj){
        return obj.getBalance() == 0;
    }
    
}