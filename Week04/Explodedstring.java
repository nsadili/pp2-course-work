import java.util.Scanner;

public class Explodedstring {
   public static void main (String[] args) {
  Scanner scan=new Scanner(System.in);  
     String str =scan.nextLine();
     String[] split =str.split(" ");
     StringBuilder k= new StringBuilder();
     StringBuilder res= new StringBuilder();
     for( int i=0; i<split.length;i++){
      k.append(split[i]);
      res.append(k);
  
    }
    System.out.println(res);
     }
  }
