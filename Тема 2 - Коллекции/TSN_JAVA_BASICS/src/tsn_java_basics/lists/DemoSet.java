package tsn_java_basics.lists;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * МНОЖЕСТВА
 *
 */
public class DemoSet {

    public DemoSet() {
        Set<String> linkedHashSet = new LinkedHashSet<>(); // Без сортировки с сохранением позиций
        Set<String> treeSet = new TreeSet<>(); // С сортировкой и авто позициями
        Set<String> hashSet = new HashSet<>(); // Без сортировки и без сохранения позиций

        linkedHashSet.add("4");
        linkedHashSet.add("5");
        linkedHashSet.add("2");
        linkedHashSet.add("1");
        linkedHashSet.add("2");
        linkedHashSet.add("44");
        linkedHashSet.add("3");
        linkedHashSet.add("5");

        if (linkedHashSet.contains("44")) {
            System.out.println("44!");
        } else {
            System.out.println("not 44");
        }

        linkedHashSet.remove("44");

        treeSet.addAll(linkedHashSet);
        hashSet.addAll(linkedHashSet);

        for (String entry : linkedHashSet) { // "4 5 2 1 3"
            System.out.print(entry + " ");
        }
        System.out.println();

        for (String entry : treeSet) { // "1 2 3 4 5"
            System.out.print(entry + " ");
        }
        System.out.println();

        Iterator<String> i = hashSet.iterator(); // "1 2 3 4 5"
        while (i.hasNext()) {
            System.out.print(i.next()+" ");
        }
        System.out.println();
    }

}
