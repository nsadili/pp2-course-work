package inheritance;

public class InheritanceTester {
    public static void main(String[] args) {
        Person p1 = new Person("Rufat", "Hajizada", "Male");
        Person p2 = new Person("Shamil", "Abbasov", "Male");
        Person p3 = new Person("Rufat", "Hajizada", "Male");

        System.out.println("p1 (toString function): \n"+p1.toString()+"\n");
        System.out.println("p2 (toString function): \n"+p2.toString()+"\n");
        System.out.println("p3 (toString function): \n"+p3.toString()+"\n");

        System.out.println("p1 is equal to p2: "+ p1.equals(p2)+"\n");
        System.out.println("p1 is equal to p3: "+ p1.equals(p3)+"\n");
        System.out.println();

        // _______________________________________________________________

        Teacher t1 = new Teacher("Araz", "Yusubov", "Male", "SITE", 2);
        Teacher t2 = new Teacher("Tamilla", "Mammadova", "Female", "Writing", 5);
        Teacher t3 = new Teacher("Araz", "Yusubov", "Male", "SITE", 2);

        System.out.println("t1 (toString function): \n"+t1.toString()+"\n");
        System.out.println("t2 (toString function): \n"+t2.toString()+"\n");
        System.out.println("t3 (toString function): \n"+t3.toString()+"\n");

        System.out.println("t1 is equal to t2: "+ t1.equals(t2));
        System.out.println("t1 is equal to t3: "+ t1.equals(t3));
        System.out.println();

        // _______________________________________________________________

        Student s1 = new Student("Mahammad", "Mammadzada", "Male", "16240");
        Student s2 = new Student("Arzum", "Abdullazada", "Male", "16248");
        Student s3 = new Student("Mahammad", "Mammadzada", "Male", "16240");

        System.out.println("s1 (toString function): \n"+s1.toString()+"\n");
        System.out.println("s2 (toString function): \n"+s2.toString()+"\n");
        System.out.println("s3 (toString function): \n"+s3.toString()+"\n");

        System.out.println("s1 is equal to s2: "+ s1.equals(s2)+"\n");
        System.out.println("s1 is equal to s3: "+ s1.equals(s3)+"\n");
        System.out.println();

        // _______________________________________________________________

        PhdStudent phds1 = new PhdStudent("Nariman", "Mammadov", "Male", "16234", "SITE", 4);
        PhdStudent phds2 = new PhdStudent("Yusif", "Hajiyev", "Male", "16236", "SITE", 4);
        PhdStudent phds3 = new PhdStudent("Nariman", "Mammadov", "Male", "16234", "SITE", 4);

        System.out.println("phds1 (toString function): \n"+phds1.toString()+"\n");
        System.out.println("phds2 (toString function): \n"+phds2.toString()+"\n");
        System.out.println("phds3 (toString function): \n"+phds3.toString()+"\n");

        System.out.println("phds1 is equal to phds2: "+ phds1.equals(phds2)+"\n");
        System.out.println("phds1 is equal to phds3: "+ phds1.equals(phds3)+"\n");
        System.out.println();
    }
}
