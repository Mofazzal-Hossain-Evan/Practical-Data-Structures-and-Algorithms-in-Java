import java.util.ArrayList;

public class Application2 {
    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();

        animals.add("Lion");
        animals.add("Lion2");
        animals.add("Lion3");

        for (int i = 0; i < animals.size(); i++){
            System.out.println(animals.get(i));
        }

    }
}
