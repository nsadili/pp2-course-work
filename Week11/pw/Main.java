public class Main {
    public static void main(String[] args) {
        SpecProp<Integer> isOdd = (Integer i) -> i % 2 != 0;

        SpecProp<Point> firstQ = p -> p.x > 0 && p.y > 0;

        SpecProp<Person> old20 = (Person p) -> p.age > 20;


        System.out.println(isOdd.check(5)); 
        System.out.println(firstQ.check(new Point(3,5)));
        System.out.println(old20.check(new Person("Murad", "Mammadov", 18)));
        
    }
}
