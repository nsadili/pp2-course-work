package Week10.SpecificProperty;

public class StringProperty implements PropertyTester<String> {
    
    @Override
    public boolean test(String el) {
        return new StringBuilder(el).reverse().toString().equals(el);
    }
}
