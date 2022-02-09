package tsn_java_oop_teacher; // Имя нашего пакета

/**
 * Абстрактный класс "Программист". Этот класс наследник Human и обязан
 * выполнить все что указано в "IProgrammer". Так как класс не может полностью
 * выполнить требования "IProgrammer", то мы его сделали абстрактным, с
 * абстрактным (нереализованным) методом "development". Этот класс отличается от
 * своего предка новым полем "зарплата"
 *
 * @author Талипов С.Н.
 */
public abstract class AProgrammer extends Human implements IProgrammer {

    /**
     * Поле "Зарплата"
     */
    private double salary;

    /**
     * Это конструктор по-умолчанию. Его нужно обязательно делать, если делаем
     * свои конструкторы
     */
    public AProgrammer() {
    }

    /**
     * Наш конструктор с двумя параметрами
     *
     * @param fio Фамилия Имя
     * @param isMan мужчина - true, женщина - false
     */
    public AProgrammer(String fio, boolean isMan) {
        super(fio, isMan); // Вызываем конструктор предка с такой же сигнатурой
    }

    /**
     * Установить зарплату
     *
     * @param salary зарплата, тенге
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Считать зарплату, тенге
     *
     * @return зарплата
     */
    public double getSalary() {
        return salary;
    }

}
