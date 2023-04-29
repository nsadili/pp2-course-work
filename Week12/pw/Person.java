import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable {
   private String name;
   private int age;
   
   public Person(String name, int age) {
      this.name = name;
      this.age = age;
   }
   
   public String getName() {
      return name;
   }
   
   public int getAge() {
      return age;
   }
}



public static void savePeople(Person[] people, String filename) throws IOException {
   ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename));
   outputStream.writeObject(people);
   outputStream.close();
}



public static void readPeople(String filename) throws IOException, ClassNotFoundException {
   ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename));
   Person[] people = (Person[]) inputStream.readObject();
   inputStream.close();
   
   for (Person person : people) {
      System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
   }
}

