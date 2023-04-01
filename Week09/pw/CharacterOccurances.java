package pw;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.NavigableMap;
import java.util.Scanner;

public class CharacterOccurances {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str= scan.nextLine().toUpperCase();
   // String str = args[0].toLowerCase();
     Map<Character,ArrayList<Integer>> charArray=new TreeMap<>(new Comparator<Character>() {

        @Override
        public int compare(Character o1, Character o2) {
           return o2-o1;
        }
        
     });
     
for(int i=0;i<str.length();i++){
char c =str.charAt(i);
if(!(charArray.containsKey(c))){
ArrayList<Integer> list= new ArrayList<>();
list.add(i);
charArray.put(c, list);
}
else{
    charArray.get(c).add(i);
}
}
for(var a:charArray.keySet() ){
    System.out.println(a+"-->" +charArray.get(a));
}

    }
}
