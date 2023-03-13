public class Stack {
    private int[] elements;
    private int capacity;
    private int index;

    public Stack(int capacity)throws IllegalArgumentException 
    {
        if (capacity <= 0) 
        {
            throw new IllegalArgumentException("Capacity must be a positive integer.");
        }
        this.capacity = capacity;
        this.index = -1;
        this.elements = new int[capacity];
    }    

    public boolean isEmpty() 
    {
        return this.index == -1;
    }

    public boolean isFull() 
    {
        return this.index == capacity - 1;
    }

    public int peek()throws StackEmptyException 
    {
        if(this.isEmpty())
        {
            throw new StackEmptyException();
        }
        return elements[index];
    } 


    public int pop()throws StackEmptyException 
    {
        if(this.isFull())
        {
            throw new StackEmptyException();
        }

        return elements[index--];
    }

    public void push(int el)throws StackFullException 
    {
        if(this.isFull())
        {
            throw new StackFullException();
        }

        elements[++index] = el;
    }

    public void __print() 
    {
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

    public static void main(String[] args) 
    {
        Stack stack = new Stack(5);

        // stack.pop();

        try
        {
            stack.push(3);
            stack.push(5);
            stack.push(7);
            stack.push(10);
            stack.push(100);
        // stack.push(200000);          

        }
        catch(StackFullException e)
        {
            System.out.println(e.getMessage());
        }
        stack.__print();

        // while (!stack.isEmpty()) {
        // System.out.println(stack.pop());
        // }


    }
}