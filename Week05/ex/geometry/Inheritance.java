public class Inheritance {
    
public static void main(String[] args) {

    Person person1= new Person("Firangiz", "Bakirli", 'f');
    
    System.out.println(person1);
}
 static class Person{
private String firstName;
private String lastName;
private char gender;

public Person(String name, String surname, char gender){
    this.firstName=name;
    this.lastName=surname;
    this.gender=gender;
}
public String getName(){
return firstName;
}

public String getSurname(){
    return lastName;
}

public char getGender(){
    return gender;
}
public String toString(){
    return String.format("%s", gender);
}

public boolean equals(Person p) {
 return this.firstName==getName() && this.lastName==getSurname() && this.gender==getGender();
}

}
}
