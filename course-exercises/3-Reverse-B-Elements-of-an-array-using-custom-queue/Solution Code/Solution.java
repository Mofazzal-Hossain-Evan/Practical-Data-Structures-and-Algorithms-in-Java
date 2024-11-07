// Custom Queue Solution
public class Solution {

    public int[] reverseBElements(int[] arr, int B) {
        MyQueue queue = new MyQueue(B); // Initialize queue of size B
        
        // Insert first B elements into the queue
        for (int i = 0; i < B; i++) {
            queue.insert(arr[i]);
        }
        
        // Remove from queue in reverse order and update array
        for (int i = B - 1; i >= 0; i--) {
            arr[i] = queue.remove();
        }
        
        return arr; // Return updated array
    }
}
