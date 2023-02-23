package Week05.pw;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Zaur", "Rajabov", "Male");
        System.out.println(p.toString());
        Student s = new Student("Zaur", "Rajabov", "Male", 17438);
        System.out.println(s.toString());
        System.out.println(s.equals(p));
        Teacher t = new Teacher("Nuraddin", "Sadili", "Male", "SITE", new String[] { "PP2", "PP1", "..." });
        System.out.println(t.toString());
        System.out.println(s.equals(t));
        PhdStudent ps = new PhdStudent("Abc", "Def", "Female", 848484, "SITE", new String[] { "aaa", "bbb", "ccc" });
        System.out.println(ps.toString());
    }
}
