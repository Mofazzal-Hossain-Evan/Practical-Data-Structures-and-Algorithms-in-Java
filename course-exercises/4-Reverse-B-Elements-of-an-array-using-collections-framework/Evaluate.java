/* Ignore this file: Instructor Code (For Testing) */

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.udemy.ucp.*;

public class Evaluate {
    Exercise app = new Exercise();
    int[] arr = null;
    int B = 0;

    // Test Cases
    @Test
    public void test_reverse_of_3_elements(){
        arr = new int[]{1, 2, 3, 4, 5};
        B = 3;
        int[] user_ans = app.reverseBElements(arr,B);
        int[] ans = new int[]{3, 2, 1, 4, 5};
        assertTrue(Arrays.equals(user_ans, ans));
    }
    @Test
    public void test_reverse_of_2_elements_I(){
        arr = new int[]{9, 8, 7, 6, 5};
        B = 2;
        int[] user_ans = app.reverseBElements(arr,B);
        int[] ans = new int[]{8, 9, 7, 6, 5};
        assertTrue(Arrays.equals(user_ans, ans));
    }
    @Test
    public void test_reverse_of_2_elements_II(){
        arr = new int[]{9, 8, 7, 6, 5, 4};
        B = 2;
        int[] user_ans = app.reverseBElements(arr,B);
        int[] ans = new int[]{8, 9, 7, 6, 5, 4};
        assertTrue(Arrays.equals(user_ans, ans));
    }
    @Test
    public void test_reverse_of_4_elements(){
        arr = new int[]{1, 2, 3, 4};
        B = 4;
        int[] user_ans = app.reverseBElements(arr,B);
        int[] ans = new int[]{4, 3, 2, 1};
        assertTrue(Arrays.equals(user_ans, ans));
    }
    @Test
    public void test_reverse_of_1_element(){
        arr = new int[]{5, 6, 7};
        B = 1;
        int[] user_ans = app.reverseBElements(arr,B);
        int[] ans = new int[]{5, 6, 7};
        assertTrue(Arrays.equals(user_ans, ans));
    }
    @Test
    public void test_reverse_of_0_elements(){
        arr = new int[]{10, 20, 30, 40, 50};
        B = 0;
        int[] user_ans = app.reverseBElements(arr,B);
        int[] ans = new int[]{10, 20, 30, 40, 50};
        assertTrue(Arrays.equals(user_ans, ans));
    }
}
