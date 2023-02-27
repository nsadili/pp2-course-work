package Week05;

public class Teacher extends Person{
    private String department;
    private String courses;
    private Person person;
    public Teacher(String department, String courses,Person person){
        super(person.getFirstName(),person.getLastName(),person.getGender());
        this.department=department;
        this.courses=courses;
        this.person=person;
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
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    @Override
    public String toString(){
        return "Teacher: "+person.getFirstName()+ " "+person.getLastName()+"\nDepartment: "+this.department+
        "\nCourses: "+this.courses;
    }
    public boolean equals(Teacher t){
        return this.department.equals(t.getDepartment())&&this.courses.equals(t.getCourses());
    }
   

}
