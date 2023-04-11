package specproperties;

public class PalindromeStringsProperty implements SpecificProperty<String> {
    
    @Override
    public boolean check(String obj) {

        return new StringBuilder(obj).reverse().toString().equals(obj);

        
    }
}