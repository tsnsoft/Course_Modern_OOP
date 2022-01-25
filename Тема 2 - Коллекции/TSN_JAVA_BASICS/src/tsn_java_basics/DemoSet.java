package tsn_java_basics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * МНОЖЕСТВА
 *
 */
public class DemoSet {

    public DemoSet() {
        Set<String> normSet = new LinkedHashSet<String>(); // Без сортировки с сохранением позиций
        Set<String> sortSet = new TreeSet<String>(); // С сортировкой и авто позициями
        Set<String> hashSet = new HashSet<String>(); // Без сортировки и без сохранения позиций

        normSet.add("2");
        normSet.add("1");
        normSet.add("2");
        normSet.add("4");
        normSet.add("3");
        normSet.add("5");
        normSet.add("4");
        normSet.add("5");

      //  normSet.remove("5");
        if (normSet.contains("498539405839045839045")) {
          System.out.println("5!");
        } else {
              System.out.println("not 5");
        }
                
        sortSet.addAll(normSet);
        hashSet.addAll(normSet);

        for (String entry : normSet) { // "21435"
            System.out.print(entry);
        }
        System.out.println();

        for (String entry : sortSet) { // "12345"
            System.out.print(entry);
        }
        System.out.println();

        for (String entry : hashSet) { // "32154"
            System.out.print(entry);
        }
        System.out.println();
    }

}
