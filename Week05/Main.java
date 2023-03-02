package Week05.EX.Ex08;

public class Main {
    public static void main(String[] args) {
        // create a Person object
        Person person = new Person("Ali", "Aliyev", "Male");
        System.out.println(person);

        // create a Teacher object
        Teacher teacher = new Teacher("Nuraddin", "Sadili", "Male", "SITE", new String[] {"Programming", "Principles II"});
        System.out.println(teacher);

        // create a Student object
        Student student = new Student("Someone", "someone", "Male", "1111");
        System.out.println(student);

        // create a PhdStudent object
        PhdStudent phdStudent = new PhdStudent("*****", "*****", "*****", "*****", new String[] {"*****", "*****"}, "*****");
        System.out.println(phdStudent);

        // test equality
        System.out.println(person.equals(teacher)); // should be false
        System.out.println(student.equals(phdStudent)); // should be false
        System.out.println(phdStudent.equals(new PhdStudent("*****", "*****", "*****", "*****", new String[] {"*****", "*****"}, "*****")));// should be true
    }
}

