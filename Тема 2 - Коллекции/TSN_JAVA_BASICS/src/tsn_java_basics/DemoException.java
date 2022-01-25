package tsn_java_basics;

import java.util.Scanner;

/**
 * РАБОТА С ИСКЛЮЧЕНИЯМИ
 *
 */
public class DemoException {

    static int err(int a, int b) {
        int c = a / b;
        System.out.format("Деление на %s успешно\n", b);
        return c;
    }

    public static void main(String[] args) throws Exception {
        int[] m = {-1, 0, 1};
        int a = 1;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.format("Введите любое число от 0 до 5 или букву для ошибки: ");
            a = sc.nextInt();
            err(12, a);
            System.out.println("Выполнется основная часть программы");
            m[a - 1] = 4 / a;
            System.out.format("Расчет успешен: %d\n", m[a]);
        } catch (ArithmeticException e) {
            System.out.println("Произошла недопустимая арифметическая операция");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Обращение по недопустимому индексу массива");
        } catch (Exception e) {
            System.out.println("Произошло ещё какое-то исключение");
            throw new Exception("Эта наша ошибка...");
        } finally {
            System.out.println("Закрываем консоль");
            sc.close();
        }
        System.out.println("Конец программы");
    }
}
