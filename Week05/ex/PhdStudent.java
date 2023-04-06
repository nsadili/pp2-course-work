import java.util.Arrays;

public class PhdStudent extends Student {
    private String department;
            private String[] courses;

            public PhdStudent(String firstName, String lastName, String gender, String studentId, String department, String[] courses){
               super(firstName, lastName, gender, studentId);

               this.department = department;
               this.courses = courses;
            }

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

            public String toString(){
                return super.toString() + ", department: " + this.department;
            }
            public boolean equals(PhdStudent s) {
                return super.equals(s) && this.department == s.getDepartment() && Arrays.equals(this.courses, s.getCourses());
            }
}
