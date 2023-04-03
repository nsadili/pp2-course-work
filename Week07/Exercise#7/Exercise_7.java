import java.util.Scanner;

public class Exercise_7 {
    private int[] data;
    private int top;
    private int capacity;

    public Exercise_7(int capacity) {
        //Initialization of values and criteria, which will be used in the future. The top, which will be remove 1, accroding
        //to the example with plates in the Wikipedia. Capacity - the amount of integers, user will be able to add
        this.data = new int[capacity];
        this.top = -1;
        this.capacity = capacity;
    }

    public void push(int value) {
        if (isFull()) {
            //Adding of our exception! The message will be shown if user will try to add more than required elements
            throw new IllegalStateException("Stack is full. Cannot push new element.");
        }
        //the method, which will help to remove and then add new element to the stack 
        top++;
        data[top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            //The same method with 16th line, but not if the stack is full. antonimously, when it's empty
            throw new IllegalStateException("Stack is empty. Cannot pop element.");
        }
        // Antonimous process, accroding to the line number 22
        int value = data[top];
        top--;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            //Repeating the exception for peek
            throw new IllegalStateException("Stack is empty. Cannot peek element.");
        }
        return data[top];
    }

    public boolean isEmpty() {
        //Looking for index -1, to identify whether the stack is empty or not
        return top == -1;
    }

    public boolean isFull() {
        //Looking for index -1, to identifiy whether the stack is full or not
        return top == capacity - 1;
    }

    public static void main(String[] args) {
        //The capacity of our stack will be 4
        Exercise_7 stack = new Exercise_7(4);
        Scanner scanner = new Scanner(System.in);
        
        //We can add "Exit" to the user, so he/she will end the process of adding
        while (true) {
            System.out.print("Enter a value to push onto the stack (or 'exit' to quit): ");
            String input = scanner.nextLine();
            
            if (input.equals("exit")) {
                break;
            } else {
                try {
                    int value = Integer.parseInt(input);
                    stack.push(value);
                    System.out.println("Pushed " + value + " onto the stack.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter an integer.");
                } catch (IllegalStateException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        
        System.out.println("Popping all values off the stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

//You will not get an output without writing "exit". Dear, instuctor, please, write "exit", after getting message that the stack is full!
//Empty commit. Purpose - change the name of the commitment from Codes(week 07) to Codes(week07).