package map;
import java.util.HashMap;
import java.util.Map;
public class Application {
    public static void main(String[] args) {

        // приклад роботи геш мап
        // цей код порахує скільки різів повторюються слова в реченні
        //всі слова заливаються у масив у вигляді геш меп по черзі, якщо це слово вже є то воно переписується з ключем ++додати
        Map<String, Integer> map = new HashMap<>();
        String text = "«Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium," +
                "totam rem aperiam eaque ipsa, quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt";
        String[] words = text.toLowerCase().split(" ");
        for (String word : words) {
            Integer integer = map.get(word);
            int value;
            if (integer == null) {value = 1;}
            else {value = ++integer;}
            map.put (word, value);}
        System.out.println(map);}
}