package specificproperties;

public class PolindromeProperty 
            implements SpecificProperty<String> {

    @Override
    public boolean test(String el) {
        return new StringBuilder(el).toString().equals(el); 
    }
}