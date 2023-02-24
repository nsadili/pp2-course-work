public class Inheritance {
    public static void main(String[] args) {
        Person p = new Person("Nariman","Mammadov","Male");
        Person P = new Person ("Shamil", "Abbasov", "Male");

        Teacher T = new Teacher("Nariman","Mammadov","Male","SITE", "PP2,PP1");
        Teacher t = new Teacher("Shamil", "Abbasov", "Male", "SITE", "joking, eating");

        Student s = new Student("Nariman", "Mammadov", "Male", 47);
        Student S = new Student("Shamil", "Abbasov", "Male", 36);

        PhdStudent ps = new PhdStudent("Nariman", "Mammadov", "Male", 47, "SITE","pp2,pp1");
        PhdStudent PS = new PhdStudent("Shamil", "Abbasov", "Male", 36, "SITE", "pp1,pp2");

        System.out.println(p.toString());
        System.out.println(t.toString());
        System.out.println(s.toString());
        System.out.println(ps.toString());

        System.out.println(P.equals(p));
        System.out.println(T.equals(t));
        System.out.println(S.equals(s));
        System.out.println(PS.equals(ps));

    }
}

class Person{
    private String firstName;
    private String lastName;
    private String gender;
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
    private String department;
    private String courses;
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