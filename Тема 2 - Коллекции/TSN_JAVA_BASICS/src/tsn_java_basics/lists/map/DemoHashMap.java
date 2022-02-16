package tsn_java_basics.lists.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * КАРТЫ (Словари)
 *
 */
public class DemoHashMap {

    public DemoHashMap() {
        Map<String, String> hashMap = new HashMap<>(); // Без сортировки с сохранением позиций

        hashMap.put("qweqweqweweqweqwe1111", "Petroqweqwev");
        hashMap.put("22222222222221", "Sidorov");
        hashMap.put("3333333333333", "Ivanov");
        hashMap.put("3333333333333", "Ivanov2");
        hashMap.put("1111111111111", "Petrov");
        hashMap.put("2", "Petroqweqwev");
        hashMap.put("3333333333333!", "Ivanov3");

        if (hashMap.containsKey("3333333333333!")) {
            System.out.println("Yes!");
        } else {
            System.out.println("no");
        }

        for (Entry<String, String> entry : hashMap.entrySet()) // Замена элемента новым значением
        {
            if (entry.getKey().equals("2")) {
                entry.setValue("xx");
            }
        }

        for (Entry<String, String> entry : hashMap.entrySet()) { // Печать карты на экран
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

}
