package oop_lab1;

public class Person2 {

    private String fio;
    private int year;
    private String inn;

    public Person2() {
    }

    public Person2(String fio, int year) {
        this.fio = fio;
        this.year = year;
    }

    public Person2(String fio, int year, String inn) {
        this.fio = fio;
        this.year = year;
        this.inn = inn;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
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
        return "Person2{" + "fio=" + fio + ", year=" + year + ", inn=" + inn + '}';
    }

}
