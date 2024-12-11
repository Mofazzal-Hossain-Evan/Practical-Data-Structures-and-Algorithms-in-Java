import java.util.*;

public class Exercise {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the complement and its index
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Store the current number with its index in the map
            map.put(nums[i], i);
        }

        // Return an array with indices [-1,-1] as the array if no solution is found (though the problem guarantees one)
        return new int[] {-1, -1};
        // Optional: To throw an Exception:
        // throw new IllegalArgumentException("No two sum solution");
    }
}
