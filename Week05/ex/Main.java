package ex;

public class Main {
    public static void main(String[] args) {
       // Create a Person
       Person person = new Person("John", "Doe", "Male");
       System.out.println(person.toString());
       
       // Create a Teacher
       String[] courses = {"Math", "Science"};
       Teacher teacher = new Teacher("Jane", "Smith", "Female", "Mathematics", courses);
       System.out.println(teacher.toString());
       
       // Create a Student
       Student student = new Student("Mary", "Johnson", "Female", "123456");
       System.out.println(student.toString());
       
       // Create a PhdStudent
       String[] phdCourses = {"Advanced Mathematics", "Physics"};
       PhdStudent phdStudent = new PhdStudent("Bob", "Williams", "Male", "789012", "Physics", phdCourses);
       System.out.println(phdStudent.toString());
       
       // Test the equals method
       Person person2 = new Person("John", "Doe", "Male");
       System.out.println(person.equals(person2)); // true
       
       Teacher teacher2 = new Teacher("Jane", "Smith", "Female", "Mathematics", courses);
       System.out.println(teacher.equals(teacher2)); // true
       
       Student student2 = new Student("Mary", "Johnson", "Female", "123456");
       System.out.println(student.equals(student2)); // true
       
       PhdStudent phdStudent2 = new PhdStudent("Bob", "Williams", "Male", "789012", "Physics", phdCourses);
       System.out.println(phdStudent.equals(phdStudent2)); // true
    }
 }
