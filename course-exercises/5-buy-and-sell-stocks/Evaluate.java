/* Ignore this file: Instructor Code (For Testing) */

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.udemy.ucp.*;

public class Evaluate {
    Exercise app = new Exercise();

    // Test Cases
    @Test
    public void test_max_profit_1(){
        int[] input1 = new int[]{7, 1, 5, 3, 6, 4};
        assertEquals(app.maxProfit(input1), 5);
    }
    
    @Test
    public void test_max_profit_2(){
        int[] input2 = new int[]{7, 6, 4, 3, 1};
        assertEquals(app.maxProfit(input2), 0);
    }
    
    @Test
    public void test_max_profit_3(){
        int[] input2 = new int[]{3, 8, 6, 7, 2};
        assertEquals(app.maxProfit(input2), 5);
    }
    
    @Test
    public void test_max_profit_4(){
        int[] input2 = new int[]{1, 2, 3, 4, 5};
        assertEquals(app.maxProfit(input2), 4);
    }
    
    @Test
    public void test_max_profit_5(){
        int[] input2 = new int[]{5, 4, 3, 2, 10};
        assertEquals(app.maxProfit(input2), 8);
    }
}
