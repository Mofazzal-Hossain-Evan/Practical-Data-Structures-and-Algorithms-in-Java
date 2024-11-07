import java.util.Stack;

public class Solution {
    
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            // System.out.println("true");
            return true;
        }
        
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                // System.out.println(stack.isEmpty());
                return false;
            }
        }
        
        // System.out.println(stack.isEmpty());
        return stack.isEmpty();
    }

}