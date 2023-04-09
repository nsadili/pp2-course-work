package specproperties;

public class PalindromeProperty implements SpecificProperty<String>{

    @Override
    public boolean check(String obj) {
        return new StringBuilder(obj).reverse().toString().equals(obj);
    }
}
