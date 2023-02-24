package Week05.inheritance;

public class Person {
    private String firstName;
    private String lastName;
    private String gender;

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + "]";
    }


    public boolean equals(Person p) {
        return this.firstName.equals(p.getFirstName()) &&
                this.lastName.equals(p.getLastName()) &&
                this.gender.equals(p.getGender());
    }
}
