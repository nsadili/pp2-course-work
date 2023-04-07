package Week10.generics;

public class PalindromeProperty implements Property<String> {
    
    public boolean test(String obj){
        String obj2=obj.toLowerCase();
        return new StringBuilder(obj2).reverse().toString().equals(obj2);

    }
}
