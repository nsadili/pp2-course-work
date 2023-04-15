import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Iterator;



public class Task4 {
    private static HashMap<String,String> friendsMap= new HashMap<String,String>();
public static void main(String[]args){
   
    Scanner scan=new Scanner(System.in);
   

    friendsMap.put("Cavid","Nihat");
    friendsMap.put("Nihat","Cavid");

    friendsMap.put("Cavan","Resul");
    friendsMap.put("Resul","Cavan");

    friendsMap.put("Bayram","Kenan");
    friendsMap.put("Kenan","Bayram");

    
        
    System.out.print(friendsMap);

    addFriend();
    System.out.print(friendsMap);
    removeFriend();
    System.out.print(friendsMap);
}
public static void addFriend(){
    Scanner scan=new Scanner(System.in);
    String f1=scan.nextLine();
    String f2=scan.nextLine();

    friendsMap.put(f1,f2);
    friendsMap.put(f2,f1);    


}
public static void removeFriend(){
    Scanner scan=new Scanner(System.in);
    String f=scan.nextLine();
    friendsMap.remove(f);

    Iterator<Entry<String, String>> itr= friendsMap.entrySet().iterator();
        System.out.print(itr);
        
        while(itr.hasNext()) {
            Entry<String, String> entry = itr.next();
            String key = entry.getKey();
            String value = entry.getValue();
            
   if(value==f){
    friendsMap.remove(key);
   }
        }

    
   
    
}
}
