import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        Set<Person> persons = new TreeSet<>();

        persons.add(new Person("Vasi", 19));
        persons.add(new Person("rahima", 17));
        persons.add(new Person("ilaha", 19));

        // persons.stream().forEach(p -> System.out.println());
        persons.stream().forEach(System.out::println);


        Set<Person> oldersFirst = new TreeSet<>((o1, o2)-> o1.getAge().compareTo(o2.getAge()));
        oldersFirst.addAll(persons);

        

    }

    static void fancyPrint(Person p) {
        System.out.println( "***" + p + ">>>>" );
    }
}

class Person implements Comparable<Person> {
    String name;
    Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(name);
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

}