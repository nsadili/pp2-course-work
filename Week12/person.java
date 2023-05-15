package Week12;

import java.io.*;

public class person {
    public static void savePersons(person[] persons, String fileName) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(persons);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Successfully saved persons to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while saving persons to file: " + e.getMessage());
        }
    }

    public static void readPersons(String fileName) {
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            person[] persons = (person[]) objectInputStream.readObject();
            while (persons != null) {
                for (person person : persons) {
                    System.out.println(person.toString());
                }
                persons = (person[]) objectInputStream.readObject();
            }

            objectInputStream.close();
            fileInputStream.close();
        } catch (EOFException e) {
            System.out.println("End ");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(" error " + e.getMessage());
        }
    }
}
