import java.awt.Point;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;

public class SpecificPropertyDemo{
   
    public interface SpecificProperty<T> {
        boolean check(T obj);
    }
    
public static void main(String[] args) {
    
//checks the odd integer
SpecificProperty<Integer> oddProp = num -> num % 2 != 0;
System.out.println(oddProp.check(5));

//checks if the point is first quadrant
SpecificProperty<Point> firstQ = p -> p.x > 0 && p.y > 0;
System.out.println(firstQ.check(new Point(3, 5)));

//checks if the string is panagram
SpecificProperty<String> isPanagram = str -> {
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    for( char c : alphabet.toCharArray())
    if(str.toLowerCase().indexOf(c) == -1){
    return false;
}
return true;
};
System.out.println(isPanagram.check("My name is Roya"));

//checks if the person is older than 20
SpecificProperty<Person> older20 = person -> person.getAge() > 20;
Person person = new Person("Roya", "Alizada", 19);
boolean isOlder = older20.check(person);
System.out.println(isOlder);

//filter
Collection<Integer> num = Arrays.asList(1,2,3,4,5);
Collection<Integer> oddNum = filter(num, oddProp);
System.out.println(oddNum);

Collection<String> word = Arrays.asList("hello", "world");
Collection<String> panagram = filter(word, isPanagram);
System.out.println(panagram);

}

private static <T> Collection<T> filter(Collection<T> c,
SpecificProperty<T> p) {
            Collection<T> filtered = new ArrayList<>();
            for (T obj : c) {
                if (p.check(obj)) {
                    filtered.add(obj);
                }
            }
            return filtered;
        }
}
