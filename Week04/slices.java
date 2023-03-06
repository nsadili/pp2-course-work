

public class slices {
    public static void main(String[] args) {
     String s= "SITE"; 
     int c=0;
     for (int i=0; i<s.length(); i++){ 
       
        System.out.print(s.substring(0, c++));
        System.out.print(" ");
        System.out.print(s.substring(i));
        System.out.println();
     }
     
    }
   
}
