import java.util.*;

public class Main {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Chicken", "Water",  "Chocolate", "Milk", "Candy",
                "Chicken", "Water", "Milk", "Sugar", "Chocolate",
                "Chocolate", "Chicken", "Water", "Bread", "Water",
                "Cookie", "Water", "Milk", "Milk", "Chocolate"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Первоначальный массив");
        System.out.println(words.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}