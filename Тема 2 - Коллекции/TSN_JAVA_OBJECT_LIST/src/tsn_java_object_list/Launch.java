package tsn_java_object_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import static tsn_java_object_list.Calculator.getCalculatorFromKeyboard;

public class Launch {

    public static void main(String[] args) {
        ArrayList<Calculator> arayList = new ArrayList();
        Map<Integer, Calculator> hashMap = new HashMap<>();
        CalcSet calculatorSet = new CalcSet();

        Scanner sc = new Scanner(System.in);
        System.out.print("number of calculators: ");
        int nc = sc.nextInt();
        System.out.println();
        Calculator c = null;
        String firstElement = null;
        for (int i = 0; i < nc; i++) {
            try {
                System.out.println(" * data calculator  = " + (i + 1));
                c = getCalculatorFromKeyboard();
                arayList.add(c);
                hashMap.put(i + 1, c);
                calculatorSet.getData().add(c.toString());
                System.out.println();
                if (i == 0) {
                    firstElement = c.toString();
                }
            } catch (Exception e) {
                System.out.println("[x] data calculator " + (i + 1)
                        + " ERROR! REPEAT DATA ENTRY [x] \n");
                i--;
            }
        }

        System.out.print("change data (0-no, 1-yes): ");
        sc.nextLine(); String cd = sc.nextLine();
        System.out.println();
        if (cd.equals("1")) {
            try {
                arayList.get(0).setPrice(-11111); // Изменение свойства элемента 1 объекта
                hashMap.get(1).setTitle("XXX");  // Изменение свойства элемента объекта с ключом 1
                arayList.remove(0); // Удаляем нулевой элемент (первый в списке)
                arayList.remove(c); // Удаляем элемент-объект c (это последний объект списка)
                arayList.remove(arayList.size() - 1); // Удаляем последний элемент
                hashMap.remove(hashMap.size()); // Удаляем последний элемент с нужным ключом
                hashMap.remove(1); // Удаляем элемент с ключом равным 1
                calculatorSet.getData().remove(firstElement); // Удаляем 1 элемент
                calculatorSet.getData().remove(c.toString()); // Удаляем последний элемент
            } catch (Exception e) {
                System.out.println(">>> ERROR: add more items !!!\n");
            }
        }

        System.out.println(" * sort arayList: ");
        Collections.sort(arayList);
        for (int i = 0; i < arayList.size(); i++) {
            System.out.println(arayList.get(i));
        }
        System.out.println();

        System.out.println(" * reverse arayList: ");
        Collections.reverse(arayList);
        for (Calculator calculator : arayList) {
            System.out.println(calculator);
        }
        System.out.println();

        System.out.println(" * hashMap: ");
        for (Entry<Integer, Calculator> entry : hashMap.entrySet()) { // Печать карты на экран
            System.out.println("key " + entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();

        System.out.println(" * hashSet: ");
        System.out.println(calculatorSet);
    }

}
