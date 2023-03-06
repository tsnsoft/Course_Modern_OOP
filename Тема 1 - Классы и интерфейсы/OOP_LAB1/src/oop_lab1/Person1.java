package oop_lab1;

public class Person1 {
    private String fio;
    private int year;

    public Person1() {
    }

    public Person1(String fio, int year) {
        this.fio = fio;
        this.year = year;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Person1{" + "fio=" + fio + ", year=" + year + '}';
    }

}
