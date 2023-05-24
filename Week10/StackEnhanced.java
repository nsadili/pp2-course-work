public class StackEnhanced {
    private T[] elements;
    private int capacity;
    private int index;

    public StackEnhanced(int capacity,T[] elements, int index) {
        // TODO what is capacity is not a positive integer ?
        if(capacity<0)
        throw new IllegalArgumentException();
        this.capacity = capacity;
        this.index = -1;
        this.elements = new int[capacity];
    }

    public <T> boolean isEmpty() {
        return this.index == -1;
    }

    public <T>boolean isFull() {
        return this.index == capacity - 1;
    }

    public T peek() {
        // TODO: what if the stack is empty? index == 1?
           if(index==1){ throw new StackOverflowException();}
        return elements[index];
    }

    public T pop() {
        // TODO: what if the stack is empty? index == -1?
          if(index==-1){ throw new StackOverflowException();}
        return elements[index--];
    }

    public void push(T el) {
        // TODO: what if the stack is full? index == capacity-1?

        if(el==capacity-1){ throw new StackOverflowException();}
        elements[++index] = el;
    }

    public <T> void __print() {
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
        StackEnhanced<Integer> stack = new StackEnhanced<>(5);

        // stack.pop();
     try{
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(100);
        // stack.push(200000);

        stack.__print();

        // while (!stack.isEmpty()) {
        // System.out.println(stack.pop());
        // }
     }

     catch(StackOverflowException e){

     }


    }
}
