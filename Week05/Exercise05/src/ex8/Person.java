package ex8;

public class Person {
    private String firstName;
    private String lastName;
    private String gender;
    
    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + "]";
    }

    public boolean equals(Person p) {
        if (p.firstName == this.firstName && p.lastName == this.lastName && p.gender == this.gender)
            return true;

        return false;
    }
}
