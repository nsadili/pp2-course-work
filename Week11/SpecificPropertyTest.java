package Week11;
import java.awt.Point;
public class SpecificPropertyTest {
public static void main(String[] args) {

SpecificProperty<Integer> Odd =n -> n %2 !=0;
System.out.println(Odd.method(7));
   
SpecificProperty<Point> firstQuadrant = point -> point.getX() > 0 && point.getY() > 0;
System.out.println(firstQuadrant.method(new Point(-9, 7)));


SpecificProperty<String> isPanagram = string -> {
    string=string.toLowerCase();
for(char ch = 'a'; ch<='z'; ch++){
    if(string.indexOf(ch)==-1)
    return false;
}
return true;
};
System.out.println(isPanagram.method("ajyr"));

 
SpecificProperty<Person> olderThan20 = person -> person.getAge()>20;
Person Ilaha = new Person ("Ilaha","Jamalli", 19 );
System.out.println(olderThan20.method(Ilaha));
}
}
