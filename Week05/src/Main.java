package Week05.src;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("John", "Doe", "Male");
        Person person2 = new Person("Jane", "Doe", "Female");
    

        Teacher teacher1 = new Teacher("David", "Smith", "Male", "Mathematics", new String[]{"Algebra", "Calculus"});
        Teacher teacher2 = new Teacher("Sarah", "Jones", "Female", "English", new String[]{"Literature", "Composition"});


        Student student1 = new Student("Michael", "Johnson", "Male", 1234);
        Student student2 = new Student("Emily", "Davis", "Female", 5678);
        System.out.println(student1);
        System.out.println(student2);

        PhdStudent phdStudent1 = new PhdStudent("George", "Wilson", "Male", 9012, "Computer Science", new String[]{"Artificial Intelligence", "Data Mining"});
        PhdStudent phdStudent2 = new PhdStudent("Karen", "Taylor", "Female", 3456, "Biology", new String[]{"Genetics", "Evolution"});
        System.out.println(phdStudent1);
        System.out.println(phdStudent2);

        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person1));

        System.out.println(teacher1.equals(teacher2));
        System.out.println(teacher1.equals(teacher1));

        System.out.println(student1.equals(student2));
        System.out.println(student1.equals(student1));

        System.out.println(phdStudent1.equals(phdStudent2));
        System.out.println(phdStudent1.equals(phdStudent1));
    }
}
