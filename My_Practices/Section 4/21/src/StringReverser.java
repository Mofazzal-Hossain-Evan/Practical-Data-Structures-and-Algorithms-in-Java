import java.util.Stack;

public class StringReverser {

    public static String reverseString(String input) {
        // Create a Stack of Characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the input string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // StringBuilder to build the reversed string
        StringBuilder reversedString = new StringBuilder();

        // Pop each character from the stack and append to the StringBuilder
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        // Convert StringBuilder to String and return the reversed string
        return reversedString.toString();
    }

    public static void main(String[] args) {
        String input = "hello";
        String result = reverseString(input);
        System.out.println("Reversed string: " + result); // Output: "olleh"
    }
}