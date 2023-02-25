import java.util.Arrays;

public class Ex8TEST {
   
    public static void main(String[] args) {

        // create a Teacher

        Teacher teacher = new Teacher("John", "Doe", "Male", "Math", new String[]{"Algebra", "Geometry"});

        System.out.println(teacher);



        // create a Student

        Student student = new Student("Jane", "Doe", "Female", 123456);

        System.out.println(student);
     
        
        
        // test equals() methods
        
        Student student2 = new Student("Jane", "Doe", "Female", 123456);
        
        System.out.println("student.equals(student2): " + student.equals(student2));
        
        // create a PhdStudent

        PhdStudent phdStudent = new PhdStudent("Bob", "Smith", "Male", 654321, "Physics", new String[]{"Quantum Mechanics", "General Relativity"});

        System.out.println(phdStudent);
        

        PhdStudent phdStudent2 = new PhdStudent("Bob", "Smith", "Male", 654321, "Physics", new String[]{"Quantum Mechanics", "General Relativity"});

        System.out.println("phdStudent.equals(phdStudent2): " + phdStudent.equals(phdStudent2));

    }

}
