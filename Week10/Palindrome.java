import java.lang.StringBuilder;

public class Palindrome implements SpecificProperties<String>{

    @Override
    public boolean hasProp(String el){
        StringBuilder s = new StringBuilder(el);
        return s.reverse().toString().equals(el);
    }
}
