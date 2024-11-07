// Collections Framework Solution
import java.util.Queue;
import java.util.LinkedList;

public class Solution {
    
    public int[] reverseBElements(int[] arr, int B) {
        Queue<Integer> queue = new LinkedList<>(); // Initialize a queue using LinkedList
        
        // Insert the first B elements into the queue
        for (int i = 0; i < B; i++) {
            queue.offer(arr[i]); // Enqueue elements
        }
        
        // Remove from the queue in reverse order and update the array
        for (int i = B - 1; i >= 0; i--) {
            arr[i] = queue.poll(); // Dequeue elements and place them in reverse order
        }
        
        return arr; // Return the updated array
    }
}
