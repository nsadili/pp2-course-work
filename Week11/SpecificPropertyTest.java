package Week11;
import java.awt.Point;
public class SpecificPropertyTest {
    public static void main(String[] args) {
        SpecificProperty<Integer> Odd =n -> n %2 !=0;
System.out.println(Odd.method(7));
   
SpecificProperty<Point> firstQuadrant = point -> point.getX() > 0 && point.getY() > 0;
System.out.println(firstQuadrant.method(new Point(-9, 7)));


SpecificProperty<String> isPanagram = string -> {
for(char ch = 'a'; ch<='z'; c+ +){
    if(String.charAt(r)==-1)
    return false;
}
return true;
};


}
}
