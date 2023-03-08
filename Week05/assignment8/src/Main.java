public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", "Male");
        System.out.println(person);

        Teacher teacher = new Teacher("Jane", "Smith", "Female", "Mathematics", "Calculus I, Calculus II");
        System.out.println(teacher);

        Student student = new Student("Bob", "Johnson", "Male", "123456");
        System.out.println(student);

        PhdStudent phdStudent = new PhdStudent("Alice", "Lee", "Female", "987654", "Computer Science",
                "Artificial Intelligence");
        System.out.println(phdStudent);

        // Testing equals methods
        Person person2 = new Person("John", "Doe", "Male");
        System.out.println("person.equals(person2): " + person.equals(person2));

        Teacher teacher2 = new Teacher("Jane", "Smith", "Female", "Mathematics", "Calculus I, Calculus II");
        System.out.println("teacher.equals(teacher2): " + teacher.equals(teacher2));

        Student student2 = new Student("Bob", "Johnson", "Male", "123456");
        System.out.println("student.equals(student2): " + student.equals(student2));

        PhdStudent phdStudent2 = new PhdStudent("Alice", "Lee", "Female", "987654", "Computer Science",
                "Artificial Intelligence");
        System.out.println("phdStudent.equals(phdStudent2): " + phdStudent.equals(phdStudent2));
    }
}
