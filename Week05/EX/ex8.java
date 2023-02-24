package EX;
import java.util.Arrays;

class Person {
    private String firstName;
    private String lastName;
    private String gender;
    public Person(){

    }
    public Person(String firstName, String lastName, String gender){
        setFirstName(firstName);
        setLastName(lastName);
        setGender(gender);
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getGender() {
        return gender;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String toString(Person p){
        return String.format("\nFirst name: %s\nLast name: %s\nGender: %s\n", p.firstName, p.lastName, p.gender);
    }
    public String equals(Person p){
        if (p.firstName == this.firstName && p.lastName == this.lastName && p.gender == this.gender)
        return "They are the same people."; else return "They are different people."; 
    }
}

class Teacher extends Person {
    private String department;
    private String[] courses;
    public Teacher (String firstName, String lastName, String gender, String department, String[] courses){
        setFirstName(firstName);
        setLastName(lastName);
        setGender(gender);
        setDepartment(department);
        setCourses(courses);
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setCourses(String[] courses) {
        this.courses = courses;
    }
    public String getDepartment() {
        return department;
    }
    public String[] getCourses() {
        return courses;
    }
    public String toString(Teacher t) {
        return String.format("\nFirst name: %s\nLast name: %s\nGender: %s\nDepartment: %s\nCourses: %s\n", t.getFirstName(), t.getLastName(), t.getGender(), t.department, Arrays.toString(t.courses));
    }
    public String equals(Teacher t){
        if (t.department == this.department && t.courses == this.courses && t.getFirstName() == this.getFirstName() && t.getLastName() == this.getLastName() && t.getGender() == this.getGender())
        return "They are the same people."; else return "They are different people."; 
    }
}

class Student extends Person {
    private int studentId;
    public Student (String firstName, String lastName, String gender, int studentId){
        setFirstName(firstName);
        setLastName(lastName);
        setGender(gender);
        setLastName(lastName);
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String toString(){
        return String.format("\nFirst name: %s\nLast name: %s\nGender: %s\nStudent ID: %s\n", this.getFirstName(), this.getLastName(), this.getGender(), this.studentId);
    }
    public String equals(Student s){
        if (s.studentId == this.studentId && s.getFirstName() == this.getFirstName() && s.getLastName() == this.getLastName() && s.getGender() == this.getGender())
        return "They are the same people."; else return "They are different people."; 
    }
}

class PhdStudent extends Person {
    private String department;
    private String[] courses;
    public PhdStudent (String firstName, String lastName, String gender, String department, String[] courses){
        setFirstName(firstName);
        setLastName(lastName);
        setGender(gender);
        setDepartment(department);
        setCourses(courses);
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setCourses(String[] courses) {
        this.courses = courses;
    }
    public String getDepartment() {
        return department;
    }
    public String[] getCourses() {
        return courses;
    }
    public String toString(PhdStudent pStud) {
        return String.format("\nFirst name: %s\nLast name: %s\nGender: %s\nDepartment: %s\nCourses: %s\n", pStud.getFirstName(), pStud.getLastName(), pStud.getGender(), pStud.department, Arrays.toString(pStud.courses));
    }
    public String equals(PhdStudent pStud){
        if (pStud.department == this.department && pStud.courses == this.courses && pStud.getFirstName() == this.getFirstName() && pStud.getLastName() == this.getLastName() && pStud.getGender() == this.getGender())
        return "They are the same people."; else return "They are different people."; 
    }
}

public class ex8 {
    public static void main(String[] args) {
        // person
        Person person1 = new Person("Leyla", "Neymat", "Female");
        Person person2 = new Person("Lulu", "Neymat", "Female");
        System.out.print(person1.toString(person1));
        System.out.print(person1.toString(person2));
        System.out.println();
        System.out.print(person1.equals(person2));
        System.out.println();

        // teacher
        String[] courses1 = {"PP1", "PP2"};
        String[] courses2 = {"Calculus I", "Calculus II"};
        Teacher teacher1 = new Teacher("Nuraddin", "Sadili", "Male", "SITE", courses1);
        Teacher teacher2 = new Teacher("Yagub", "Aliyev", "Male", "SITE", courses2);
        System.out.print(teacher1.toString(teacher1));
        System.out.print(teacher2.toString(teacher2));
        System.out.println();
        System.out.print(teacher1.equals(teacher2));
        System.out.println();

        // student
        Student student1 = new Student("Elvin", "Hayatov", "Male", 17606);
        Student student2 = new Student("Leyla", "Neymat", "Female", 17256);
        System.out.print(student1.toString(student1));
        System.out.print(student2.toString(student2));
        System.out.println();
        System.out.print(student1.equals(student2));
        System.out.println();

        // phd student
        String[] phdCourses1 = {"Chemistry", "Biology"}; // no idea
        String[] phdCourses2 = {"Chemistry", "Biology"};
        PhdStudent phdStudent1 = new PhdStudent("Aysel", "Aslanova", "Female", "Medicine", phdCourses1);
        PhdStudent phdStudent2 = new PhdStudent("Aysel", "Aslanova", "Female", "Medicine", phdCourses2);
        System.out.print(phdStudent1.toString(phdStudent1));
        System.out.print(phdStudent2.toString(phdStudent2));
        System.out.println();
        System.out.print(phdStudent1.equals(phdStudent2));
        System.out.println();
    }
}

// ask about equals method