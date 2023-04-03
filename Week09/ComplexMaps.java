import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class ComplexMaps
{
    public static void main(String[] args)
    {
        Map<String,List<String>> friends = new HashMap<>();
        // insertion order - LinkedHashMap
        // ascending order of first names - TreeMap

        addFriend(friends, "Sara", "Ilaha");
        addFriend(friends, "Sara", "Ibrahim");
        addFriend(friends, "Susan", "Efsane");
        addFriend(friends, "Susan", "Ayatay");
        addFriend(friends, "Vasila", "Rahima");
        removeFriend(friends, "Vasila", "Rahima");


        for(var entry : friends.entrySet())
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }

    static void addFriend(Map<String, List<String>> friends,
    String friend1, String friend2)
    {
        addToMap(friends, friend1, friend2);
        addToMap(friends, friend2, friend1);
    }

    static void removeFriend(Map<String, List<String>> friends,
    String friend1, String friend2)
    {
        removeFromList(friends, friend1, friend2);
        removeFromList(friends, friend2, friend1);
    }

        

    static void addToMap(Map<String, List<String>> map,
    String key, String value)
    {
        if(map.containsKey(key))
        {
            map.get(key).add(value);
        }
        else
        {
            List<String> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }

      static void removeFromList(Map<String, List<String>> map,
      String key, String value)
    {
        if(map.containsKey(key))
        {
            map.get(key).remove(value);
        }
        else
        {
            List<String> list = new ArrayList<>();
            list.remove(value);
            map.put(key, list);
        }

    }
}