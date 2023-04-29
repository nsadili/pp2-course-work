package Week12;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public static void readPersonsFromFile(String filename) throws Exception {
   FileInputStream fis = new FileInputStream(filename);
   ObjectInputStream ois = new ObjectInputStream(fis);
   Person[] persons = (Person[])ois.readObject();
   ois.close();
   fis.close();
   for (Person p : persons) {
      System.out.println(p);
   }
}
