package Week10;
public class Main {
   public static void main(String[] args){
int[] arrayInt= new int[] {79, 65,54,11};
double[] doubleNumbers= new double[]{11.4, 15.2, 16.7};
String[] studentsName = new String[]{"Ilaha"};
Point[] coordinates= new Point[]{};

printer(arrayInt);
printer(doubleNumbers);
printer(studentsName);
printer(coordinates);
   } 
   
public static <T> void printer (T[] array, int lowerbound, int upperbound){
    if(upperbound>= array.length)
    throw new IllegalArgumentException();
    for(T a: array){
        System.out.println(a);
    }
   }
}
