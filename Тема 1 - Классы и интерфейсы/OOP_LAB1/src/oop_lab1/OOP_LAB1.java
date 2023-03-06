package oop_lab1;

public class OOP_LAB1 {

    public static void main(String[] args) {
        Person4 bob = new Person4();
        bob.setFio("Bob");
        bob.setYear(2000);
        bob.setInn("123456789");
        System.out.println(bob);
        Person4 anna = new Person4("Anna", 2003, "987654321");
        System.out.println(anna);
    }
    
}
