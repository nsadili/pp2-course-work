import java.util.Scanner;

public class maxmin {
   
    public static void main(String[] args){

Scanner scan=new Scanner(System.in);
int max=-999999999;
int min=999999999;
scan.hasNextInt();  

while (scan.hasNextInt()) {

    if(scan.nextInt()>max){
        max=scan.nextInt();
        
    }
    
    
}


System.out.println("max: " +max);    


System.out.println("min: " +min);
}
}