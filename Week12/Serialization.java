
    import java.io.FileOutputStream;
    import java.io.IOException;
    import java.io.ObjectOutputStream;
    
    public class Serialization {
        public static void savePersonsToFile(Person[] persons, String filePath) {
            try (FileOutputStream fileOutputStream = new FileOutputStream(filePath);
                 ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
                objectOutputStream.writeObject(persons);
                System.out.println("Persons saved to file successfully.");
            } catch (IOException e) {
                System.out.println("An error occurred while saving the persons to file.");
                e.printStackTrace();
            }
        }
    }
    

