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
    public void test_valid_parentheses_empty_string(){
        assertTrue(app.isValid(""));
    }

    @Test
    public void test_valid_parentheses_single_pair(){
        assertTrue(app.isValid("()"));
    }

    @Test
    public void test_valid_parentheses_multiple_pairs_1(){
        assertTrue(app.isValid("([])"));
    }

    @Test
    public void test_valid_parentheses_multiple_pairs_2(){
        assertTrue(app.isValid("()[]{}"));
    }

    @Test
    public void test_invalid_parentheses_mismatched_pairs(){
        assertFalse(app.isValid("([)]"));
    }

    @Test
    public void test_invalid_parentheses_single_open(){
        assertFalse(app.isValid("["));
    }
}
