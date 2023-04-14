package Week10;

public class PolindromeProperty implements SpecificElementCount<String>{

    @Override
    public boolean hasProp(String el){
        return new StringBuilder(el).reverse().toString().equals(el);
    }
    
}
