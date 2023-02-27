package Week05.EX08;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Elnur", "Ismayilzade", "Male");
        System.out.println(person);

        Teacher teacher = new Teacher("Nuraddin", "Sadili", "Male", "SITE",
                new String[] { "Programming", "Principles II" });
        System.out.println(teacher);

        Student student = new Student("Someone", "someone", "Male", "1111");
        System.out.println(student);

        PhdStudent phdStudent = new PhdStudent("****", "****", "****", "****", new String[] { "****", "****" },
                "*****");
        System.out.println(phdStudent);

        System.out.println(person.equals(teacher));
        System.out.println(student.equals(phdStudent));
        System.out.println(phdStudent.equals(
                new PhdStudent("****", "****", "****", "****", new String[] { "****", "****" }, "****")));// should
                                                                                                          // be
                                                                                                          // true
    }
}