package tsn_java_basics.sys;

/**
 * АРГУМЕНТЫ С ПЕРЕМЕННЫМ КОЛИЧЕСТВОМ ПАРАМЕТРОВ
 *
 */
class MultiVars {

    void getVars(int... args) { // Аргумент: переменное количество целых чисел
        System.out.println("Количество значений: " + args.length);
        for (int el : args) { // Перебор значений аргумента
            System.out.println(el);
        }

        System.out.printf("Количество значений: %d \n", args.length);
        for (int el = args.length - 1; el >= 0; el--) { // Перебор значений аргумента в обратном порядке
            System.out.println(args[el]);
        }
    }

    ;

    void getVarsArrays(int[]... args) { // Аргумент: переменное количество массивов
        System.out.format("\nКоличество массивов: %d \n", args.length);
        for (int n = 0; n < args.length; n++) { // Перебор значений аргумента 
            System.out.printf("Массив %d \n", n + 1);
            for (int el : args[n]) { // Перебор элементов массива
                System.out.println(el);
            }
        }
    }
;

};

public class DemoVarArgs {

    public DemoVarArgs() {
        new MultiVars().getVars(5, 7, 8, 12);
        new MultiVars().getVarsArrays(new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8});
        new MultiVars().getVarsArrays(new int[]{11, 12, 33});
    }

}
