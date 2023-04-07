package specificproperties;

public class PalindromeProperty implements SpecificProperty<String>{
    @Override
    public boolean test(String a) {
        return new StringBuilder(a).reverse().toString().equals(a);
    }
}