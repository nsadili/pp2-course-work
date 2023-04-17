import java.util.ArrayList;
import java.util.Collection;

public class Exercise_2 {

    public static void main(String[] args) {
        // Test case 1: count odd integers
        Collection<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        int oddCount = countElementsWithProperty(integers, new OddProperty());
        System.out.println("Number of odd integers in collection: " + oddCount);

        // Test case 2: count points in the first quadrant
        Collection<Point> points = new ArrayList<>();
        points.add(new Point(1, 1));
        points.add(new Point(-1, 1));
        points.add(new Point(1, -1));
        points.add(new Point(-1, -1));
        int firstQuadrantCount = countElementsWithProperty(points, new FirstQuadrantProperty());
        System.out.println("Number of points in the first quadrant: " + firstQuadrantCount);

        // Test case 3: count panagrams
        Collection<String> strings = new ArrayList<>();
        strings.add("The quick brown fox jumps over the lazy dog");
        strings.add("Pack my box with five dozen liquor jugs");
        strings.add("Sphinx of black quartz, judge my vow");
        strings.add("How vexingly quick daft zebras jump");
        int panagramCount = countElementsWithProperty(strings, new PanagramProperty());
        System.out.println("Number of panagrams in collection: " + panagramCount);

        // Test case 4: count persons older than 20
        Collection<Person> people = new ArrayList<>();
        people.add(new Person("Alice", "Smith", 18));
        people.add(new Person("Bob", "Jones", 22));
        people.add(new Person("Charlie", "Brown", 30));
        people.add(new Person("Dana", "Green", 19));
        int olderThan20Count = countElementsWithProperty(people, new AgeProperty());
        System.out.println("Number of people older than 20: " + olderThan20Count);

        // Test the filter method
        Collection<Integer> filteredIntegers = filter(integers, new OddProperty());
        System.out.println("Odd integers in collection: " + filteredIntegers);

        Collection<Point> filteredPoints = filter(points, new FirstQuadrantProperty());
        System.out.println("Points in the first quadrant: " + filteredPoints);

        Collection<String> filteredStrings = filter(strings, new PanagramProperty());
        System.out.println("Panagrams in collection: " + filteredStrings);

        Collection<Person> filteredPeople = filter(people, new AgeProperty());
        System.out.println("People older than 20: " + filteredPeople);
    }

    public static <T> int countElementsWithProperty(Collection<T> collection, SpecificProperty<T> property) {
        int count = 0;
        for (T element : collection) {
            if (property.test(element)) {
                count++;
            }
        }
        return count;
    }

    /*
    defining another method filter(Collection c,SpecificProperty p) which will return a 
    collection of those elements in c that has the property p.
*/
    public static <T> Collection<T> filter(Collection<T> collection, SpecificProperty<T> property) {
        Collection<T> result = new ArrayList<>();
        for (T element : collection) {
            if (property.test(element)) {
                result.add(element);
            }
        }
        return result;
    }

    public interface SpecificProperty<T> {
        boolean test(T element);
    }

    /*
     *  checks whether an Integer is odd.
     */
    public static class OddProperty implements SpecificProperty<Integer> {
        @Override
        public     boolean test(Integer element) {
            return element % 2 != 0;
        }
    }
    
    //checks whether a Point is in the first quadrant.
    public static class FirstQuadrantProperty implements SpecificProperty<Point> {
        @Override
        public boolean test(Point point) {
            return point.getX() > 0 && point.getY() > 0;
        }
    }
    
    //checks whether a String is a pangram
    public static class PanagramProperty implements SpecificProperty<String> {
        @Override
        public boolean test(String str) {
            str = str.toLowerCase().replaceAll("[^a-z]", "");
            for (char c = 'a'; c <= 'z'; c++) {
                if (str.indexOf(c) == -1) {
                    return false;
                }
            }
            return true;
        }
    }
    
    //checks whether a Person is older than 20
    public static class AgeProperty implements SpecificProperty<Person> {
        @Override
        public boolean test(Person person) {
            return person.getAge() > 20;
        }
    }
    
    public static class Person {
        private String firstName;
        private String lastName;
        private int age;
    
        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }
    
        public String getFirstName() {
            return firstName;
        }
    
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
    
        public String getLastName() {
            return lastName;
        }
    
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    
        public int getAge() {
            return age;
        }
    
        public void setAge(int age) {
            this.age = age;
        }
    
        @Override
        public String toString() {
            return firstName + " " + lastName + ", " + age;
        }
    }
    
    public static class Point {
        private int x;
        private int y;
    
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    
        public int getX() {
            return x;
        }
    
        public void setX(int x) {
            this.x = x;
        }
    
        public int getY() {
            return y;
        }
    
        public void setY(int y) {
            this.y = y;
        }
    
        @Override
        public String toString() {
            return "(" + x + "," + y + ")";
        }
    }
}
