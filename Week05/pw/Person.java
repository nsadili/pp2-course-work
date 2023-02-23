public class Person {
    
    static String firstName;
    static String lastName;
    static String gender;

    public Person (String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
            this.lastName = lastName;
        }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
            this.gender = gender;
        }

     // to string
     
     public static boolean equals(Person p) {

        if(p.firstName == firstName && p.lastName == lastName && p.gender == gender)

        return true;
        else 
        return false;

     }

     class Teacher extends Person {
        public int x;
        public static void main(String[] args) {
            Teacher test = new Teacher();
            
        }
     }

}
