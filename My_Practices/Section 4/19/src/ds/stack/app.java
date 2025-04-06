package ds.stack;

public class app {
    public static void main(String[] args) {

        stack theStack = new stack(3);
        theStack.push(23);
        theStack.push(25);
        theStack.push(29);
        theStack.push(22);


while (!theStack.isEmpty()){
    long value = theStack.pop();
    System.out.println(value);
}
    }
}
