public class Inheritance{
    public static void main(String[] args){

    }
}

class Person{
    private String firstName,lastName,gender;
    Person(){}
    Person(String f, String l, String g){
        this.firstName = f;
        this.lastName = l;
        this.gender = g;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getGender() {
        return gender;
    }
    public String getLastName() {
        return lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString(){
        return String.format("f:%s\nl:%s\ng:%s\n",this.firstName,this.lastName,this.gender);
    }

    boolean equals(Person p){
        return p.toString().equals(this.toString());
    }
}

class Teacher extends Person{
    private String department;
    private String[] courses;
    Teacher(String f, String l, String g, String d, String[] c){
        this.setFirstName(f);
        this.setGender(g);
        this.setLastName(l);
        this.department = d;
        this.courses = c;
    }

    public String getFirstName(){
        return this.getFirstName();
    }
    public String getLastName(){
        return this.getLastName();
    }
    public String getGender(){
        return this.getGender();
    }
    public String getDepartment() {
        return this.department;
    }
    public String[] getCourses() {
        return this.courses;
    }

    public String toString(){
        String res;
        res= String.format("f:%s\nl:%s\ng:%s\nd:%s\n",this.getFirstName(),this.getLastName(),this.getGender(),this.department);
        res+="courses";
        for(String a:this.courses){
            res+=a+",";
        }
        return res;
    }

    public boolean equals(Teacher t){
        return this.toString().equals(t.toString());
    }
}

class Student extends Person{
    private String studentId;
    Student(){}
    Student(String f, String l, String g, String s){
        this.setFirstName(f);
        this.setGender(g);
        this.setLastName(l);
        this.studentId = s;
    }

    public String getFirstName(){
        return this.getFirstName();
    }
    public String getLastName(){
        return this.getLastName();
    }
    public String getGender(){
        return this.getGender();
    }
    public String getStudentId(){
        return this.studentId;
    }
    public void setStudentId(String id){
        this.studentId = id;
    }
    public String toString(){
        return String.format("f:%s\nl:%s\ng:%s\nid:%s\n",this.getFirstName(),this.getLastName(),this.getGender(),this.getGender());
    }

    public boolean equals(Student s){
        return this.toString().equals(s.toString());
    }
}

class PhdStudent extends Student{
    private String department;
    private String[] courses;
    PhdStudent(String f, String l, String g, String s, String d, String[] c){
        this.setFirstName(f);
        this.setGender(g);
        this.setLastName(l);
        this.setStudentId(s);
        this.department = d;
        this.courses = c.clone();
    }

    public String getFirstName(){
        return this.getFirstName();
    }
    public String getLastName(){
        return this.getLastName();
    }
    public String getGender(){
        return this.getGender();
    }
    public String getStudentId(){
        return this.getStudentId();
    }
    public String getDepartment(){
        return this.department;
    }
    public String[] getCourses(){
        return this.courses;
    }
    public void setStudentId(String id){
        this.setStudentId(id);
    }
    public void setDepartment(String d){
        this.department = d;
    }
    public void setCourses(String[] c){
        this.courses = c.clone();
    }

    public String toString(){
        String res;
        res= String.format("f:%s\nl:%s\ng:%s\nd:%s\n",this.getFirstName(),this.getLastName(),this.getGender(),this.department);
        res+="courses";
        for(String a:this.courses){
            res+=a+",";
        }
        return res;
    }

    public boolean equals(PhdStudent pStud){
        return this.toString().equals(pStud.toString());
    }
}