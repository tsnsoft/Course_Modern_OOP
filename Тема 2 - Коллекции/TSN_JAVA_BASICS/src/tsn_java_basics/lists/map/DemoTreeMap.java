package tsn_java_basics.lists.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * КАРТЫ
 *
 */
public class DemoTreeMap {

    public DemoTreeMap() {
        Map<String, String> hashMap = new HashMap<>(); // Без сортировки с сохранением позиций
        Map<String, String> treeMap = new TreeMap<>(); // С сортировкой по ключу (или компаратору) и авто позициями

        hashMap.put("qweqweqweweqweqwe1111", "Petroqweqwev");
        hashMap.put("22222222222221", "Sidorov");
        hashMap.put("3333333333333", "Ivanov");
        hashMap.put("3333333333333", "Ivanov2");
        hashMap.put("weqweqwe1111", "Petroqweqwev");
        hashMap.put("1111111111111", "Petrov");
        hashMap.put("2", "Ivanov3");
        treeMap.putAll(hashMap);

        for (Iterator<String> it = treeMap.keySet().iterator(); it.hasNext();) // Удаление элемента
        {
            if (it.next().equals("2")) {
                it.remove();
            }
        }

        System.out.println();
        
        for (Entry<String, String> entry : treeMap.entrySet()) { // На экран карту
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        TreeMap<Points, Points> objMap = new TreeMap<>(); // С сортировкой по компаратору с авто позициями

        Points points1 = new Points(1, 2);
        Points points2 = new Points(3, 4);
        Points points3 = new Points(5, 6);

        objMap.put(points2, points2);
        objMap.put(points3, points2);
        objMap.put(points1, points1);
        objMap.put(points3, points3);

        System.out.println();
        for (Entry<Points, Points> entry : objMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    class Points implements Comparable<Points> {

        int x;
        int y;

        public Points(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return String.format("Points [x=%s, y=%s]", x, y);
        }

        @Override
        public int compareTo(Points obj) {
            if (obj == null) {
                return 1;
            }
            if (x > obj.x) {
                return 1;
            }
            if (x < obj.x) {
                return -1;
            }
            if (y > obj.y) {
                return 1;
            }
            if (y < obj.y) {
                return -1;
            }
            return 0;
        }
    }

}
