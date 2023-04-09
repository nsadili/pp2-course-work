package Ex.ex4;

public class EvenIntegerProperty  implements SpecificProperty<Integer> {
    
public boolean check (Integer obj){

    return obj % 2 == 0;
    
}


}
