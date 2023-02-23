package Week05.HW;

public class Inheritance {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", "Male");
        Teacher teacher = new Teacher("Jane", "Smith", "Female", "Computer Science", new String[]{"Programming", "Databases"});
        Student student = new Student("Bob", "Johnson", "Male", "123456");
        //PhdStudent phdStudent = new PhdStudent("Sarah", "Lee", "Female", "789012", "Computer Science", new String[]{"Artificial Intelligence", "Machine Learning"});

        System.out.println(person.toString());
        System.out.println(teacher.toString());
        System.out.println(student.toString());
        //System.out.println(phdStudent.toString());

        System.out.println(person.equals(new Person("John", "Doe", "Male")));
        System.out.println(teacher.equals(new Teacher("Jane", "Smith", "Female", "Computer Science", new String[]{"Programming", "Databases"})));
        System.out.println(student.equals(new Student("Bob", "Johnson", "Male", "123456")));
        //System.out.println(phdStudent.equals(new PhdStudent("Sarah", "Lee", "Female", "789012", "Computer Science", new String[]{"Artificial Intelligence", "Machine Learning"})));
    }
}

