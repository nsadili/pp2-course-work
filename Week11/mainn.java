import java.util.*;
import java.util.stream.*;

class main
{
    public static void main (String args[])
{
    List <Integer> number = Arrays.asList( 2, 3, 4, 5);
    List <Integer> square = number.stream() .map(x -> x*x).
    collect (Collectors.toList());
System.out.println(square);
}}