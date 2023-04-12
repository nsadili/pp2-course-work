package specproperties;

public class Palindrome implements Specific<String> {
    
    @Override 
    public boolean check(String obj){
        return new StringBuilder(obj).reverse().toString().equals(obj);
     }

}
