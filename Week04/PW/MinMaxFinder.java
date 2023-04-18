package Week04.PW;
import java.util.Scanner;

public class MinMaxFinder {

    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your numbers separated by spaces: ");
    String input = scanner.nextLine();
    String[] numberStrings = input.split(" ");
    int[] numbers = new int[numberStrings.length];
    for (int i = 0; i < numberStrings.length; i++) {
      numbers[i] = Integer.parseInt(numberStrings[i]);
    }
    //printArray(numbers);
    int a = Min(numbers);
    int b = Max(numbers);

    //double average = (double) sum / numbers.length;
    System.out.println("Min: " + a);
    System.out.println("Max: " + b);
    scanner.close();
  }

  static public int Min(int[] numbers){
    int a = 999999999;
    int b = -999999999;
    
    for (int i = 0; i < numbers.length; i++) {
        if(numbers[i]>=b) b = numbers[i]; 
        if(numbers[i]<=a) a = numbers[i]; 
        //return a;
    }
        return a;}
       
      
    
    static public int Max(int[] numbers){
    int a = 999999999;
    int b = -999999999;
    
    for (int i = 0; i < numbers.length; i++) {
        if(numbers[i]>=b) b = numbers[i]; 
        if(numbers[i]<=a) a = numbers[i]; 
        //return a;
    }
        return b;
       
      }  
    
    }


  




    

