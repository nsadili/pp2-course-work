public class Teacher extends Person{
    private String department;
    private String courses;

    public Teacher(String firstName, String lastName, String gender, String department, String courses){
        super(firstName, lastName,gender);
        this.department = department;
        this.courses = courses;
    }

    @Override
    public String toString(){
        return super.toString() + " Department: " + this.department + " Courses: " + this.courses;
    }

    public boolean equals(Teacher t){
        if(t == null){
            return false;
        }else{
            return super.equals(t) && department.equals(this.department) && courses.equals(this.courses);
        }
    }
}