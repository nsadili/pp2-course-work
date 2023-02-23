package Week05;

import java.util.Arrays;

public class Ex8 {

// Person class
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
        return firstName.equals(p.getFirstName()) && lastName.equals(p.getLastName()) && gender.equals(p.getGender());
    }
}

// Teacher class
class Teacher extends Person {
    private String department;
    private String[] courses;

    public Teacher(String firstName, String lastName, String gender, String department, String[] courses) {
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

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }


    public String toString() {
        return super.toString() + ", " + department + " department, teaching " + String.join(", ", courses);
    }

    public boolean equals(Teacher t) {
        return super.equals(t) && department.equals(t.getDepartment()) && Arrays.equals(courses, t.getCourses());
    }
}

// Student class
class Student extends Person {
    private int studentId;

    public Student(String firstName, String lastName, String gender, int studentId) {
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


    public String toString() {
        return super.toString() + ", Student ID: " + studentId;
    }

    public boolean equals(Student s) {
        return super.equals(s) && studentId == s.getStudentId();
    }
}

// PhdStudent class
class PhdStudent extends Student {
    private String department;
    private String[] courses;

    public PhdStudent(String firstName, String lastName, String gender, int studentId, String department, String[] courses) {
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

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }


    public String toString() {
        return super.toString() + ", " + department + " department, taking " + String.join(", ", courses) + " courses";
    }

    public boolean equals(PhdStudent pStud) {
        return super.equals(pStud) && department.equals(pStud.getDepartment()) && Arrays.equals(courses, pStud.getCourses());
    }
    
}
public class Main {
    public static void main(String[] args) {
        // Create a Person
        Person person = new Person("Ilqar", "Malikov", "Male");
        System.out.println(person.toString());

        // Create a Teacher
        String[] courses = {"Calculus 1", "Science"};
        Teacher teacher = new Teacher("Yagub", "Aliyev", "Male", "Mathematics", courses);
        System.out.println(teacher.toString());

        // Create a Student
        Student student = new Student("Murad", "Huseynov", "Male", 13942);
        System.out.println(student.toString());

        // Create a PhdStudent
        String[] phdCourses = {"Advanced Math", "Research Methods"};
        PhdStudent phdStudent = new PhdStudent("Farrukh", "Amanatov", "Male", 12432, "Mathematics", phdCourses);
        System.out.println(phdStudent.toString());

        // Test equality
        Person person2 = new Person("Ilqar", "Malikov", "Male");
        System.out.println("person equals person2: " + person.equals(person2));

        Teacher teacher2 = new Teacher("Yagub", "Aliyev", "Male", "Mathematics", courses);
        System.out.println("teacher equals teacher2: " + teacher.equals(teacher2));

        Student student2 = new Student("Murad", "Huseynov", "Male", 13942);
        System.out.println("student equals student2: " + student.equals(student2));

        PhdStudent phdStudent2 = new PhdStudent("Farrukh", "Amanatov", "Male", 12432, "Mathematics", phdCourses);
        System.out.println("phdStudent equals phdStudent2: " + phdStudent.equals(phdStudent2));
    }
}

}
