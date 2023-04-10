import java.util.ArrayList;
import java.util.List;

public class StackEnhanced <T> {
    private List<T> list;
    private int capacity;
    

  

    public StackEnhanced(int capacity) {
        
        if (capacity <= 0) {
            throw new IllegalArgumentException(String.format("<%d> is neative number", capacity));
        }
        this.capacity = capacity;
        list = new ArrayList<T>();

    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean isFull() {
        return list.size() == this.capacity;
    }

    public T peek() {
        
        if (list.size() == 0) {
            throw new StackFullEmptyException("Stack is Empty!");
        }

        return list.get(list.size()-1);
    }

    public T pop() {
                if (list.size() == 0) {
            throw new StackFullEmptyException("Stack is Empty!");
        }
      
       return list.remove(list.size() - 1) ;
    }

    public void push(T el) {
        
        if (list.size() == capacity ) {
            throw new StackFullEmptyException("Stack is Full");
        }
        list.add(el);
    }

   

    public void __print() {
        if (this.isEmpty()) {
            System.out.println("Empty stack.");
            return;
        }
        System.out.print("Bottom");
        for (int i = 0; i <list.size(); i++) {
            System.out.print(" || " + list.get(i));
        }
        System.out.println(" || Top");
    }

    public static void main(String[] args) {
        StackEnhanced<Integer> stack = new StackEnhanced<>(29);
        System.out.println(stack.isEmpty());

        stack.push(9);
        System.out.println(stack.isEmpty());

        stack.push(17);
        stack.push(19);
      
        stack.__print();
        System.out.println(stack.peek());
        stack.push(40);

        System.out.println(stack.pop());
        
        System.out.println(stack.pop());
       
        stack.push(12);
        System.out.println(stack.pop());
        stack.pop();
        stack.__print();
        


         System.out.println(stack.pop());

        


        stack.__print();

       
}
}
