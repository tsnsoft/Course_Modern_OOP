package tsn_java_oop_teacher;  // Имя нашего пакета

/**
 * Класс "Преподаватель". Этот класс является наследником класса-предка "Human" и
 * также должен реализовать интерфейс "ITeach"
 *
 * @author Талипов С.Н.
 */
public class Teacher extends Human implements ITeach {

    /**
     * Реализация метода "обучать" из интерфейса "ITeach"
     */
    @Override
    public void teachStudents() {
        System.out.println("Обучаю Java, Android, Python, C++, DB и др.");
    }

}
