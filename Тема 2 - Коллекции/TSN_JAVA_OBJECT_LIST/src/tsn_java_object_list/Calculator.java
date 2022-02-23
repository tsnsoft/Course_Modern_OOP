package tsn_java_object_list;

import java.util.Scanner;

public class Calculator implements Comparable<Calculator> {

    private String title;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return title + " (price=" + price + ")";
    }

    @Override
    public int compareTo(Calculator anotheCalculator) {
        if (anotheCalculator == null) {
            return 1;
        }
        if (price > anotheCalculator.price) {
            return 1;
        }
        if (price < anotheCalculator.price) {
            return -1;
        }
        if (title.compareTo(anotheCalculator.title) > 0) {
            return 1;
        }
        if (title.compareTo(anotheCalculator.title) < 0) {
            return -1;
        }
        return 0;
    }

    public static Calculator getCalculatorFromKeyboard() {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("title: ");
        calculator.setTitle(sc.nextLine());
        System.out.print("price: ");
        calculator.setPrice(sc.nextDouble());
        return calculator;
    }    
}
