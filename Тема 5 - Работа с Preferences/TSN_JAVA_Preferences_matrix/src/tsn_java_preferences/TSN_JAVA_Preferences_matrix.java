package tsn_java_preferences;

import java.util.prefs.Preferences;

public class TSN_JAVA_Preferences_matrix {

    public static void main(String[] args) {
        Preferences node = Preferences.userRoot().node("tsn_sp_lab5");

        final int R = 5; // Количество строк
        final int C = 6; // Количество столбцов
        int m[][] = new int[R][C]; // Массив
        int k;

        // Вывод данных о задании на экран
        System.out.println("Laboratory work");
        System.out.println("Task: MAX <> MIN");

        // Заполняем (создаем) массив в реестре случайными числами
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                k = (int) Math.round(-10 + Math.random() * 20);
                node.putInt("K" + i + "," + j, k);
            }
        }

        // Чтение массива из реестра и вывод его на экран
        System.out.println("Matrix:");
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                m[i][j] = node.getInt("K" + i + "," + j, 0);
                System.out.print(String.valueOf(m[i][j]) + " ");

            }
            System.out.println();
        }

        // Реализация алгоритма варианта задания 
        int min = m[0][0], max = m[0][0], maxi = 0, maxj = 0, mini = 0, minj = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                k = m[i][j];
                if (k > max) {
                    max = k;
                    maxi = i;
                    maxj = j;
                }
                if (k < min) {
                    min = k;
                    mini = i;
                    minj = j;
                }
            }
        }
        k = m[maxi][maxj];
        m[maxi][maxj] = m[mini][minj];
        m[mini][minj] = k;

        // Заносим данные измененного массива в реестр
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                node.putInt("Y" + i + "," + j, m[i][j]);
            }
        }

        // Считываем данные измененного массива из реестра и выводим их на экран
        System.out.println("New matrix:");
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(node.getInt("Y" + i + "," + j, 0) + " ");
            }
            System.out.println("");
        }
    }
}
