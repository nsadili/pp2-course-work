import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Grades {

	public static void main(String[] args)
	{
           Map<String, Double> student_gpa = new HashMap<>();
           student_gpa = populate_students(student_gpa);
        //   System.out.println(student_gpa);
           
           Double max = 0.0; 
           
           for(String s : student_gpa.keySet())
           {
              if (student_gpa.get(s) > max ) {
                   max = student_gpa.get(s);
               }
           }
           
        //   System.out.println(max);
        
           System.out.println("Students with highest GPA are : ");
           Double sum = 0.0;
           for(String s : student_gpa.keySet()){
               sum +=student_gpa.get(s);
               if (student_gpa.get(s).equals( max) )
               {
                   System.out.println(s + " : " + student_gpa.get(s));
               }
           }
           System.out.println("Students with GPA below average are : ");
           Double ave = (sum / student_gpa.size());
           
           for(String s : student_gpa.keySet()){
               
               if (student_gpa.get(s) - ave < 0 )
               {
                   System.out.println(s + " : " + student_gpa.get(s));
               }
           }
           
    }
	public static  Map<String, Double> populate_students (Map<String, Double> hm){
	    Scanner scn = new Scanner(System.in);
	    int count = 0; 
	    while (count < 5)
	    {
	        String name = scn.next();
	        Double age  =  scn.nextDouble();
	       // Double ag2 = age;
	        hm.put(name, age);
	        count+=1;
	    }
	    
	    return hm;
	    
	}

}