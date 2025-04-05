package lesson5;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        // HashMap তৈরি, key: String (word), value: String (meaning)
        TreeMap<String, String> dictionary = new TreeMap<>();

        // ৫টি মান যোগ করা হচ্ছে
        dictionary.put("Apple", "A fruit that is sweet and red or green in color");
        dictionary.put("Book", "A set of written or printed pages bound together");
        dictionary.put("Computer", "An electronic device for storing and processing data");
        dictionary.put("Java", "A high-level programming language");
        dictionary.put("School", "A place where people go to learn");

        // Dictionary প্রিন্ট করা
        System.out.println("Dictionary contents:");
//        for (String key : dictionary.keySet()) {
//            System.out.println(key + ": " + dictionary.get(key));
//        }

        for (Map.Entry<String, String> entry: dictionary.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getKey());
        }
    }
}

