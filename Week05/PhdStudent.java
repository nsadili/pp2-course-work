package Week05;

public class PhdStudent extends Student {
    private String department;
    private String courses;
    private Student student;
    public PhdStudent(String department, String courses, Student student){
        super(student.getStudentId(),student.getPerson());
        this.department=department;
        this.courses=courses;
        this.student=student;

    }
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
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    @Override
    public String toString(){
        return "PHD Student's department: "+this.department+"\nCourses: "+this.courses;
    }
    public boolean equals(PhdStudent pStud){
        return this.department.equals(pStud.getDepartment())&&this.courses.equals(pStud.getCourses());
    }
}
