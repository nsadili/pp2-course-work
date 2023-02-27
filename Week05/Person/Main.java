package Week05.Person;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        Person person = new Person("Eljan", "Abdullazada", "male");
        Teacher teacher = new Teacher("Nuraddin", "Sadili", "male", "IT", "Programming Principles and ICT");
        Student student = new Student("Eljan", "Abdullazada", "male", 14066);
        PhdStudent phdStudent = new PhdStudent("Sencer", "Yeralan", "male", 123456, "IT", "PP2");

        System.out.println("Information about person:\n" + person.toString());
        System.out.println("Person is the same person: " + person.equals(student));

        System.out.println();

        System.out.println("Information about teacher:\n" + teacher.toString());
        System.out.println("Teacher is the same teacher: " + teacher.equals(teacher));

        System.out.println();

        System.out.println("Information about student:\n" + student.toString());
        System.out.println("Student is the same student: " + student.equals(student));

        System.out.println();

        System.out.println("Information about PHD Student:\n" + phdStudent.toString());
        System.out.println("Phd Student is the same student: " + phdStudent.equals(phdStudent));

        scanner.close();
        
    }

}
