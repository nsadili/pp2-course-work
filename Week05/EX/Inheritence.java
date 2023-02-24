package EX;

import java.util.Arrays;

import EX.Person.PhdStudent;
import EX.Person.Student;
import EX.Person.Teacher;

    

public class Inheritence{
    public static void main(String[] args){
Person person = new Person("Rahima", "Karimova", "Female");
PhdStudent phdStudent = person.new PhdStudent("Rahima", "Karimova", "Female", "1234", new String[]{"PP2", "Calculus 2"}, "BSIT");
Person Teacher = new Person("Jane", "Smith", "Female");
Teacher teacher1 = Teacher.new Teacher("Jane", "Smith", "Female", "Computer Science", new String[] {"Java Programming", "Algorithms"});
Person studentPerson= new Person(null,null,null);
Student studetn1= studentPerson.new Student("Amina", "Aliyeva", "Female", "12313");
System.out.println("Phd Student: \n" + phdStudent.toString());
System.out.println("Teacher: \n" + teacher1.toString());
System.out.println("Student \n" + studetn1.toString());
System.out.println("Equals method results:");
System.out.println("Person1 equals Teacher1: " + person.equals(teacher1));
System.out.println("Teacher1 equals Teacher1: " + teacher1.equals(teacher1));

    }

    
}
class Person{
    private String firstName;
    private String lastName;
    private String gender;
protected Person(String firstName, String lastName, String gender){
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender =gender;
}
public String getFirstName(){
    return firstName;
}
public String getLastName() {
    return lastName;
}
public String getGender() {
    return gender;
}
public void setFirstName(String firstName){
this.firstName=firstName;
}
public void setLastName(String lastName) {
    this.lastName = lastName;
}
public void setGender(String gender) {
    this.gender = gender;
}
public String ToString(){
    return "First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" + "Gender: " +gender;
}
public boolean Equals(Person p){
    return p.firstName.equals(this.firstName) && p.lastName.equals(this.lastName) && p.gender.equals(this.gender);

}
class Teacher extends Person {
    private String department;
    private String courses[];

    protected Teacher(String firstName, String lastName, String gender, String department, String[] courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
        
    }

    
    public String getDepartment() {
        return department;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    
    public String toString() {
        return super.ToString()+"\nDepartment: " + department + "\nCourses:" + Arrays.toString(courses);
    }

public boolean Equals(Teacher p){
    return super.Equals(p) && this.department.equals(p.department) && Arrays.equals(p.courses,this. courses);
}

    
}
class Student extends Person{
    private String studentId;
    protected Student(String firstName, String lastName, String gender, String studentId){
        super(firstName,lastName,gender);
        this.studentId=studentId;
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String toString() {
        return super.ToString()+"\nStudent Id: " + studentId;
    }
    public boolean Equals(Student p){
        return super.Equals(p) && this.studentId.equals(p.studentId);
    }


}
class PhdStudent extends Student{
private String department;
private String courses[];
    protected PhdStudent(String firstName, String lastName, String gender, String studentId,String courses[],String department) {
        super(firstName, lastName, gender, studentId);
        this.department=department;
        this.courses=courses;
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
    public String toString() {
        return super.ToString()+"\nDepartment: " + department + "\nCourses: " + Arrays.toString(courses);
    }
   
    public boolean Equals(PhdStudent p){
        return super.Equals(p) && p.department.equals(this.department) && Arrays.equals(p.courses,this.courses);
    }


}

}

    