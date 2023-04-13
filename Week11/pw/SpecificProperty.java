import java.util.Arrays;
import java.util.List;

public interface SpecificProperty<T> {
    boolean test(T a);
    public static void main(String[] args) {
        SpecificProperty<Integer> isOdd = a -> a%2!=0;
        SpecificProperty<Point> isQuadrant = p -> p.getX()>0 && p.getY()>0;
        SpecificProperty<String> isPanagram = b ->{
            boolean[] mark = new boolean[26];
            int index = 0;
            for (int i = 0; i < b.length(); i++) {
                if ('A' <= b.charAt(i) && b.charAt(i) <= 'Z') {
                    index = b.charAt(i) - 'A';
                } else if ('a' <= b.charAt(i) && b.charAt(i) <= 'z') {
                    index = b.charAt(i) - 'a';
                } else continue;
                mark[index] = true;
            }
            for (int i = 0; i <= 25; i++) {
                if (!mark[i]) return false;
            }
            return true;
        };
        SpecificProperty<Person> isOlderThanTwenty = c -> c.getAge()>20 ? true : false;

        System.out.println(isOdd.test(5));
        System.out.println(isQuadrant.test(new Point(3, -4)));
        System.out.println(isPanagram.test("qwertyuiopasdfghjklzxcvbnm"));
        System.out.println(isOlderThanTwenty.test(new Person("Nariman", "Mammadov", 31)));



        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> filteredNums = Util.filter(nums, isOdd);
        System.out.println("ODD NUMBERS: "+filteredNums);

        List<Point> points = Arrays.asList(new Point(2,2), new Point(2,-2), new Point(0,7),new Point(7,2));
        List<Point> filteredPoints = Util.filter(points, isQuadrant);
        System.out.println("QUADRANT: "+ filteredPoints);

        List<String> strs = Arrays.asList("Hello I am Nariman!", "qwertyuiopasdfghjklzxcvbnm", "Hello<>?", "The quick brown fox jumps over the lazy dog");
        List<String> filteredStrs = Util.filter(strs, isPanagram);
        System.out.println("PANAGRAM: "+ filteredStrs);

        List<Person> people = Arrays.asList(new Person("Nariman", "Mammadov", 19), new Person("Shamil", "Abbasov", 31), new Person("Rufat", "Mammadov", 22));
        List<Person> filteredPeople = Util.filter(people, isOlderThanTwenty);
        System.out.println("isOlderThanTwenty: "+filteredPeople);
    }
}