package InheritanceEx8;

import java.util.Objects;

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

        public String toString() {
            return "Firstname: " + firstName + ", Lastname: " + lastName + ", Gender: " + gender; 
        }     

     public static boolean equals(Person p) {

        if(p == null) {
        return false;
        } 
        return Objects.equals(firstName, p.firstName) && 
        Objects.equals(lastName, p.lastName) && Objects.equals(gender, p.gender);
     }

     

}
