package Week11.SpecificProperties;


public class EmptyAccountProperty implements SpecificProperty<Account>{

    @Override
    public boolean test(Account obj) {
        
        return obj.getBalance()==0;
    }
   

   
    
}