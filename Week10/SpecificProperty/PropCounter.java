package Week10.SpecificProperty;
import java.util.Collection;

public class PropCounter{

    static <T> int count(Collection<T> arr, PropertyTester<T> prop) {
        int cnt=0;
        
        for (T el: arr){
            if (prop.test(el)){
                cnt++;
                System.out.print(el+" ");
            }
        }
        System.out.println();

        return cnt;
    }

}
