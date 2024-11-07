public class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;

    // Constructor to initialize stack
    public Stack(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1; // Stack is initially empty
    }

    // Push an element onto the stack
    public void push(char c) {
        if (top < maxSize - 1) {
            stackArray[++top] = c;
        }
    }

    // Pop an element from the stack
    public char pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        }
        return '\0'; // Return null character if stack is empty
    }

    // Peek the top element of the stack
    public char peek() {
        if (!isEmpty()) {
            return stackArray[top];
        }
        return '\0'; // Return null character if stack is empty
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
}
