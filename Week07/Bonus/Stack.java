package Bonus;

public class Stack {
    private int[] elements;
    private int capacity;
    private int index;

    public Stack(int capacity) throws CannotProcess{
        // TODO what is capacity is not a positive integer ?
        if(capacity>0){
        this.capacity = capacity;
        this.index = -1;
        this.elements = new int[capacity];}
        else{
            throw new CannotProcess("Not Positive");
        }
    }

    public boolean isEmpty() {
        return this.index == -1;
    }

    public boolean isFull() {
        return this.index == capacity - 1;
    }

    public int peek() throws CannotProcess{
        // TODO: what if the stack is empty? index == -1?
        if(index != -1){
        return elements[index];
        }else{
            throw new CannotProcess("Stack is empty");
        }
    }

    public int pop() throws CannotProcess{
        // TODO: what if the stack is empty? index == -1?
        
        if(index != -1){
            return elements[index--];
            }else{
                throw new CannotProcess("Stack is empty");
            }
    }

    public void push(int el)  throws CannotProcess{
        // TODO: what if the stack is full? index == capacity-1?
        if(index != capacity-1){
        elements[++index] = el;
        }else{
            throw new CannotProcess("");
        }
    }

    public void __print() {
        if (this.isEmpty()) {
            System.out.println("Empty stack.");
            return;
        }
        System.out.print("Bottom");
        for (int i = 0; i <= index; i++) {
            System.out.print(" || " + elements[i]);
        }
        System.out.println(" || Top");
    }

    public static void main(String[] args) {
        try{
        Stack stack = new Stack(5);
        // stack.pop();

        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(100);
        stack.push(200000); //exception thrown here

        stack.__print();
        //stack.peek();
        while (!stack.isEmpty()) {
        System.out.println(stack.pop());
         }
        }catch(Exception err){
            System.out.println(err);
        }

        


    }
}

class CannotProcess extends Exception {

    public CannotProcess(String message) {
        super(message);
    }
}