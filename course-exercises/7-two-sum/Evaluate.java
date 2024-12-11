/* Ignore this file: Instructor Code (For Testing) */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.udemy.ucp.*;

public class Evaluate {
    Exercise app = new Exercise();

    // Test Cases
    @Test
    public void test_two_sum_1(){
        int[] input1 = new int[]{2, 7, 11, 15};
        int target1 = 9;
        int[] answer1 = app.twoSum(input1, target1);
        assertEquals(answer1[0], 0);
        assertEquals(answer1[1], 1);
    }
    
    @Test
    public void test_two_sum_2(){
        int[] input2 = new int[]{3, 2, 4};
        int target2 = 6;
        int[] answer2 = app.twoSum(input2, target2);
        assertEquals(answer2[0], 1);
        assertEquals(answer2[1], 2);
    }
    
    @Test
    public void test_two_sum_3(){
        int[] input3 = new int[]{3, 2, 7};
        int target3 = 6;
        int[] answer3 = app.twoSum(input3, target3);
        assertEquals(answer3[0], -1);
        assertEquals(answer3[1], -1);
    }
}
