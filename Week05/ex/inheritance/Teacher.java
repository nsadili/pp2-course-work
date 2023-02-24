package inheritance;

public class Teacher extends Person{

    public Teacher(String firstName, String lastName, String gender, String department, int courses) {
        super(firstName, lastName, gender);
        this.department=department;
        this.courses=courses;
        
    }

    private String department;
    private int courses;

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int getCourses() {
        return courses;
    }
    public void setCourses(int courses) {
        this.courses = courses;
    }

    public String toString(){
        return super.toString()+"\nDepartment: " + this.department +"\nCourses:  " + this.courses;
    }

    public boolean equals (Teacher t){
        if ((t.getFirstName()==getFirstName()) && (t.getLastName()==getLastName()) && (t.getGender()==getGender())
         && (t.getDepartment()==getDepartment()) && (t.getCourses() == getCourses())) return true;
        else return false;
    }

    




    
}
