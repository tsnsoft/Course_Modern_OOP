package tsn_java_oop_teacher; // Имя нашего пакета

/**
 * Класс "Программист". Этот класс является наследником абстрактного
 * класса-предка "AProgrammer" и реализует абстрактный метод предка "development"
 *
 * @author Талипов С.Н.
 */
public class JavaProgrammer extends AProgrammer {

    /**
     * Это конструктор c 2 параметрами. Сигнатура метода: СТРОКА, ЛОГИЧЕСКОЕ
     *
     * @param fio Фамилия Имя
     * @param isMan мужчина - true, женщина - false
     */
    public JavaProgrammer(String fio, boolean isMan) {
        super(fio, isMan); // Вызываем одноименный конструктор предка с такой же сигнатурой
    }

    /**
     * Реализация абстрактного метода "разработка"
     */
    @Override
    public void development() {
        System.out.println("Пишу любые программы на Java/Android, цена договорная");
    }

}
