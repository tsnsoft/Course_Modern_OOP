package tsn_java_basics;

import tsn_java_basics.DemoInnerClass.Quadratic.Answer;

/**
 * ВНУТРЕННИЕ КЛАССЫ
 *
 */
public class DemoInnerClass {

    public class Quadratic { // Класс, решающий квадратное уравнение

        public class Answer { // Вложенный класс ответа для класса квадратного уравнения

            double x1, x2;

            public Answer(double x1, double x2) { // Конструктор внутренненго класса
                this.x1 = x1;
                this.x2 = x2;
            }

            @Override
            public String toString() {
                return String.format("Ответ: x1=%f, x2=%f", x1, x2);
            }

        }

        public Answer solve(double a, double b, double c) { // Метод рассчета квадратного уравнения
            double d = b * b - 4 * a * c;
            double x1 = (-b - Math.sqrt(d)) / (2 * a);
            double x2 = (-b + Math.sqrt(d)) / (2 * a);
            Answer answer = new Answer(x1, x2);
            return answer;
        }

    }

    public DemoInnerClass() {
        Answer answer = new Quadratic().solve(-1, 2, 3);
        System.out.println(answer.toString());
        System.out.println(new Quadratic().solve(-10, 25, 14).toString());
    }

}
