public class PolindromeProperty implements SpecificProperty<String>{
    @Override
    public boolean hasProp(String el) {
        return new StringBuilder(el).reverse().toString().equals(el);
    }
}
