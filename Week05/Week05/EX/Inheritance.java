import java.util.Arrays;
import java.util.List;

public class Inheritance {

  public class Person {
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

    @Override
    public String toString() {
      return "Person [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + "]";
    }

    public boolean equals(Person p) {
      if (this.firstName.equals(p.firstName) && this.lastName.equals(p.lastName) && this.gender.equals(p.gender)) {
        return true;
      }
      return false;
    }
  }

  public class Teacher extends Person {
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

    @Override
    public String toString() {
      return "Teacher [department=" + department + ", courses=" + courses + ", firstName=" + getFirstName()
          + ", lastName=" + getLastName() + ", gender=" + getGender() + "]";
    }

    public boolean equals(Teacher t) {
      if (super.equals(t) && this.department.equals(t.department) && this.courses.equals(t.courses)) {
        return true;
      }
      return false;
    }
  }

  public class Persons {
    private String firstName;
    private String lastName;
    private String gender;

    public Persons(String firstName, String lastName, String gender) {
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

    @Override
    public String toString() {
      return firstName + " " + lastName + " (" + gender + ")";
    }

    public boolean equals(Person p) {
      return this.firstName.equals(p.firstName) && this.lastName.equals(p.lastName)
          && this.gender.equals(p.gender);
    }
  }

  public class Teachers extends Person {
    private String department;
    private String[] courses;

    public Teachers(String firstName, String lastName, String gender, String department, String[] courses) {
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

    @Override
    public String toString() {
      return super.toString() + ", " + department + " department, courses: " + Arrays.toString(courses);
    }

    public boolean equals(Teacher t) {
      return super.equals(t) && this.department.equals(t.department);
    }
  }

  public class Student extends Person {
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

    @Override
    public String toString() {
      return super.toString() + ", student ID: " + studentId;
    }

    public boolean equals(Student s) {
      return super.equals(s) && this.studentId == s.studentId;
    }
  }

  public class PhdStudent extends Student {
    private String department;
    private String[] courses;

    public PhdStudent(String firstName, String lastName, String gender, int studentId, String department,
        String[] courses) {
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

    @Override
    public String toString() {
      return super.toString() + ", " + department + " department, courses: " + Arrays.toString(courses);
    }

    public boolean equals(PhdStudent pStud) {
      return super.equals(pStud) && this.department.equals(pStud.department)
          && Arrays.equals(this.courses, pStud.courses);
    }
  }

}
