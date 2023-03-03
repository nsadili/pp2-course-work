package Week05.ex08;

import java.util.ArrayList;
import java.util.List;

class Person {
    private String firstName;
    private String lastName;
    private String gender;
    
    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String toString() {
        return firstName + " " + lastName + " (" + gender + ")";
    }
    
    public boolean equals(Person p) {
        return this.firstName.equals(p.firstName) &&
               this.lastName.equals(p.lastName) &&
               this.gender.equals(p.gender);
    }
}

class Teacher extends Person {
    private String department;
    private List<String> courses;
    
    public Teacher(String firstName, String lastName, String gender, String department, List<String> courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public List<String> getCourses() {
        return courses;
    }
    
    public void setCourses(List<String> courses) {
        this.courses = courses;
    }
    
    public String toString() {
        return super.toString() + ", " + department + " department, teaches " + courses.size() + " courses";
    }
    
    public boolean equals(Teacher t) {
        return super.equals(t) &&
               this.department.equals(t.department) &&
               this.courses.equals(t.courses);
    }
}

class Student extends Person {
    private String studentId;
    
    public Student(String firstName, String lastName, String gender, String studentId) {
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }
    
    public String getStudentId() {
        return studentId;
    }
    
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    public String toString() {
        return super.toString() + ", student ID: " + studentId;
    }
    
    public boolean equals(Student s) {
        return super.equals(s) &&
               this.studentId.equals(s.studentId);
    }
}

class PhdStudent extends Student {
    private String department;
    private List<String> courses;
    
    public PhdStudent(String firstName, String lastName, String gender, String studentId, String department, List<String> courses) {
        super(firstName, lastName, gender, studentId);
        this.department = department;
        this.courses = courses;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public List<String> getCourses() {
        return courses;
    }
    
    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public String toString() {
        return super.toString() + ", " + department + " department, taking " + courses.size() + " courses";
    }

    public boolean equals(PhdStudent pStud) {
        return super.equals(pStud) &&
               this.department.equals(pStud.department) &&
               this.courses.equals(pStud.courses);
    }
}

public class Main {
    public static void main(String[] args) {
    List<String> courses = new ArrayList<>();
    courses.add("Math");
    courses.add("Physics");
    Teacher teacher = new Teacher("John", "Doe", "Male", "Mathematics", courses);
    System.out.println(teacher.toString());
    
    Student student = new Student("Jane", "Doe", "Female", "12345");
    System.out.println(student.toString());
    
    PhdStudent phdStudent = new PhdStudent("Bob", "Smith", "Male", "67890", "Physics", courses);
    System.out.println(phdStudent.toString());
    
    Person person1 = new Person("John", "Doe", "Male");
    Person person2 = new Person("John", "Doe", "Male");
    System.out.println(person1.equals(person2)); 
    
    Teacher teacher1 = new Teacher("John", "Doe", "Male", "Mathematics", courses);
    Teacher teacher2 = new Teacher("John", "Doe", "Male", "Mathematics", courses);
    System.out.println(teacher1.equals(teacher2));
    
    Student student1 = new Student("Jane", "Doe", "Female", "12345");
    Student student2 = new Student("Jane", "Doe", "Female", "12345");
    System.out.println(student1.equals(student2));
    
    PhdStudent phdStudent1 = new PhdStudent("Bob", "Smith", "Male", "67890", "Physics", courses);
    PhdStudent phdStudent2 = new PhdStudent("Bob", "Smith", "Male", "67890", "Physics", courses);
    System.out.println(phdStudent1.equals(phdStudent2));
    }
}