package inheritance;

public class PhdStudent extends Student{

    public PhdStudent(String firstName, String lastName, String gender, String StudentID, String department, int courses) {
        super(firstName, lastName, gender, StudentID);
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
        return super.toString() + "\nDepartment: " + this.department +"\nCourses:  " + this.courses;
    }

    public boolean equals(PhdStudent pStud){
        if ((pStud.getFirstName()==getFirstName()) && (pStud.getLastName()==getLastName()) && (pStud.getGender()==getGender())
         && (pStud.getStudentID()==getStudentID()) && (pStud.getDepartment()==getDepartment()) && (pStud.getCourses()==getCourses())) return true;
        else return false;
    }

    
    
}
