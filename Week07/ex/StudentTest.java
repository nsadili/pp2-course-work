public class StudentTest {
    public static void main(String[] args) {

       // Student st = new Student(16882, "Laman", "Panakhova");
       Student st = new Student(0, null, null);

        try {
            st.setName("Laman");
            System.out.println(st.getName());
            st.setSurname("Panakhova");
            System.out.println(st.getSurname());
            st.setId(16882);
            System.out.println(st.getId());
          //  st.setName(null);
            st.setName("");
        } catch(StudentNameException sne) {
            System.out.println(sne.getMessage());
        } finally {
            System.out.println("Successful Completion!");
        }
    }
}
