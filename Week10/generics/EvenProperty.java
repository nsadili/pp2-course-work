package Week10.generics;


public class EvenProperty implements Property<Integer> {
    
    public boolean test(Integer obj){
        return obj % 2 == 0;
    }
  
}
