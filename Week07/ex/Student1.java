public class Student1 {
    public static void main(String[] args) {
        
        try {
            createStudent(16882, "Laman", "P");
        } catch(StudentNameException s) {
            System.out.println("Exception catched!");
            System.out.println(s.getMessage());
        }
    }

    public static void createStudent(int id, String name, String surname)
    throws StudentNameException {
        if (name == null || name.length() < 2)
        throw new StudentNameException("The student name cannot be accessed as it has less than 2 symbols!");

        if (surname == null || surname.length() < 2)
        throw new StudentNameException("The student surname cannot be accessed as it has less than 2 symbols!");

        System.out.println("Successful Completion!");
    }

}
