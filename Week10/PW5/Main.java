package PW5;

import java.util.EmptyStackException;

public class Main {
    public static void main(String[] args) {
    
        StackEnhanced<Integer> integerStack = new StackEnhanced<>(10);
        StackEnhanced<String> stringStack = new StackEnhanced<>(5);
        
        try {
            integerStack.push(1);
            integerStack.push(2);
            integerStack.push(3);
            System.out.println(integerStack.pop());  
            System.out.println(integerStack.peek()); 
            
            stringStack.push("hello");
            stringStack.push("world");
            stringStack.push("world");
            stringStack.push("world");
            stringStack.push("world");
            System.out.println(stringStack.pop());  
            System.out.println(stringStack.peek()); 
            
        } catch (EmptyStackException e){
            System.out.println("Cannot access element because stack is empty");
        } catch (Exception e){
            System.out.println("Cannot add element because stack is full");
        }
    }

}
