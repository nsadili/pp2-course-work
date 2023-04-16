package Week10.ex4;

public class PalindromeStringProperty implements SpecificProperty<String> {
    @Override
    public boolean hasProperty(String el) {
        return new StringBuilder(el).reverse().toString().equals(el);
    }
}
