package tsn_java_oop_teacher;  // Имя нашего пакета

import java.util.ArrayList; // Подключение вспомогательного класса для работы с массивами объектов ArrayList

/**
 * Основной класс программы для ее запуска на выполнение
 *
 * @author Талипов С.Н.
 */
public class Launch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human vasa; // Объявляем переменную-объект "vasa" типа класса "Human"
        vasa = new Human(); // Создаем (инициализируем ) переменную-объект "vasa"  
        // через конструктор по-умолчанию

        vasa.setAge(12); // Укажем через сеттер что Васе 12 лет
        vasa.setFio("VASA"); // Укажем через сеттер что имя Васе "VASA"
        vasa.setIsMan(true); // Укажем через сеттер что Вася мужского пола

        System.out.println(vasa.getAge()); // Выведем на экран через геттер класса возраст Васи
        System.out.println(vasa.getFio()); // Выведем на экран через геттер класса имя Васи
        System.out.println(vasa.isIsMan()); // Выведем на экран через геттер класса пол Васи

        System.out.println(vasa); // Выведем на экран через метод "toString" класса все данные объекта-Васи

        // Создаем переменную-объект "pet" типа класса "Human" через конструктор по-умолчанию
        Human pet = new Human();
        System.out.println(pet);// Выведем на экран через метод "toString" класса все данные объекта "pet"

        // Создаем переменную-объект "anna" типа класса "Human" через конструктор c 3 парамтрами 
        Human anna = new Human(12, "Anna", false);
        System.out.println(anna);

        // Создаем переменную-объект "dasha" типа класса "Human" через конструктор c 2 параметрами
        Human dasha = new Human("Dasha", false);
        System.out.println(dasha);

        // Создаем переменную-объект "ts" типа класса "Teacher" через конструктор по-умолчанию
        Teacher ts = new Teacher();
        ts.setFio("T.S."); // Задаем ФИО
        ts.setAge(120); // Задаем возраст
        ts.setIsMan(true);  // Задаем что мужчина
        ts.teachStudents(); // Просим "ts" поучить студентов
        System.out.println(ts); // Выведем на экран через метод "toString" класса все данные объекта "ts"

        // Создаем переменную-объект "gogi" типа абстрактного класса "AProgrammer" через конструктор с 2 параметрами
        AProgrammer gogi = new AProgrammer("gogi", true) {
            // Тут мы реализуем абстрактный класс "AProgrammer" через временный анонимный класс
            // Доделываем тут метод "development", который был не доделан в "AProgrammer"
            @Override
            public void development() {
                System.out.println("Пишу плохой код, недорого!");
            }
        };
        gogi.setSalary(30000); // Задаем зарплату
        gogi.development(); // Просив выполнить "gogi" для нас программистскую работу
        System.out.println(gogi); // Выводим данные "gogi" на экран

        // Создаем переменную-объект "tsn" типа класса "JavaProgrammer" через конструктор с 2 параметрами
        JavaProgrammer tsn = new JavaProgrammer("TSN", true);
        tsn.development(); // Просив выполнить "tsn" для нас программистскую работу
        System.out.println(tsn);  // Выводим данные "tsn" на экран

        // Делаем динамический массив для объектов типа класса "Human" с именем "myFriends"
        ArrayList<Human> myFriends = new ArrayList();
        myFriends.add(gogi); // Добавляем "gogi" в массив
        myFriends.add(tsn); // Добавляем "tsn" в массив
        myFriends.add(ts); // Добавляем "ts" в массив

        System.out.println(myFriends); // Выводим содержимое массива "myFriends" на экран

        System.out.println(myFriends.get(0).getFio()); // Спрашиваем у первого элемента массива его ФИО
        System.out.println(myFriends.get(1).getFio()); // Спрашиваем у второго элемента массива его ФИО
        System.out.println(myFriends.get(2).getFio()); // Спрашиваем у третьего элемента массива его ФИО

        // myFriends.get(0).development(); // Так делать нельзя, "gogi" для массива как просто человек и все
        // myFriends.get(1).development(); // Так делать нельзя, "tsn" для массива как просто человек и все 
        // myFriends.get(2).teachStudents(); // Так делать нельзя, "ts" для массива как просто человек и все 
        // Делаем динамический массив для объектов типа класса "Human" с именем "myFriends"
        ArrayList<IProgrammer> myСolleagues = new ArrayList();
        myСolleagues.add(gogi); // Добавляем "gogi" в массив
        myСolleagues.add(tsn); // Добавляем "tsn" в массив

        System.out.println(myСolleagues); // Выводим содержимое массива "myFriends" на экран

        // System.out.println(myСolleagues.get(0).getFio()); // Так делать нельзя, нет в интерфейсе этого метода
        // System.out.println(myСolleagues.get(1).getFio()); // Так делать нельзя, нет в интерфейсе этого метода
        myСolleagues.get(0).development(); // Просив выполнить "gogi" для нас программистскую работу
        myСolleagues.get(1).development(); // Просив выполнить "tsn" для нас программистскую работу

        for (IProgrammer с : myСolleagues) { // Просим всех выполнить для нас программистскую работу через цикл
            с.development();
        }

    }

}
