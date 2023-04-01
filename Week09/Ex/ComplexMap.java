import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComplexMap {
    public static void main(String[] args) {
        Map<String, List<String>> friends= new HashMap<>();
        //System.out.println(friends.get("Nuraddin"));
        addAPairOfFriends(friends, "Nuraddin", "Shamil");
        addAPairOfFriends(friends, "Nuraddin", "Laman");
        addAPairOfFriends(friends, "Laman", "Vasila");
        removeAFriend(friends, "Nuraddin", "Shamil");

        System.out.println(removeAFriend(friends,"Nuraddin", "Shamil"));
        System.out.println(removeAFriend(friends,"Mahammad", "Shamil"));
        System.out.println(removeAFriend(friends,"Vasila", "Shamil"));

        

        for(String name : friends.keySet()){
         System.out.println(name+":"+ friends.get(name));
        }

    }

    static void addAPairOfFriends(Map<String, List<String>> friends, String f1, String f2){
      /*if(friends.containsKey(f1)){
         friends.get(f1).add(f2);
      } else{
         var list= new ArrayList<String>();
         list.add(f2);
         friends.put(f1, list);

      }
      if(friends.containsKey(f2)){
         friends.get(f2).add(f1);
      } else{
         var list= new ArrayList<String>();
         list.add(f1);
         friends.put(f2, list);

      }*/
      addToMap(friends, f1, f2);
      addToMap(friends, f2, f1);


    }
    static void addToMap(Map<String, List<String>> map, String key, String value){
    if(map.containsKey(key)){
      map.get(key).add(value);
   } else{
      var list= new ArrayList<String>();
      list.add(value);
       map.put(key, list);

   }
   }

   static boolean removeAFriend(Map<String, List<String>> friends, String f1, String f2){
      if(!friends.containsKey(f1)){
         return false;
      }
      if(!friends.get(f1).contains(f2)){
         return false;
      }
      friends.get(f1).remove(f2);
      friends.get(f2).remove(f1);
      return true;
   }
}
