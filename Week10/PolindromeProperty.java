package Week10;
public class PolindromeProperty implements SpecificProperty<String> {

    @Override
    public boolean hasProp(String el) {
        String reversed = new StringBuilder(el).reverse().toString();
        return el.equals(reversed);
    }
}
