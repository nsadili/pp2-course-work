package Week05.practicalworks;

import java.security.Permission;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jamal", "Malik", "Male");
        Person person2 = new Person("Sevda", "Gunel", "Female");

        Teacher teacher1 = new Teacher("Delya", "Gulya", "Female", "Math", new String[]{"Algebra", "Geometry"});
        Teacher teacher2 = new Teacher("Sabir", "Suleyman", "Male", "Science", new String[]{"Physics", "Chemistry"});

        Student student1 = new Student("Ben", "John", "Male", 123456);
        Student student2 = new Student("Emilia", "Jennifer", "Female", 234567);

        PhdStudent phdStudent1 = new PhdStudent("Dave", "Bruce", "Male", 345678, "Computer Science", new String[]{"Machine Learning", "Data Mining"});

        System.out.println(person1);
        System.out.println(person2);

        System.out.println(teacher1);
        System.out.println(teacher2);

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(phdStudent1);
    }
}
