package Week09;
import java.util.HashMap;
import javax.sound.sampled.SourceDataLine;

public class Grade {
  public static void main() {
    HashMap<String, Float> grade = new HashMap<>();//should be wrapper class

       grade.put("Ilaha Jamalli", 2.8f);
       grade.put("Nihat Ahmadli", 4.0f);
       grade.put("Inji Sadigli", 1.79f);
  
  
       for(String a: grade.keySet()){
        System.out.println(grade.get(a));
        float g=0;
       }
        
        for(String a: grade.keySet()){

         if(grade.get(a)>g);
        g= grade.get(a); 
     
        }
      for(String a: grade.keySet()){
     sumOfGpa+=grade.get(a);
}
for(String a: grade.keySet()){
  
  if(grade.get(a)<agerage)
  System.out.println(a);
}
        


    //    float max=0;
  
    //    if(grade.get(a).compareTo(max)<0);
    //    max= grade.get(a);

    //    float s=0;
    //   
    // s+=grade.get(a);

  } 
//  System.out.println(s/grade) ;


//  float avarage= s/grade.size();
//   int numberOfStudent=0;

  

}
