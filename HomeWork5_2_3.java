import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HomeWork5_2_3 {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<String>();
        Map<String, Integer> map_people = new HashMap<>();
        people.add("Евгений");
        people.add("Сергей");
        people.add("Андрей");
        people.add("Сергей");
        people.add("Сергей");
        people.add("Евгений");
        people.add("Андрей");
        people.add("Инна");
        people.add("Котик");
        people.add("Котик");
        people.add("Котик");
        people.add("Котик");
        people.add("Жанна");

        System.out.println(people);
        Integer count = 0;
        for (String str : people) {
            for (int i = 0; i < people.size(); i++) {
                if(str.equals(people.get(i))){
                    count++;
                }
            }
            if (count > 1 ) map_people.put(str, count);
            count = 0;
        }
        map_people.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()) 
        .forEach(System.out::println); // или любой другой конечный метод
    }
}
