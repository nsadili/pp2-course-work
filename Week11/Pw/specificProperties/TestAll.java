package specificProperties;

import java.util.Arrays;
import java.util.List;

public class TestAll {
    public static void main(String[] args) {
     List<Integer> nums= Arrays.asList(1,2,3,4,5,6,7,8,9);
     SpecificProperty<Integer> oddInteger = n-> n%2!=0;
     System.out.println("The number of odd integers is: "+ Util.count(nums, oddInteger)+",and numbers itself: "+ Util.filter(nums, oddInteger));

     List<Point> points= Arrays.asList(new Point(4, 4),new Point(-4, 8),new Point(3, 3),new Point(-3, -7));
     SpecificProperty<Point> firstQuadrant= p -> p.getX()>0 && p.getY()>0;
     System.out.println("The number of points in the first quadrant: "+ Util.count(points, firstQuadrant)+", and their coordinates: "+ Util.filter(points, firstQuadrant));
   
     List<Person> people= Arrays.asList(
        new Person("Ibrahim", "Huseynov", 18),
        new Person("Togrul", "Asgarov", 32),
        new Person("Farida", "Bagirova", 50)

     );
     SpecificProperty<Person> checkAge=  x->x.getAge()>20;
     System.out.println("The number of people whose age more than 20: " + Util.count(people, checkAge)+ ", and their data: "+ Util.filter(people, checkAge));
     
     List<String> words= Arrays.asList("Ibrahim", "My name is Ibrahim Huseynov","The quick brown fox jumps over a lazy dog.");

     SpecificProperty<String> panagram = s -> {
        s=s.toLowerCase();
        var a= s.toCharArray(); 
        int [] arr= new int[26];

        for(var i=0; i<arr.length;i++){
            arr[i]=0;
        }
        for(int j=0; j<a.length;j++){
            var i= a[j]- 97;
            if(i<0|| i>26){
                continue;
            }
            if(arr[i]==0){
                arr[i]=1;
            }


        }
       for(int k=0 ;k<arr.length;k++){
        if(arr[k]==0){
            return false;
        }
       }
       return true;

     };
     System.out.println("The number of panagram strings: "+ Util.count(words, panagram)+ " and this string is: "+Util.filter(words, panagram));

        
    }
   
    
}
