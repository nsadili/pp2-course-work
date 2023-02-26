import school.*;


public class SchoolTest {
    public static void main(String[] args) throws Exception {
        Student student = new Student("Fuad", "Gasimov", "male", 17203);
        Teacher teacher = new Teacher("Asiman", "Mammadzada", "male", "SITE", "PP2");


        System.out.println(student);
        System.out.println(teacher);
    }
}