package tsn.java.xml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.Properties;

public class Launch {  // РАБОТА С XML-ФАЙЛАМИ

    public static void main(String[] args) {
        final int R = 4;
        final int C = 5;
        int m[][] = new int[R][C];
        int k;

        // Вывод данных о задании на экран
        System.out.println("Laboratory work");
        System.out.println("Task: MAX <> MIN");

        try {
            // Определяем текущий каталог
            String dir = new File(".").getAbsoluteFile().getParentFile().getAbsolutePath()
                    + System.getProperty("file.separator");
            String fileNameXML = dir + "tsn_data.xml"; // Имя XML-файла для работы
            String fileNameProp = dir + "tsn_data.prop"; // Имя Prop-файла для работы
            System.out.println(fileNameXML);
            System.out.println(fileNameProp);
            Properties p = new Properties(); // Переменная для хранения xml-данных
            File f1 = new File(fileNameXML); // Переменная для доступа к файлу fileNameXML
            File f2 = new File(fileNameProp); // Переменная для доступа к файлу fileNameProp
            String comment = new Date().toString(); // Переменная для комментария

            if ((f1.exists() == false) || f2.exists() == false) {
                // Создаем случайные данные для файлов
                for (int i = 0; i < R; i++) {
                    for (int j = 0; j < C; j++) {
                        k = (int) Math.round(Math.random() * 9);
                        p.put("m" + i + j, String.valueOf(k));
                       // p.put("m" + i + j, String.valueOf(1));
                    }
                }
                // Сохранение обработанных данных массива в файлы
                p.storeToXML(new FileOutputStream(fileNameXML), comment);
                p.store(new FileOutputStream(fileNameProp), comment);
            } else { // Если файл существует, то
                // Загружаем xml-данные из файла в переменную p для сохранения существующих значений
                p.loadFromXML(new FileInputStream(fileNameXML));
                //p.load(new FileInputStream(fileNameProp));
            }

            System.out.println("Matrix:");

            // Считывание данных из XML-файла
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    k = Integer.valueOf(p.getProperty("m" + i + j, "0"));
                    m[i][j] = k;
                    System.out.print(k + " ");
                }
                System.out.println("");
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

            // Сохраняем данные итогового массива в перемменную XML-файла
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    // Сохраняем данные в переменную, хранящую данные xml
                    p.put("r" + i + j, String.valueOf(m[i][j]));
                }
            }
            // Сохранение обработанных данных массива в XML-файл
            p.storeToXML(new FileOutputStream(fileNameXML), comment);
            p.store(new FileOutputStream(fileNameProp), "Source and processed array data");

            // Считывание обработанных данных из XML-файла
            System.out.println("New matrix:");
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    System.out.print(p.getProperty("r" + i + j, "?") + " ");
                }
                System.out.println("");
            }

        } catch (Exception e) {
            System.err.println("Error working with XML-file!"); // Вывести сообщение об ошибке            
        }
    }
}
