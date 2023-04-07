package EX4;

public class PalindromProperty implements SpecificProperty<String>{
    @Override
    public boolean test(String el) {
        return new StringBuilder(el).reverse().toString().equals(el);
    }
}
