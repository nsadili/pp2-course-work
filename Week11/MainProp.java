package Week11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import Week05.HW.Person;

public class MainProp {
    public static void main(String[] args) {
       
    

        SpecificProperty <Integer> b1 = (n) ->  (n % 2) == 0;
    
        System.out.println(b1.hasProp(10));

        SpecificProperty <Point> b2 = (n) -> (n.getX() > 0 && n.getY() > 0);

        Point p = new Point(10,10);

        System.out.println(b2.hasProp(p));


        SpecificProperty<String> b3 = (s) -> {
            Set<Character> set = new HashSet();
            s = s.replaceAll("\\s", "").toLowerCase();
            Set<Character> charSet = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isLetter(c)) {
                    charSet.add(c);
                }
            }
            return charSet.size() == 26;
        }; 

        String str = "The quick brown fox jumps over the lazy dog";

        System.out.println(b3.hasProp(str));

        Week11.Person p2 = new Person("UrMom", "Bad", 10)

        SpecificProperty <Person> b4 = (n) -> (p2.getAge()>20);

        System.out.println(b4.hasProp(p2));

      
    







}
}
