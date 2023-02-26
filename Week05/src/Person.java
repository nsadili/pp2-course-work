package Week05.src;

import java.util.*;

public class Person {

    String FirstName;
    String LastName;
    String Gender;

    public Person(String FirstName, String LastName, String Gender) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Gender = Gender;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String toString() {
        return FirstName + " " + LastName + " (" + Gender + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Person)) {
            return false;
        }
        Person p = (Person) o;
        return this.FirstName.equals(p.FirstName) &&
                this.LastName.equals(p.LastName) &&
                this.Gender.equals(p.Gender);
    }
}

class Teacher extends Person {
    String department;
    String[] courses;

    public Teacher(String FirstName, String LastName, String Gender, String department, String[] courses) {
        super(FirstName, LastName, Gender);
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
        return super.toString() + ", " + department + ", Courses: " + Arrays.toString(courses);
    }

    public boolean equals(Teacher t) {
        return super.equals(t) &&
                this.department.equals(t.department) &&
                Arrays.equals(this.courses, t.courses);
    }
}

class Student extends Person {
    int studentId;

    public Student(String FirstName, String LastName, String Gender, int studentId) {
        super(FirstName, LastName, Gender);
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
        return super.equals(s) &&
                this.studentId == s.studentId;
    }
}

class PhdStudent extends Student {
    String department;
    String[] courses;

    public PhdStudent(String FirstName, String LastName, String Gender, int studentId, String department, String[] courses) {
        super(FirstName, LastName, Gender, studentId);
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
        return super.toString() + ", " + department + ", Courses: " + Arrays.toString(courses);
    }

    public boolean equals(PhdStudent pStud) {
        return super.equals(pStud) && this.department.equals(pStud.department) && Arrays.equals(this.courses, pStud.courses);
    }
}
