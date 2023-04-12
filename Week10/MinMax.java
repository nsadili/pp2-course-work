package Week10;

import java.util.function.BinaryOperator;

public class MinMax{
    
public static void main(String args[]){
BinaryOperator<Integer> findMax = (a, b) -> {
    int max = a > b ? a : b;
    return max;
};

BinaryOperator<Integer> findMin = (a, b) ->   {
    int min = a<b ? a: b;
    return min;
};

int max = findMax.apply(10, 20);
int min = findMin.apply(10, 20);

// Print the results
System.out.println("Max: " + max);
System.out.println("Min: " + min);
    }
}