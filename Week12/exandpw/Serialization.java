import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
    int id;
    String fname;
    String lname;

    public Person(int id, String fname, String lname) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String toString() {
        return "Person[id = " + id + ", fname = " + fname + ", lname = " + lname + "]";
    }
}

public class Serialization{
    public static void main(String[] args) {
        String fileName = "persons.dat";
        Person[] people = new Person[] { new Person(1, "Ali", "Aliyev"), new Person(2, "Muhammed", "Faud"),
                new Person(3, "Samir", "Musayev") };

    writeData(people, fileName);
    readData(fileName);

    }
    
    static void writeData(Person[] people, String fileName){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
            oos.writeObject(people);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
   
    static void readData(String fileName){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
            Object obj;
            while((obj = ois.readObject()) != null){
                if(obj instanceof Person){
                    Person person = (Person) obj;
                    System.out.println(person.toString());
                }
            } 
        }catch (EOFException e) {
                System.out.println("The file is at its end.");
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }        
    
    }
}

