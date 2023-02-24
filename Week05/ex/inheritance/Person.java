package inheritance;

public class Person {
    private String firstName = "";
    private String lastName = "";
    private String gender = "";

    public Person (String firstName, String lastName, String gender){
        if (gender!="Male" && gender!="Female"){
            System.out.println("Please provide a valid gender!");
        }
        this.firstName=firstName;
        this.lastName=lastName;
        this.gender=gender;
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
        if (gender!="Male" && gender!="Female"){
            System.out.println("Please provide a valid gender!");
        }
        this.gender = gender;
    }

    public String toString (){
        return this.firstName + " " + this.lastName + "\nGender: " + this.gender;
    }

    public boolean equals (Person p){
        if ((p.getFirstName()==this.firstName) && (p.getLastName()==this.lastName) && (p.getGender()==this.gender)) return true;
        else return false;
    }
}

