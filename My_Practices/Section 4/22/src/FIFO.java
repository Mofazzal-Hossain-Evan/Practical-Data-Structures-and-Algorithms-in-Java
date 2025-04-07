import java.util.LinkedList;
import java.util.Queue;

public class FIFO {
    public static void main(String[] args) {
        // Creating a Queue using LinkedList implementation
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add("first");  // "first" is added to the queue
        queue.add("second"); // "second" is added to the queue after "first"

        // Peek the element at the front of the queue (without removing it)
        // This will return "first" because it's the first element added
        System.out.println(queue.peek()); // Output: first

        // Remove and return the element at the front of the queue
        // This will remove "first" from the queue
        System.out.println(queue.poll()); // Output: first

        // Check if the queue is empty
        // After removing "first", only "second" remains, so it's not empty
        System.out.println(queue.isEmpty()); // Output: false
    }
}

