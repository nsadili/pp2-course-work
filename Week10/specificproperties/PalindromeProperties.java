package specificproperties;

public class PalindromeProperties implements SpecificProperty<String> {

    @Override
    public boolean check(String obj) {
        return new StringBuilder(obj).reverse().toString().equals(obj);

    }

}
