package specificProperty;
import java.util.Arrays;
import java.util.List;

public interface SpecificProperty<T> {
    boolean check(T obj);

    SpecificProperty<Integer> spInt = (obj) -> (obj % 2) != 0;
    SpecificProperty<Point> spPoint = (p) -> (p.getX() > 0 && p.getY() > 0);
    SpecificProperty<String> spPan = (str) -> {

        boolean[] mark = new boolean[26];

        // For indexing in mark[]
        int index = 0;

        // Traverse all characters
        for (int i = 0; i < str.length(); i++) {
            // If uppercase character, subtract 'A'
            // to find index.
            if ('A' <= str.charAt(i)
                    && str.charAt(i) <= 'Z')
                index = str.charAt(i) - 'A';

            // If lowercase character, subtract 'a'
            // to find index.
            else if ('a' <= str.charAt(i)
                    && str.charAt(i) <= 'z')

                index = str.charAt(i) - 'a';

            // If this character is other than english
            // lowercase and uppercase characters.
            else
                continue;
            mark[index] = true;
        }

        // Return false if any character is unmarked
        for (int i = 0; i <= 25; i++)
            if (mark[i] == false)
                return (false);

        // If all characters were present
        return (true);

    };

    SpecificProperty<Person> spPer = (p) -> (p.getAge() > 20);

    public static void main(String[] args) {
        System.out.println(spInt.check(5));
        System.out.println(spInt.check(8));

        System.out.println(spPoint.check(new Point(3, 5)));
        System.out.println(spPoint.check(new Point(-3, 5)));

        System.out.println(spPan.check("The quick brown fox jumps over the lazy dog"));
        System.out.println(spPan.check("The quick brown fox jumps over the lazy cat"));

        System.out.println(spPer.check(new Person("Laman", 
        "Panakhova", 18)));
        System.out.println(spPer.check(new Person("Narmin", 
        "Karimli", 23)));

        List<Integer> numbers = Arrays.asList(4, 2, 5, 6, 8, 3, 7, 9);
        System.out.println(Utility.count(numbers, spInt));
        System.out.println(Utility.filter(numbers, spInt));

        List<Point> points = Arrays.asList(new Point(2, 3),
                new Point(-2, 5), new Point(5, 8),
                new Point(-8, 9), new Point(9, 7));
        System.out.println(Utility.count(points, spPoint));
        System.out.println(Utility.filter(points, spPoint));

        List<String> strings = Arrays.asList("The quick brown fox jumps over the lazy dog",
                "The quick brown fox jumps over the lazy dog",
                "The quick brown fox jumps over the lazy cat", "The quick brown fox jumps over the lazy dog");
        System.out.println(Utility.count(strings, spPan));
        System.out.println(Utility.filter(strings, spPan));

        List<Person> people = Arrays.asList(new Person("Laman",
                "Panakhova", 18),
                new Person("Nazrin",
                        "Panakhova", 25),
                new Person("Rasul", "Panakhov", 30));
        System.out.println(Utility.count(people, spPer));
        System.out.println(Utility.filter(people, spPer));

    }
}
