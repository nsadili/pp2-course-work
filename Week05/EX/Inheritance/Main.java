public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Murad", "Hajiyev", "Male");
        Person p2 = new Person("Ibrahim", "Ahmadli", "Male");
        Person p3 = new Person("Ibrahim", "Ahmadli", "Female");

        Teacher t1 = new Teacher("Kamran", "Najafli", "Male", "IT","ICT");
        Teacher t2 = new Teacher("Kamran", "Najafli", "Male", "IT","ICT");
        Teacher t3 = new Teacher("Omar", "Gahramov", "Male", "IT","ICT");

        Student s1 = new Student("Murad", "Hajiyev","Male", "AZ1001");
        Student s2 = new Student("Murad", "Hajiyev","Male", "AZ1001");
        Student s3 = new Student("Ibrahim", "Ahmadli","Male", "AZ1002");

        PhdStudent ph1 = new PhdStudent("Kamran", "Najafli", "Male", "AZ1000", "Science", "Computer Science");
        PhdStudent ph2 = new PhdStudent("Kamran", "Najafli", "Male", "AZ1000", "Science", "Computer Science");
        PhdStudent ph3 = new PhdStudent("Daris", "Hassanzadeh Abadi", "Male", "AZ1001", "Science", "Physics");

        System.out.println(p1.toString());
        System.out.println(t1.toString());
        System.out.println(s1.toString());
        System.out.println(ph1.toString());


        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));

        System.out.println(t1.equals(t2));
        System.out.println(t2.equals(t3));

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));


    }
}