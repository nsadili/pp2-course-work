class Person {
    private String firstName;
    private String lastName;
    private char gender;

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public char getGender(){
        return this.gender;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    public Person(){

    }

    public String toString(){
        return "FirstName: "+getFirstName()+" LastName: "+getLastName()+" Gender: "+getGender();
    }

    public boolean equals(Person p){
        if(p.getFirstName()==this.firstName) return true;
        else return false;
    }
}

class Teacher extends Person{
    private String department;
    private String courses;
    public Teacher(){
        //default constructor
    }

    public String getDepartment(){
        return this.department;
    }

    public String getCourses(){
        return this.courses;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public void setCourses(String courses){
        this.courses = courses;
    }

    public String toString(){
        return "Department: "+getDepartment()+" Courses: "+getCourses();
    }
    
    public boolean equals(Teacher t){
        if(t.toString()== this.toString()) return true;
        else return false;
    }
}

class Student extends Person{

    private int studentId;

    public int getStudentId(){
        return this.studentId;
    }

    public void setStudentId(int studentId){
        this.studentId = studentId;
    }

    public String toString(){
        return "StudentId: "+getStudentId();
    }

    public boolean equals(Student s){
        if(this.studentId==s.studentId) return true;
        else return false;
    }
}

class PhdStudent extends Student{
    private String department;
    private String courses;

    public PhdStudent(){
        //default constructor
    }

    public String getDepartment(){
        return this.department;
    }

    public String getCourses(){
        return this.courses;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public void setCourses(String courses){
        this.courses = courses;
    }


    public String toString(){
        return "Department: "+getDepartment()+" Courses: "+getCourses();
    }

    public boolean equals(PhdStudent pStud){
        if(this.toString()== pStud.toString()) return true;
        else return false;
    }

}


public class Main5{
    public static void main(String args[]){

    }
}
    
