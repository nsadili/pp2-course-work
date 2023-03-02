public class Person {
    private final String firstName;
    private final String lastName;
    private final String gender;
    
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
    
    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + gender + ")";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        Person p = (Person) obj;
        return firstName.equals(p.getFirstName()) &&
               lastName.equals(p.getLastName()) &&
               gender.equals(p.getGender());
    }
}
