import java.util.ArrayList;
import java.util.List;

public class SpecificElement {

    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>(List.of(1, 2, 3, 4,5,6,7,8,12,11));
        System.out.println(count(listInt));
        
        List<String> listString = new ArrayList<>(List.of("radar", "ana" , "shamil", "Rufet", "ata", "racecar" ));
        System.out.println(count(listString));

        List<Account> listAccount = new ArrayList<>(List.of(new Account("null", "null", 0.0), new Account("null", "null", 0.0),new Account("null", "null", 10.0)));
        System.out.println(count(listAccount));


    }

    static <T> int count(List<T> list){
            var count=0;
        if(list.get(0) instanceof Integer) {

            for(var i=0;i<list.size();i++){

               Integer value= (Integer) list.get(i);
               if(value % 2 ==0) count++;
            }
           
        }

        if(list.get(0) instanceof String){
            for(var i=0;i<list.size();i++){

                String value= (String) list.get(i);
                if(palindromeString(value)) count++;
             }

        }

        if(list.get(0) instanceof Account){
            for(var i=0;i<list.size();i++){

                Account value= (Account) list.get(i);
                if(value.balance == 0) count++;
             }

        }



        return count;
    }

    static boolean palindromeString(String s){
        var arr=s.toLowerCase().toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]!=arr[j]) {
               // System.out.println("No polindrome");
                return false;
            }
            i++;
            j--;
        }

        //System.out.println("Polindrome");
        return true;
    }

}
