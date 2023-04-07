import java.lang.*;
import java.util.*;

public class Palindrome implements SpecificProperties<String>{

    @Override
    public boolean hasProp(String el){
        StringBuilder s = new StringBuilder(el);
        return el.reverse().toString().equals(el);
    }
}
