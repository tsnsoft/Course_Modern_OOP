package oop_lab3;

public class OOP_LAB3 {

    public static void main(String[] args) {
        Person5 bob = new Person5("Bob", 2000, "123456789");
        Person5 anna = new Person5("Anna", 2003, "987654321");
        Person5 john = new Person5("John", 2001, "432659871");
        bob.getBody().setPressure("90/120");
        anna.getBody().setTemperature(36.6f);
        anna.getBody().setPressure("60/100");
        anna.getBody().setTemperature(36.8f);
        System.out.println(bob);
        System.out.println(anna);
        System.out.println(john);

        john.getBody().setTemperature(37.7f);
        
        bob.getFriends().add(anna);
        bob.getFriends().add(john);
        bob.getFriends().add(new Person5("Neo", 1990, "777"));
        
        System.out.println();

        System.out.println("Friends Bob:");
        for (int i = 0; i < bob.getFriends().size(); i++) {
            System.out.println(bob.getFriends().get(i));
        }
        
    }
    
}
