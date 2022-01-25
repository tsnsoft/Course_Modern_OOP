package tsn_java_basics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * КАРТЫ
 *
 */
public class DemoMap {

    public DemoMap() {
        Map<String, String> normMap = new HashMap<String, String>(); // Без сортировки с сохранением позиций
//        Map<String, String> sortMap = new TreeMap<String, String>(); // С сортировкой по ключу (или компаратору) и авто позициями
  //      Map<String, String> hashMap = new HashMap<String, String>(); // Без сортировки и без сохранения позиций

        normMap.put("qweqweqweweqweqwe1111", "Petroqweqwev");
        normMap.put("22222222222221", "Sidorov");
        normMap.put("3333333333333", "Ivanov");
        normMap.put("3333333333333", "Ivanov2");
        normMap.put("1111111111111", "Petrov");
        normMap.put("weqweqwe1111", "Petroqweqwev");
        normMap.put("3333333333333", "Ivanov3");
        
        if (normMap.containsKey("3333333333333!")) {
            System.out.println("Yes!");
        } else {
                System.out.println("no");
        }

      //  sortMap.putAll(normMap);
      //  hashMap.putAll(normMap);

//        for (Entry<String, String> entry : normMap.entrySet()) // Замена элемента новым значением
//        {
//            if (entry.getKey().equals("2")) {
//                entry.setValue("xx");
//            }
//        }
//
//        for (Iterator<String> it = sortMap.keySet().iterator(); it.hasNext();) // Удаление элемента
//        {
//            if (it.next().equals("2")) {
//                it.remove();
//            }
//        }
//
        for (Entry<String, String> entry : normMap.entrySet()) { // "3 1 2 22"
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

//        System.out.println();
//        for (Entry<String, String> entry : sortMap.entrySet()) { // "1 22 3"
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//
//        System.out.println();
//        for (Entry<String, String> entry : hashMap.entrySet()) { // "3 2 1 22"
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }

//        Map<Points, Points> objMap = new TreeMap<Points, Points>(); // С сортировкой по компаратору с авто позициями
//
//        Points points1 = new Points(1, 2);
//        Points points2 = new Points(5, 6);
//        Points points3 = new Points(3, 4);
//
//        objMap.put(points1, points3);
//        objMap.put(points2, points2);
//        objMap.put(points3, points2);
//        objMap.put(points3, points1);
//
//        System.out.println();
//        for (Entry<Points, Points> entry : objMap.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//    }
//
//    class Points implements Comparable<Points> {
//
//        int x;
//        int y;
//
//        public Points(int x, int y) {
//            this.x = x;
//            this.y = y;
//        }
//
//        @Override
//        public String toString() {
//            return String.format("Points [x=%s, y=%s]", x, y);
//        }
//
//        @Override
//        public int compareTo(Points obj) {
//            if (obj == null) {
//                return 1;
//            }
//            if (x > obj.x) {
//                return 1;
//            }
//            if (x < obj.x) {
//                return -1;
//            }
//            if (y > obj.y) {
//                return 1;
//            }
//            if (y < obj.y) {
//                return -1;
//            }
//            return 0;
//        }
    }

}
