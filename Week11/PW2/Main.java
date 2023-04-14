package PW2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SpecificProperty<Integer> isOdd = n -> n % 2 != 0;
        System.out.println(isOdd.test(12));

        SpecificProperty<Point> isInFirstQuadrant = p -> p.getX() > 0 && p.getY() > 0;
        System.out.println(isInFirstQuadrant.test(new Point(5, 6)));

        SpecificProperty<String> isPanagram = (str) -> {
            str = str.toLowerCase();
            boolean[] charSet = new boolean[26];
            
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch >= 'a' && ch <= 'z') {
                    int index = ch - 'a';
                    charSet[index] = true;
                }
            }

            for (boolean val : charSet) if (!val) return false;
            return true;
        };
        System.out.println(isPanagram.test("abcdefghijklmnopqrstuvwxyz"));
        
        SpecificProperty<Person> isOlderThan20 = person -> person.getAge() > 20;
        System.out.println(isOlderThan20.test(new Person("Leyla", 17)));

    }

    public static <T> Collection<T> filter(Collection<T> c, SpecificProperty<T> p){
        List<T> result = new ArrayList<>();
        // for (T element: c){
        //     if ()
        // }
        return result;
    }
}
