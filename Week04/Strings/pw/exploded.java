package Strings.pw;
import java.util.Scanner;

public class exploded {
    
public static void main(String[] args){
    Scanner scan=new Scanner(System.in);

     String word=scan.nextLine();
    String ex=explode(word);

}

public static String explode(String e){
for(int j=0;j<e.length()+1;j++){
    for(int i=0;i< j;i++){
        System.out.print(e.charAt(i));
        

    }
}
    return e;

}

}
