public class Solution {
    // Function to check if the parentheses are valid
    public static boolean isValid(String s) {
        // Create a Stack object with size of the input string
        Stack stack = new Stack(s.length());

        // Iterate through each character of the string
        for (char c : s.toCharArray()) {
            // If it's an opening bracket, push it onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // If it's a closing bracket, check the top of the stack
            else if (c == ')' || c == '}' || c == ']') {
                // If stack is empty or doesn't match the expected opening bracket, return false
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // In the end, the stack should be empty for valid parentheses
        return stack.isEmpty();
    }
}
