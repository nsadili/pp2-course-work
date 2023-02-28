package ex;

import java.util.Arrays;

public class PhdStudent extends Student {
    private String department;
    private String[] courses;
    
    public PhdStudent(String firstName, String lastName, String gender, String studentId, String department, String[] courses) {
       super(firstName, lastName, gender, studentId);
       this.department = department;
       this.courses = courses;
    }
    
    // getters and setters
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
    
    // toString method
    public String toString() {
       return super.toString() + ", " + department + " department, Ph.D. candidate, taking " + Arrays.toString(courses);
    }
    
    // equals method
    public boolean equals(PhdStudent pStud) {
       if (pStud == null) {
          return false;
       }
       if (!super.equals(pStud)) {
          return false;
       }
       PhdStudent phdStudent = (PhdStudent) pStud;
       return department.equals(phdStudent.department) && Arrays.equals(courses, phdStudent.courses);
    }
}
