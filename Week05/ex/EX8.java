import java.util.Arrays;

public class EX8 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("firstName");
        person.setLastName("lastName");
        person.setGender('g');
        System.out.println(person.toString());
        System.out.println(person.equals(person));

        Teacher teacher = new Teacher();
        teacher.setDepartment("IT");
        String[] courses = {"PP1", "PP2"};
        teacher.setCourses(courses);
        System.out.println(teacher.getDepartment());
        System.out.println(teacher.getCourses());

        Student student = new Student();
        student.setStudentId("000000");
        System.out.println(student.getStudentId());

        // Phd is same as Teacher
    }
}

class Person {

    String firstName, lastName;
    char gender;

    Person() {

    }

    String getFirstName() {
        return firstName;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getLastName() {
        return lastName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    char getGender() {
        return gender;
    }

    void setGender(char gender) {
        this.gender = gender;
    }

    public String toString() {
        return firstName + " " + lastName + " " + gender;
    }

    boolean equals(Person p) {
        if(p.firstName == firstName && p.lastName == lastName && p.gender == gender) return true;
        return false;
    }

}

class Teacher extends Person {

    String department;
    String[] courses;

    Teacher() {

    }

    String getDepartment() {
        return department;
    }

    void setDepartment(String department) {
        this.department = department;
    }

    String getCourses() {
        return Arrays.toString(courses);
    }

    void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String toString() {
        return department + " " + courses;
    }

    boolean equals(Teacher t) {
        if (t.department == department && t.courses == courses) return true;
        return false;
    }

}

class Student extends Person {

    String studentId;

    Student() {

    }

    String getStudentId() {
        return studentId;
    }

    void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String toString() {
        return studentId;
    }

    boolean equals(Student s) {
        if (s.studentId == studentId) return true;
        return false;
    }

}

class PhdStudent extends Student {

    String department;
    String[] courses;

    PhdStudent() {

    }

    String getDepartment() {
        return department;
    }

    void setDepartment(String department) {
        this.department = department;
    }

    String[] getCourses() {
        return courses;
    }

    void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String toString() {
        return department + " " + courses;
    }

    boolean equals(PhdStudent phdStudent) {
        if (phdStudent.department == department && phdStudent.courses == courses) return true;
        return false;
    }

}
