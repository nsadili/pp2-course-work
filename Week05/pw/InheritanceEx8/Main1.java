package InheritanceEx8;

public class Main1 {

    public static void main(String[] args) {

        // create a Teacher

        Teacher teacher = new Teacher("John", "Doe", "Male", "Math", "Algebra, Geometry");

        System.out.println(teacher);



        // create a Student

        Student student = new Student("Jane", "Doe", "Female", 123456);

        System.out.println(student);



        // create a PhdStudent

        PhdStudent phdStudent = new PhdStudent("Bob", "Smith", "Male", 654321, "Physics", "Quantum Mechanics, General Relativity");

        System.out.println(phdStudent);



        // test equals() methods

        Student student2 = new Student("Jane", "Doe", "Female", 123456);

        System.out.println("student.equals(student2): " + student.equals(student2));



        PhdStudent phdStudent2 = new PhdStudent("Bob", "Smith", "Male", 654321, "Physics", "Quantum Mechanics, General Relativity");

        System.out.println("phdStudent.equals(phdStudent2): " + phdStudent.equals(phdStudent2));

    }

}