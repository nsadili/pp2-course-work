import java.util.HashSet;
import java.util.Set;

public class SpecificPropertiesDemo {
    public static void main(String[] args) {
        SpecificProperties<Integer> spInteger = (Integer n) -> n%2 != 0;
        SpecificProperties<Point> spPoint = (Point p) -> p.getX() > 0 && p.getY() > 0;
        SpecificProperties<String> spString = (String s) ->{
            Set<Character> set = new HashSet<>();
            s = s.toLowerCase();
            for(char c: s.toCharArray()){
                if(c>='a' && c<='z'){
                    set.add(c);
                }
            }
            return set.size() == 26;

        };

        System.out.println(spInteger.test(22));
        System.out.println(spPoint.test(new Point(1, 2)));
        System.out.println(spString.test("abcdefggcdeaf"));

    }
}
