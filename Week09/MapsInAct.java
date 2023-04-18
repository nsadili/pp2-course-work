package Week09;
import java.util.*;
public class MapsInAct {
    public static void main(String[] args) {

        // HashMap
        Map<String, Integer> NameAndAge = new HashMap<>();

        NameAndAge.put("Ali", 19);
        NameAndAge.put("Sadig", 21);
        NameAndAge.put("Farid", 23);
        NameAndAge.put("Hasan", 25);

        System.out.println("HashMap: ");

        System.out.println("Enchanced for statement: ");
        for (String key : NameAndAge.keySet())
            System.out.println(  key + ", " + NameAndAge.get(key));

        System.out.println("Entry Enhanced for Statment: ");
        for (Map.Entry<String, Integer> entry : NameAndAge.entrySet()){
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }

        System.out.println("Keyset Iterator: ");

        Iterator<String> iterator = NameAndAge.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + ", " + NameAndAge.get(key));
        }

        System.out.println("toString() method: ");
        System.out.println(NameAndAge.toString());

        System.out.println();

        // LinkedHashMap
        Map<String, Integer> nameAndAgeLinkedHashMap = new LinkedHashMap<>(NameAndAge);

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
            System.out.println(key + ", " + nameAndAgeLinkedHashMap.get(key));
        }

        System.out.println("toString() method: ");
        System.out.println(nameAndAgeLinkedHashMap.toString());

        System.out.println();

        // TreeMap
        Map<String, Integer> nameAndAgeTreeMap = new TreeMap<>(NameAndAge);

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

