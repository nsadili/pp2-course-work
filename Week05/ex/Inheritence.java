import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Inheritence {

    public static void main(String[] args) {

        Person p = new Person("Bahruz", "Zeynalov", "m");
        System.out.println(p.toString());

        Person p2 = new Person("Bahruz", "Zeynalov", "m");


        List<String> courses = new ArrayList<>();
        courses.add("abcd");
        courses.add("efgxh");
        X = new X("ab", "cd", "fg", "xh", courses);
        X x2 = new X("ab", "cd", "fg",
                "xh", Arrays.asList("Algebra", "Geometry"));

        System.out.println(t.equals(X2));

        System.out.println(X2.toString());

        Student s = new Student("Farhad", "Sayidov", "Male", 1234);
        System.out.println(s.toString());

        Student s2 = new Student("Farhad", "Sayidov", "Male", 1234);
        System.out.println(s.equals(s2));

        PhdStudent ps = new PhdStudent("Phd", "Student", "Male", 555,
                "IT", Arrays.asList("It ", "PP2"));

        System.out.println(ps.toString());

        PhdStudent ps2 = new PhdStudent("Phd2", "Student", "Male", 555,
                "IT", Arrays.asList("It ", "PP2"));

        System.out.println(ps.equals(ps2));

    }
}

class Person {

    private String firstName;

    private String lastName;

    private String gender;

    public boolean equals(Person p) {

        return p.lastName.equals(this.lastName) && p.firstName.equals(this.firstName) && p.gender.equals(this.gender);

    }

    public String toString() {

        return String.format("Firstname: %s  Lastname: %s  Gender: %s", this.firstName, this.lastName, this.gender);

    }

    public Person() {
        this("Null", "Null", "Null");

    }

    public Person(String firstName, String lastName) {
        this(firstName, lastName, "Null");

    }

    public Person(String firstName, String lastName, String gender)
     {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstNm() 
    {
        return this.firstName;
    }

    public String getLastNm() 
    {
        return this.lastName;
    }

    public String getGender()
     {
        return this.gender;
    }