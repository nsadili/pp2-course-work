package week05coursework;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", "Male");
        Person person2 = new Person("Jane", "Doe", "Female");

        Teacher teacher1 = new Teacher("Mary", "Smith", "Female", "Math", new String[]{"Algebra", "Geometry"});
        Teacher teacher2 = new Teacher("John", "Doe", "Male", "Science", new String[]{"Physics", "Chemistry"});

        Student student1 = new Student("Bob", "Johnson", "Male", 123456);
        Student student2 = new Student("Alice", "Williams", "Female", 234567);

        PhdStudent phdStudent1 = new PhdStudent("David", "Lee", "Male", 345678, "Computer Science", new String[]{"Machine Learning", "Data Mining"});

        System.out.println(person1);
        System.out.println(person2);

        System.out.println(teacher1);
        System.out.println(teacher2);

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(phdStudent1);
    }
}


