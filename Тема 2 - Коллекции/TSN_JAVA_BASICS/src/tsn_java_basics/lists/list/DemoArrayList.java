package tsn_java_basics.lists.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * СПИСОК ArrayList
 *
 */
public class DemoArrayList {

    public DemoArrayList() {

        // Медленное добавление, но быстрый доступ к элементам по индексу 
        List<Integer> listInt = new ArrayList<>(Arrays.asList(1, -1, -11, 77, 2, 5, 4));

        System.out.println(listInt);

        listInt.add(22); // Добавление элемента
        listInt.add(12); // Добавление элемента

        System.out.println(listInt);
        listInt.remove(1); // Удаление 2 элемента
        System.out.println(listInt);
        System.out.println(listInt.get(2)); // Показать 3 элемент

        System.out.println(listInt);

        System.out.println("min: " + Collections.min(listInt)); // Минимальное значение в списке
        System.out.println("max: " + Collections.max(listInt)); // Максимальное значение в списке

        mySorter(listInt);
        myPrint(listInt);
        System.out.println();

    }

    void mySorter(List list) { // Метод с обобщенным типом
        Collections.sort(list); // Сортировка списка
        Collections.reverse(list); // Перестановка элементов списка наоборот
    }

    <T extends Comparable<T>> void myPrint(List<T> list) { // Метод с обобщенным типом
        Iterator<T> it = list.iterator();
        while (it.hasNext()) { // Цикл по списку с прямым итератором
            T element = it.next(); // Использование параметрического типа
            System.out.print(element.toString() + " ");
        }
    }

}
