package oop_lab2;

public abstract class APerson3 implements IPerson{

    private String fio;
    private int year;
    private String inn;

    public APerson3() {
    }

    public APerson3(String fio, int year) {
        this.fio = fio;
        this.year = year;
    }

    public APerson3(String fio, int year, String inn) {
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
        return "Person{" + "fio=" + fio + ", year=" + year + ", inn=" + inn + '}';
    }

    @Override
    public void talk(String text) {
        System.out.println(text);
    }
    
    public void eating (String food) {
        System.out.println("eating:" + food);
    }
}
