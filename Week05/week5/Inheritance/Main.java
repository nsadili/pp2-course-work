package week5.Inheritance;

import java.util.ArrayList;
import java.util.List;

import week5.Inheritance.Person.PhdStudent;
import week5.Inheritance.Person.Student;
import week5.Inheritance.Person.Teacher;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", "Smith", "f");
        Person person2 = new Person("Bob", "Johnson", "m");

    
        List<String> courses1 = new ArrayList<>();
        courses1.add("Math");
        courses1.add("Science");
        Teacher teacher1 = new Teacher("Carol", "Williams", "f", "Math", courses1);

        List<String> courses2 = new ArrayList<>();
        courses2.add("History");
        courses2.add("English");
        Teacher teacher2 = new Teacher("David", "Brown", "m", "History", courses2);

        
        Student student1 = new Student("Emily", "Davis", "f", "12345");
        Student student2 = new Student("Frank", "Lee", "m", "67890");

        
        List<String> courses3 = new ArrayList<>();
        courses3.add("Computer Science");
        courses3.add("Statistics");
        PhdStudent phdStudent1 = new PhdStudent("Grace", "Wilson", "f", "54321", "Computer Science", courses3);

        List<String> courses4 = new ArrayList<>();
        courses4.add("Biology");
        courses4.add("Chemistry");
        PhdStudent phdStudent2 = new PhdStudent("Henry", "Taylor", "m", "09876", "Biology", courses4);

        
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(teacher1.toString());
        System.out.println(teacher2.toString());
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(phdStudent1.toString());
        System.out.println(phdStudent2.toString());

        
        System.out.println(person1.equals(person2)); 
        System.out.println(teacher1.equals(teacher2)); 
        System.out.println(student1.equals(student2)); 
        System.out.println(phdStudent1.equals(phdStudent2));
    }
}
