package Week09;

import java.util.*;

public class Ex3 {
    public static void main(String[] args) {

        // HashMap
        Map<String, Integer> nameAndAge = new HashMap<>();

        nameAndAge.put("Gulanr", 17);
        nameAndAge.put("Leyla", 17);
        nameAndAge.put("Ulkar", 17);
        nameAndAge.put("Behruz", 20);

        System.out.println("HashMap: ");

        System.out.println("Enchanced for statement: ");
        for (String key : nameAndAge.keySet())
            System.out.println("{" + key + ", " + nameAndAge.get(key) + "}");

        System.out.println("Entry Enhanced for Statment: ");
        for (Map.Entry<String, Integer> entry : nameAndAge.entrySet()){
            System.out.println("{" + entry.getKey() + ", " + entry.getValue() + "}");
        }

        System.out.println("Keyset Iterator: ");

        Iterator<String> iterator = nameAndAge.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println("{" + key + ", " + nameAndAge.get(key) + "}");
        }

        System.out.println("toString() method: ");
        System.out.println(nameAndAge.toString());

        System.out.println();

        // LinkedHashMap
        Map<String, Integer> nameAndAgeLinkedHashMap = new LinkedHashMap<>(nameAndAge);

        System.out.println("LinkedHashMap: ");

        System.out.println("Enchanced for statement: ");
        for (String key : nameAndAgeLinkedHashMap.keySet())
            System.out.println("{" + key + ", " + nameAndAgeLinkedHashMap.get(key) + "}");


        System.out.println("Entry Enhanced for Statment: ");
        for (Map.Entry<String, Integer> entry : nameAndAgeLinkedHashMap.entrySet()){
            System.out.println("{" + entry.getKey() + ", " + entry.getValue() + "}");
        }

        System.out.println("Keyset Iterator: ");

        Iterator<String> iterator2 = nameAndAgeLinkedHashMap.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println("{" + key + ", " + nameAndAgeLinkedHashMap.get(key) + "}");
        }

        System.out.println("toString() method: ");
        System.out.println(nameAndAgeLinkedHashMap.toString());

        System.out.println();

        // TreeMap
        Map<String, Integer> nameAndAgeTreeMap = new TreeMap<>(nameAndAge);

        System.out.println("nameAndAgeTreeMap: ");

        System.out.println("Enchanced for statement: ");
        for (String key : nameAndAgeTreeMap.keySet())
            System.out.println("{" + key + ", " + nameAndAgeTreeMap.get(key) + "}");


        System.out.println("Entry Enhanced for Statment: ");
        for (Map.Entry<String, Integer> entry : nameAndAgeTreeMap.entrySet()){
            System.out.println("{" + entry.getKey() + ", " + entry.getValue() + "}");
        }

        System.out.println("Keyset Iterator: ");

        Iterator<String> iterator3 = nameAndAgeTreeMap.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println("{" + key + ", " + nameAndAgeTreeMap.get(key) + "}");
        }

        System.out.println("toString() method: ");
        System.out.println(nameAndAgeTreeMap.toString());

        Map<String, Integer> nameAndAgeTreeMapSorted = new TreeMap<>(Comparator.reverseOrder());
        nameAndAgeTreeMapSorted.putAll(nameAndAgeTreeMap);
        System.out.println("TreeMap in non-ascending order: ");
        System.out.println(nameAndAgeTreeMapSorted.toString());
    }
}