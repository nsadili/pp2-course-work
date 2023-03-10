public class Stack {
    private int[] elements;
    private int capacity;
    private int index;

    public Stack(int capacity) {
        // TODO what is capacity is not a positive integer ?
        if(capacity<=0){
            throw new IllegalArgumentException(String.format("<%d> is neative number",capacity));
        }
        this.capacity = capacity;
        this.index = -1;
        this.elements = new int[capacity];
    }

    public boolean isEmpty() {
        return this.index == -1;
    }

    public boolean isFull() {
        return this.index == capacity - 1;
    }

    public int peek() {
        // TODO: what if the stack is empty? index == 1?
        if(index == -1){
            throw new StackFullEmptyException("Stack is Empty!");
        }

        return elements[index];
    }

    public int pop() {
        // TODO: what if the stack is empty? index == -1?
        if(index == -1){
            throw new StackFullEmptyException("Stack is Empty!");
        }

        return elements[index--];
    }

    public void push(int el) {
        // TODO: what if the stack is full? index == capacity-1?
        if(index == capacity -1){
            throw new StackFullEmptyException("Stack is Full");
        }

        elements[++index] = el;
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
        Stack stack = new Stack(5);


        //

    //   try {
        
    //   } catch (StackFullEmptyException e) {
    //     System.out.println(e.getMessage());
    //   }

      do{
       try{
        stack.pop();
       }catch(StackFullEmptyException e){
        System.out.println("Error");
       }
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(100);
       try {
        stack.push(200000);
       } catch (Exception e) {
       System.out.println("Error2");
       } 
        break;
      }while(true);

         System.out.println(stack.peek());

         stack.__print();

        // while (!stack.isEmpty()) {
        // System.out.println(stack.pop());
        // }


    }
}