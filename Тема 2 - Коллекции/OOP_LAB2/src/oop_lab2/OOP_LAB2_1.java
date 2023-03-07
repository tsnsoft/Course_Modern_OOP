package oop_lab2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OOP_LAB2_1 {

    public static void main(String[] args) {
        Person4 bob = new Person4("Bob", 2000, "123456789");
        Person4 anna = new Person4("Anna", 2003, "987654321");
        Person4 john = new Person4("John", 2001, "432659871");

        ArrayList<Person4> list = new ArrayList();
        Map<Integer, Person4> map = new HashMap<>();
        Set set = new HashSet();

        list.add(bob); list.add(anna); list.add(john);
        list.add(john); list.add(anna); list.add(bob);

        map.put(1, bob); map.put(2, anna); map.put(3, john);
        map.put(3, bob); map.put(2, anna); map.put(1, john); 
        
        set.add(bob); set.add(anna); set.add(john);
        set.add(bob); set.add(anna); set.add(john);

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
