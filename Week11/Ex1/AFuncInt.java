/* 1. [EX] Practice functional interfaces
a. Create a functional interface AFuncInt with three methods:
i. An abstract apply() method which takes one input parameter of type String and
returns nothing.
ii. a static method print() which takes one input parameter of type String and prints it.
iii. a default method print() which takes two input parameters of type String and prints
both.
b. In the main method of the Main class,
i. Create an instance of type AFuncInt. (Anonymous classes)
ii. Call the three methods of the instance and test if you have expected output.
iii. Create another instance using lambda expressions.
iv. Call the three methods of the second instance and test if you have expected
output.
c. Note: Study Optional class. You may need to use them in the following problems. */

package Week11.Ex1;

public interface AFuncInt {

    void apply (String str);

    static void print (String str){
        System.out.println("Static: "+str);
    }

    default void print (String str1, String str2){
        System.out.println("Default: "+str1+" "+str2);
    }
    
}
