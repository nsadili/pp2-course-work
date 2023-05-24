import java.util.HashMap;

public class HashMapExample {
   public static void main(String[] args) {

      HashMapExample<String, Integer> hashMap = new HashMapExample<>();

      hashMap.put("Bulka", 25);
      hashMap.put("Yela", 30);
      hashMap.put("Bobik", 42);

      int bulkasAge = hashMap.get("Bulka");
      System.out.println("Bulka's age is " + bulkasAge);

      for (String name : hashMap.keySet()) {
         int age = hashMap.get(name);
         System.out.println(name + " is " + age + " years old.");
      }
   }
}

