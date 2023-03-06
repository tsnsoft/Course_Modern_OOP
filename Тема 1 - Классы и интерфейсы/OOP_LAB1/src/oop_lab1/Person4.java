package oop_lab1;

public class Person4 extends APerson3 {

    Person4() {
    }

    Person4(String fio, int year, String inn) {
        super(fio, year, inn);
    }

    @Override
    public boolean go(String coordinates) {
        System.out.println("Go: " + coordinates);
        return true;
    }

    public void eating(String food, int amount) {
        System.out.println("eating:" + food + "amount:" + amount);
    }
    
}
