import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Inheritence {

    public static void main(String[] args) {

        Person p = new Person("Shamil", "Abbasov", "Male");
        System.out.println(p.toString());

        Person p2 = new Person("Shamil", "Abbasov", "Male");

        // p.setLastNm("Ali");
        // System.out.println(p.toString());
        // System.out.println(p.getFirstNm());

        // System.out.println(p.equals(p2));

        List<String> courses = new ArrayList<>();
        courses.add("Algebra");
        courses.add("Geometry");
        Teacher t = new Teacher("John", "Doe", "Male", "Math", courses);
        Teacher teacher2 = new Teacher("John", "Doe", "Male",
         "Math", Arrays.asList("Algebra", "Geometry"));


        System.out.println(t.equals(teacher2));

        System.out.println(teacher2.toString());

        Student s=new Student("Farhad", "Sayidov" , "Male" , 1234);
        System.out.println(s.toString());

        Student s2=new Student("Farhad", "Sayidov" , "Male" , 1234);
        System.out.println(s.equals(s2));

        PhdStudent ps=
        new PhdStudent("Phd", "Student", "Male", 555,
         "IT", Arrays.asList("It ","PP2"));

         System.out.println(ps.toString());

         PhdStudent ps2=
         new PhdStudent("Phd2", "Student", "Male", 555,
          "IT", Arrays.asList("It ","PP2"));

          System.out.println(ps.equals(ps2));




    }
}

class Person {

    private String firstName;

    private String lastName;

    private String gender;

    public boolean equals(Person p) {

        return p.lastName.equals(this.lastName) && p.firstName.equals(this.firstName) && p.gender.equals(this.gender);

    }

    public String toString() {

        return String.format("Firstname: %s  Lastname: %s  Gender: %s", this.firstName, this.lastName, this.gender);

    }

    public Person() {
        this("Null", "Null", "Null");

    }

    public Person(String firstName, String lastName) {
        this(firstName, lastName, "Null");

    }

    public Person(String firstName, String lastName, String gender) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;

    }

    public String getFirstNm() {
        return this.firstName;
    }

    public String getLastNm() {
        return this.lastName;
    }

    public String getGender() {
        return this.gender;
    }

    public void setFirstNm(String firstName) {
        this.firstName = firstName;
    }

    public void setLastNm(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public boolean equals(Teacher t){

        return super.equals(t) && t.department.equals(this.department) && t.courses.equals(this.courses);

    }

    public String toString() {

        return String.format("Firstname: %s  Lastname: %s  Gender: %s  Department: %s  Courses: %s ",
                this.getFirstNm(), this.getLastNm(), this.getGender(), this.department, String.join(", ", courses));
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

}

class Student extends Person{

    private int studentId;

    public Student(String firstName,String lastName, String gender, int studentId){
        super(firstName,lastName,gender);
        this.studentId=studentId;

    }


    public String toString(){

        return String.format("Firstname: %s  Lastname: %s  Gender: %s  StudentId: %d ", this.getFirstNm() , this.getLastNm(), this.getGender(),studentId);

    }

    public boolean equals(Student s){

        return super.equals(s) && s.studentId==this.studentId;
    }


    public int getStudentId(){
        return this.studentId;
    }

    public void setStudentId(int studentId){
        this.studentId=studentId;
    }

}

class PhdStudent extends Student{

    private String department;

    private List<String> courses;

    public PhdStudent(String firstName,String lastName, String gender, int studentId, String department, List<String> courses){

        super(firstName, lastName, gender, studentId);

        this.department=department;
        this.courses=courses;

    }

    public List<String> getCourses(){

        return this.courses;

    }

    public void setCourses(List<String> courses){
        this.courses=courses;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }   

    public String toString(){

        return String.format("Firstname: %s  Lastname: %s  Gender: %s  Department: %s  Courses: %s  StudentId: %d ", 
        getFirstNm(),getLastNm(),getGender(),this.department,String.join(", ", courses), getStudentId());

    }

    public boolean equals(PhdStudent pStud){

        return super.equals(pStud) && pStud.department.equals(this.department) && pStud.courses.equals(this.courses);

    }

    



}
