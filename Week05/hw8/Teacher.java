public class Teacher extends Person {
    private final String department;
    private final String[] courses;
    
    public Teacher(String firstName, String lastName, String gender, String department, String[] courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public String[] getCourses() {
        return courses;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Department: " + department + ", Courses: " + Arrays.toString(courses);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Teacher)) {
            return false;
        }
        Teacher t = (Teacher) obj;
        return super.equals(t) && department.equals(t.getDepartment()) && Arrays.equals(courses, t.getCourses());
    }
}
