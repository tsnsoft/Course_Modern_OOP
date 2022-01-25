package tsn_java_basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * КОЛЛЕКЦИИ СПИСКОВ
 *
 */
public class DemoList {

    public DemoList() {

        // Медленное добавление, но быстрый доступ к элементам по индексу 
        List<Integer> listInt = new ArrayList<Integer>(Arrays.asList(1, -1, -11, 77, 2, 5, 4));  // 

        // Быстрое добавление, но медленный доступ к элементам по индексу  
//        List<String> listStr = new LinkedList<String>(Arrays.asList("Delphi", "Java", "C++", "C#", "java", "pascal", "VB"));

        System.out.println(listInt);
  //      System.out.println(listStr);

        listInt.add(22); // Добавление элемента
        listInt.add(12); // Добавление элемента
        
        System.out.println(listInt);
        listInt.remove(1);
        System.out.println(listInt);
        System.out.println(listInt.get(2));
        
//        listStr.remove("java"); // Удаление элемента
  //      listStr.remove("C++"); // Удаление элемента
    //    System.out.println(listStr);
      //  listStr.subList(2, 4).clear(); // Удаление части элементов (со 2 по 4, отсчет с 0) 

//        System.out.println(listStr);
  //      System.out.println(listInt);

    //    System.out.println("min: " + Collections.min(listStr)); // Минимальное значение в списке

      //  System.out.println("get 3 element: " + listInt.get(3)); // Получение значения элемента списка (с 0)
//        System.out.println("min: " + Collections.min(listInt)); // Минимальное значение в списке

  //      Collections.sort(listStr); // Сортировка списка
//        mySorter(listInt);

//        System.out.println(listStr);

//        ListIterator<String> it = listStr.listIterator(listStr.size());
//        while (it.hasPrevious()) { // Цикл по списку с обратным итератором
//            String item = it.previous(); // Получение предыдущего элемента списка
//            System.out.print(item + " ");
//        }
//
//        System.out.println();
//        for (String item : listStr) { // Цикл по списку
//            System.out.print(item + " "); // Получение текущего элемента списка
//        }
//
//        System.out.println();
//        myPrint(listInt);
//
//    }
//
//    <T extends Comparable<T>> List<T> mySorter(List<T> list) { // Метод с обобщенным типом
//        Collections.sort(list); // Сортировка списка
//        Collections.reverse(list); // Перестановка элементов списка наоборот
//        return (list);
//    }
//
//    <T extends Comparable<T>> void myPrint(List<T> list) { // Метод с обобщенным типом
//        Iterator<T> it = list.iterator();
//        while (it.hasNext()) { // Цикл по списку с прямым итератором
//            T element = it.next(); // Использование параметрического типа
//            System.out.print(element.toString() + " ");
//        }
//        System.out.println();
    }

}
