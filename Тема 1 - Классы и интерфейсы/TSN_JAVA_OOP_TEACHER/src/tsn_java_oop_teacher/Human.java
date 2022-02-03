package tsn_java_oop_teacher; // Имя нашего пакета

/**
 * Класс с именем "Человек"
 *
 * @author Талипов С.Н.
 */
public class Human {

    private int age; // это внутреннее (инкапсулированное) целое поле (свойство) "age"
    private String fio; // это внутреннее (инкапсулированное) строковое поле (свойство) "fio"
    private boolean isMan; // это внутреннее (инкапсулированное) логическое поле (свойство) "isMan"

    /**
     * Это конструктор по-умолчанию (без параметров)
     */
    public Human() {
        age = 0; // инициализируем свойство "age" нужным нам значением по-умолчанию
        fio = "???"; // инициализируем свойство "fio" нужным нам значением по-умолчанию
        isMan = true; // инициализируем свойство "isMan" нужным нам значением по-умолчанию
    }

    /**
     * Это конструктор c 2 параметрами.Сигнатура метода: СТРОКА, ЛОГИЧЕСКОЕ
     *
     * @param fio ФИО
     * @param isMan мужчина?
     */
    public Human(String fio, boolean isMan) {
        this.age = 0;
        this.fio = fio;
        this.isMan = isMan;
    }

    /**
     * Это конструктор c 3 параметрами.Сигнатура метода: ЦЕЛОЕ, СТРОКА,
     * ЛОГИЧЕСКОЕ
     *
     * @param age возраст
     * @param fio ФИО
     * @param isMan мужчина?
     */
    public Human(int age, String fio, boolean isMan) {
        this.age = age;
        this.fio = fio;
        this.isMan = isMan;
    }

    /**
     * Геттер (получатель значения) для поля "age"
     *
     * @return возраст
     */
    public int getAge() {
        return age;
    }

    /**
     * Сеттер (установщик значения) для поля "age"
     *
     * @param age возраст
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Геттер (получатель значения) для поля "fio"
     *
     * @return Фамилия Имя
     */
    public String getFio() {
        return fio;
    }

    /**
     * Сеттер (установщик значения) для поля "fio"
     *
     * @param fio Фамилия Имя
     */
    public void setFio(String fio) {
        this.fio = fio;
    }

    /**
     * Геттер (получатель значения) для поля "isMan"
     *
     * @return мужчина - true, женщина - false
     *
     */
    public boolean isIsMan() {
        return isMan;
    }

    /**
     * Сеттер (установщик значения) для поля "isMan"
     *
     * @param isMan мужчина - true, женщина - false
     */
    public void setIsMan(boolean isMan) {
        this.isMan = isMan;
    }

    /**
     * Метод для распечатки объекта этого класса в виде строки
     *
     * @return строка-представление объекта этого класса
     */
    @Override
    // Переопределение метода "toString" для печати объектов класса
    public String toString() {
        return fio + " {" + "age=" + age + ", isMan=" + isMan + '}';
    }

}
