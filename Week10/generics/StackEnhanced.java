package generics;

import java.util.LinkedList;
// Reminder:Make this a generic stack
public class StackEnhanced<T> {

    private LinkedList<T> stack;
    private int maxSize;

    public StackEnhanced(int maxSize) {
        stack = new LinkedList<>();
        this.maxSize = maxSize;
    }

    public void push(T value) throws Exception{

        if(stack.size() == maxSize){
            throw new Exception("Stackoverflow");
        }
        stack.push(value);
    }

    public T pop() throws Exception {
        if(stack.isEmpty()){
            throw new Exception("Empty stack");
        }
        return stack.pop();
    }

    public T peek() throws Exception{
    

        if(stack.isEmpty()){
            throw new Exception("Empty stack");
        } 
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        StackEnhanced<Integer> myStack = new StackEnhanced<>(3);

        try{
            myStack.push(10);
            myStack.push(20);
            myStack.push(30);
        }
       
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(myStack.size());

        try{
            System.out.println(myStack.peek());
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }
        while (!myStack.isEmpty()) {
            try{
                System.out.println(myStack.pop());
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}