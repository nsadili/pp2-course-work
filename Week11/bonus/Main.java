import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main{
    public static int compareByAge(Person a, Person b){
        return b.getAge()  - a.getAge();
    }
    public static void main(String[] args) {
        

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        // System.out.println(list);
        Stream<Integer> listStream = list.stream();
        Set<Integer> set =  listStream.filter(num -> num%2==0).collect(Collectors.toSet());
        System.out.print("A) ");
        System.out.println(set);

        Set<Person> people = new HashSet<>(Arrays.asList(
            new Person("Nariman", 19, "Baku"),
            new Person("Shamil", 31, "Qabala"),
            new Person("Rauf", 48, "Neftchala"),
            new Person("Ismayil", 40, "Baku")
        ));
        Stream<Person> peopleStream = people.stream();

        Set<Person> people30Baku = peopleStream.filter(c -> c.getAge()>30 && c.getCity().equals("Baku")).collect(Collectors.toSet());
        System.out.print("B) ");
        System.out.println(people30Baku);

        List<String> strs = Arrays.asList("abcd", "oudbdf", "sojdbnv","ajnsf");
        Stream<String> strStream = strs.stream();
        Set<Integer> length = strStream.map(a->a.length()).collect(Collectors.toSet());
        System.out.print("C) ");
        System.out.println(length);
        Set<Person> sortedPeople = people.stream().sorted(Main::compareByAge).collect(Collectors.toSet());
        System.out.println(sortedPeople);
        
    }
}
class Person{
    private String name;
    private int age;
    private String city;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCity() {
        return city;
    }
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return getName()+" | "+getAge()+" | "+getCity();
    }
    // static int comparePersonAge implements Comparator<Person> {
    //     @Override
    //     public int compare(Person a, Person b) {
    //         return b.getAge() - a.getAge();
    //     }
    // }


    
}
