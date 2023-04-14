package WEEK5.ex8;

public class Main {
    public static void main(String[] args){
        Teacher tc=new Teacher(null, null, null, null, null);
        Student std=new Student(null, null, null, null);
        PhdStudent phd=new PhdStudent(null, null, null, null, null, null);
        
        tc.setFirstName("Gulcohrez");
        tc.setGender("Female");
        tc.setLastName("Orujova");
        tc.setCourses("IT");
        tc.setDepartment("Comp Science");

        System.out.println("The teacher of "+tc.getCourses()+" in "+tc.getDepartment()+" department: "+tc.getFirstName()+" "+tc.getLastName()+" gender: "+tc.getGender());

        std.setFirstName("Ali");
        std.setGender("Male");
        std.setLastName("Aliyev");
        std.setStudentId("12938");
        
        System.out.println("The "+std.getGender()+ " student: " +std.getFirstName()+" "+std.getLastName());
        
        phd.setFirstName("Naila");
        phd.setLastName("Shukurova");
        phd.setCourses("Fundamentals of Busines");
        phd.setDepartment("Public Affairs");
        phd.setGender("Female");
        phd.setStudentId("839223");

        System.out.println("The "+phd.getGender()+" Phd Student of "+phd.getDepartment()+" on a "+phd.getCourses()+": "+phd.getFirstName()+" "+phd.getLastName()+" StudentID: "+phd.getStudentId());

    }
}
