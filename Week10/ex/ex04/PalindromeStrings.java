package ex04;

public class PalindromeStrings implements SpecificProperty<String> {
    
    public boolean check(String obj) {

        return new StringBuilder(obj).reverse().toString().equals(obj);

        
    }
}
