public class Person {
    String firstName,lastName,gender;

    public Person(String firstName, String lastName, String gender) {
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
    
    public String toString(){
        return "Full name: "+ firstName+" Gender: "+gender; 
    }
    public boolean equals(Person p){
        if(p.lastName==this.lastName && p.firstName==this.firstName && p.gender==this.gender) return true;
        else return false;
    }
}
