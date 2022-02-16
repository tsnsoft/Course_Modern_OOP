package tsn_java_basics.lists;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * ОЧЕРЕДЬ
 *
 */
public class DemoQueue {

    public DemoQueue() {

        Comparator<Integer> comparator = (Integer o1, Integer o2) -> {
            // Сортировка по убыванию
            if (o1 > o2) {
                return -1;
            }
            if (o1 < o2) {
                return 1;
            }
            return 0;
        }; // Сравниватель объектов (компаратор)

//		Queue<Integer> intQueue = new PriorityQueue<>(10, comparator); // Приоритетная очередь с осортировкой по компоратору
        Queue<Integer> intQueue = new PriorityQueue<>(10, null); // Приоритетная очередь с автосортировкой по возрастанию

        intQueue.add(4);
        intQueue.add(3);
        intQueue.add(7);
        intQueue.add(3);
        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(12);
        intQueue.add(7);

        for (int entry : intQueue) { // Элементы будут перебераться в произвольном виде
            System.out.println(entry);
        }
        System.out.println();

        while (!intQueue.isEmpty()) { // Удаление элементов в порядке приоритета
            System.out.println("удаление элемента " + intQueue.remove());
        }

        intQueue.add(14);
        intQueue.add(13);
        intQueue.add(17);
        intQueue.add(13);
        intQueue.add(11);
        intQueue.add(15);
        intQueue.add(112);
        intQueue.add(17);

        Integer[] intArray = new Integer[intQueue.size()]; // Массив для работы с очередью
        intQueue.toArray(intArray); // Копирование элементов очереди в массив без упорядочивания
        Arrays.sort(intArray, comparator); // Сортировка массива компоратором
//		 Arrays.sort(intArray, null); // Сортировка массива по возрастанию

        System.out.println();
        for (int entry : intArray) {
            System.out.format("%s ", entry);
        }
        System.out.println();
    }

}
