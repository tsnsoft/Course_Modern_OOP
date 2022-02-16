package tsn_java_basics.lists.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * СПИСОК LinkedList
 *
 */
public class DemoLinkedList {

    public DemoLinkedList() {

        // Быстрое добавление, но медленный доступ к элементам по индексу  
        List<String> listStr = new LinkedList<>(Arrays.asList("Delphi", "Java", "C++", "C#", "java", 
                "pascal", "VB"));
        System.out.println(listStr);

        listStr.remove("java"); // Удаление элемента
        listStr.remove("C++"); // Удаление элемента
        System.out.println(listStr);

        listStr.subList(2, 4).clear(); // Удаление части элементов (со 2 по 4, отсчет с 0) 
        System.out.println(listStr);

        System.out.println("min: " + Collections.min(listStr)); // Минимальное значение в списке

        Collections.sort(listStr); // Сортировка списка
        System.out.println(listStr);

        ListIterator<String> it = listStr.listIterator(listStr.size());
        while (it.hasPrevious()) { // Цикл по списку с обратным итератором
            String item = it.previous(); // Получение предыдущего элемента списка
            System.out.print(item + " ");
        }

        System.out.println();
        for (String item : listStr) { // Цикл по списку
            System.out.print(item + " "); // Получение текущего элемента списка
        }
        System.out.println();
    }

}
