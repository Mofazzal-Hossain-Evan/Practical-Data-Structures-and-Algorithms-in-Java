import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<String>();
        words.add("hello");
        words.add("23");

       String item =  words.get(1);
        System.out.println(item);
    }
}
