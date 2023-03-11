public class Student {
    int id;
    String name;
    String surname;

    public Student(int i, String string, String string2) {

        public int getId() {
            return id;
        }
    
        public String getName() {
            return name;
        }
    
        public String getSurname() {
            return surname;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public void setName(String name) throws StudentNameException{
            if (name == null || name.length() < 2)
            throw new StudentNameException("The student name cannot be accessed as it has less than 2 symbols!");
            this.name = name;
        }
    
        public void setSurname(String surname) throws StudentNameException{
            if (surname == null || surname.length() < 2)
            throw new StudentNameException("The student surname cannot be accessed as it has less than 2 symbols!");
            this.surname = surname;
        }
    }


    public static void main(String[] args) {

        Student st = new Student(16882, "Laman", "Panakhova");
        
        try { 
            
           System.out.println(st.id, st.name, st.surname);

        } catch(StudentNameException s) {
            System.out.println(s.getMessage());
            System.out.println("Resolve the Strings!");

        }

    }

}

