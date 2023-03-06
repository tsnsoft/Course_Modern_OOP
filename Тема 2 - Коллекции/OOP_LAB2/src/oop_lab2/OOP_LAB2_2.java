package oop_lab2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class OOP_LAB2_2 {

    public static void main(String[] args) {
        ArrayList<Person4> list = new ArrayList();
        Map<Integer, Person4> map = new HashMap<>();
        Set set = new HashSet();

        Scanner sc = new Scanner(System.in);
        System.out.print("number (2..5): ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println();

        Person4 person = null;
        for (int i = 0; i < n; i++) {
            System.out.println("* " + (i + 1) + ":");
            System.out.print("fio: ");
            String fio = sc.nextLine();
            System.out.print("year: ");
            int year = sc.nextInt();
            sc.nextLine();
            System.out.print("inn: ");
            String inn = sc.nextLine();
            person = new Person4(fio, year, inn);
            list.add(person);
            map.put(i, person);
            set.add(person);
        }

        System.out.println();

        list.remove(0);
        map.remove(0);
        set.remove(person);

        list.get(0).setFio("*" + list.get(0).getFio());
        map.get(1).setFio("*" + list.get(0).getFio());

        System.out.println("List:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        System.out.println("Map:");
        for (Entry<Integer, Person4> entry : map.entrySet()) { // Печать карты на экран
            System.out.println("key " + entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();

        System.out.println("Set:");
        Iterator<Person4> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

}
