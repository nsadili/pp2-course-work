package Week10;

import java.util.ArrayList;
import java.util.List;

public class StackEnhanced <T> {
    private int c;
    //c=capacity
    private List<T> l;

    public StackEnhanced(int c){
        if(c<=0){
            throw new IllegalArgumentException("Please avoid negative number!");

        }
        this.c=c;
        l= new ArrayList<T>();
    }
    public boolean isFull(){
        return l.size()== this.c;
    }
    public boolean isEmpty(){
        return l.isEmpty();

    }
    public T peek(){
        if(l.size()==0){
            throw new IllegalArgumentException("Stack is empty!");

        }
        return l.get(l.size()-1);
    }
    public T pop(){
        if(l.size()==0){
            throw new IllegalArgumentException("Stack is empty!");
        }
        return l.remove(l.size()-1);

    
    }
    public void push(T el){
        if(isFull()){
            throw new IllegalArgumentException("Stack is full!");
        }
        l.add(el);
    }
    public void printStack(){
        if(l.size()==0){
            throw new IllegalArgumentException("Stack is empty");
        }
        System.out.println("Start ");
        for(int i=0; i<l.size();i++){
            System.out.print(" "+ l.get(i));
        }
        System.out.println();
        System.out.println(" End");


}

    
}
