package Week10;

public class PolindromeProperty 
 implements SpecificProperty<String>{

    @Override
    public boolean hasProp(String el) {
    return new StringBuilder(el).reverse().toString().equals();
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'hasProp'");
    }
    
    
}
