package Week10;
import java.util.ArrayList;
import java.util.List;
public class StackEnhanced <T> {
    private int storage;

    private List<T> copy;

    public StackEnhanced(int storage){
        if(storage <=0){
            throw new IllegalArgumentException("Do not use neagtive number");
        }
        this.storage = storage;
        copy = new ArrayList<T>();
    }
    public boolean isFull(){
        return copy.size()== this.storage;
    }
    public boolean isEmpty(){
        return copy.isEmpty();

    }
    public T peek(){
        if(copy.size()==0){
            throw new IllegalArgumentException("Stack is empty!");

        }
        return copy.get(copy.size()-1);
    }
    public T pop(){
        if(copy.size()==0){
            throw new IllegalArgumentException("Stack is empty!");
        }
        return copy.remove(copy.size()-1);


    }
    public void push(T el){
        if(isFull()){
            throw new IllegalArgumentException("Stack is full!");
        }
        copy.add(el);
    }
    public void printStack(){
        if(copy.size()==0){
            throw new IllegalArgumentException("Stack is empty");
        }
        System.out.println("Start ");
        for(int i = 0; i< copy.size(); i++){
            System.out.print(" "+ copy.get(i));
        }
        System.out.println();
        System.out.println(" End");


    }
}
