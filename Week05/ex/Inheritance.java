

public class Inheritance {
    public static void main(String[] args) {
        Person p1= new Person("Ibrahim", "Huseynov", "male");
        Person p2= new Person("Ilaha", "Aliyeva", "female");

        System.out.println(p1.toString0());
        System.out.println(p2.toString0());

        System.out.println("Are we same person: "+ p1.equals(p2));
        
        Teacher t1= new Teacher("Orxan", "Haciyev", "male", "Environmental Sciences", "Chemistry");
        Teacher t2= new Teacher("Farida", "Huseynova", "female","Math", "Calculus2");

        System.out.println(t1.toString2());
        System.out.println(t2.toString2());
        System.out.println("Are my teachers same?"+ t1.equals2(t2));

        Student s1= new Student("Ibrahim", "Huseynov", "male", 16086);
        Student s2= new Student("Ilaha", "Aliyeva", "female", 17098 );
        System.out.println(s1.toString3());
        System.out.println(s2.toString3());
        System.out.println("Are students identical: "+s1.equals3(s2));

        PhdStudent phdStudent1= new PhdStudent("Ibrahim", "Huseynov", "male", 16086, "School of IT and engineering","Programming Principles 2");
        PhdStudent phdStudent2= new PhdStudent("Ilaha", "Aliyeva", "female", 17098, "School of Business","Fundamentals of Business");

        System.out.println(phdStudent1.toString4());
        System.out.println(phdStudent2.toString4());
        System.out.println("Are  PHD students identical: "+phdStudent1.equals4(phdStudent2));




       


      



        
    }
}
    class Person {
    private String firstName;
    private String lastName;
    private String gender;


    public Person(String firstName, String lastName, String gender){
    
    this.firstName=firstName;
    this.lastName= lastName;
    this.gender=gender;
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
    public String toString0(){
        return "Person full name: " +firstName+ " " + lastName + ",and gender is " + gender;
    }
    public boolean equals(Person p){
        return (this.firstName==p.firstName) && (this.lastName==p.firstName) && (this.gender==p.gender);

        
    }
    
    
    }


    class Teacher extends Person{

    
  

    private String department;
    private String courses;

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String deparment) {
        this.department = deparment;
    }
    public String getCourses() {
        return courses;
    }
    public void setCourses(String courses) {
        this.courses = courses;
    }
    public Teacher(String firstName,String lastName, String gender, String department, String courses){
        super(firstName, lastName, gender);
        this.department=department;
        this.courses=courses;

    }
    public String toString2(){
        return super.toString0()+ ", and department is " + department+ ", teaching courses are: "+courses;
    }
    public boolean equals2(Teacher t){
        return (super.equals(t)) && this.courses==t.courses && this.department==t.department;
    }


    

}
    class Student extends Person{
    private int studentId;


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public Student(String firstName, String lastName, String gender, int studentId){
        super(firstName, lastName, gender);
        this.studentId=studentId;
    }
    public String toString3(){
        return super.toString0() +" ,and Student ID is: "+ studentId;

    }
    public boolean equals3(Student s){
        return (super.equals(s)) && this.studentId==s.studentId;
    }
    

}

     class PhdStudent extends Student{
     private String department;
     private  String courses;
     public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getCourses() {
        return courses;
    }
    public void setCourses(String courses) {
        this.courses = courses;
    }

    public PhdStudent(String firstName, String lastName, String gender, int studentId, String department, String courses){
    super(firstName, lastName, gender, studentId);
    this.department=department;
    this.courses= courses;

    }
    public String toString4(){
        return super.toString3() +", Deparment: "+ department +", Courses: "+ courses;
    }
    public boolean equals4(PhdStudent pStud){
        return super.equals3(pStud) && this.department==pStud.department && this.courses==pStud.courses;
    }
     

}


  


