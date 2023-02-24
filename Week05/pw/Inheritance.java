public class Inheritance {
    public static void main(String[] args) {
        //need to be loaded
    }
}

class Person{
    private String firstName = "Nariman";
    private String lastName = "Mammadov";
    private String gender = "Male";
    public Person(String firstName, String lastName, String gender) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;

    }
    //GETTERS
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getGender(){
        return this.gender;
    }
    // SETTERS
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    //string
    public String toString(){
        return "First Name: "+getFirstName()+" Last Name: "+getLastName()+", Gender: "+getGender();        
    }
    //equals
    public boolean equals(Person p){
        return p.firstName==this.firstName && p.lastName==this.lastName && p.gender==this.gender;
    }
}

class Teacher extends Person{
    private String department = "Baku";
    private String courses = "Programming Principles";
    public Teacher(String firstName, String lastName, String gender, String department, String courses) {

        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;

    }
    //getters
    public String getDepartment(){
        return this.department;
    }
    public String getCourses(){
        return this.courses;
    }
    //setters
    public void setDepartment(String a){
        this.department=a;
    }
    public void setCourses(String a){
        this.courses=a;
    }
    //tostring
    public String toString(){
        return "First Name: "+getFirstName()+" Last Name: "+getLastName()+", Gender: "+getGender()+", Department: "+getDepartment()+", Courses: "+ getCourses();        
    }
    //equals
    public boolean equals(Teacher T){
        return super.equals(T) && T.department==this.department && T.courses==this.courses;
    }
}

class Student extends Person{
    private int studentId=12345;

    public Student(String firstName, String lastName, String gender,int studentId) {
        super(firstName, lastName, gender);
        this.studentId=studentId;
    }
    //getter
    public int getStudentId(){
        return this.studentId;
    }
    //setter
    public void setStudentId(int a){
        this.studentId=a;
    }
    //tostring
    public String toString(){
        return "First Name: "+getFirstName()+" Last Name: "+getLastName()+", Gender: "+getGender()+", StudentID"+getStudentId();        
    }
    //equals
    public boolean equals(Student s){

        return super.equals(s) && s.studentId==this.studentId;
    }

}
class PhdStudent extends Student{
    private String department="Baku";
    private String courses="Calculus";

    public PhdStudent(String firstName,String lastName, String gender, int studentId, String department, String courses){
        super(firstName, lastName, gender, studentId);
        this.department=department;
        this.courses=courses;
    }
    //getters
    public String getCourses(){
        return this.courses;
    }
    public String getDepartment() {
        return department;
    }
    //setters
    public void setCourses(String a){
        this.courses=a;
    }
    public void setDepartment(String a) {
        this.department=a;
    }
    //tostring
    public String toString(){
        return "First Name: "+getFirstName()+" Last Name: "+getLastName()+", Gender: "+getGender()+", StudentID"+getStudentId()+", Department: "+getDepartment()+", Courses: "+getCourses();        
    }
    //equals
    public boolean equals(PhdStudent ps){
        return super.equals(ps) && ps.department==this.department && ps.courses==this.courses;
    }

}
