package Week11.SpecificProperties;

public class PolindromeProperty implements SpecificProperty<String> {
    @Override
    public boolean test(String el) {
        return new StringBuilder(el).reverse().toString().equals(el);
     
    }
    
}