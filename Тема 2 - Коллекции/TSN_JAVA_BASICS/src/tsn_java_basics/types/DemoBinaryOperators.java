package tsn_java_basics.types;

public class DemoBinaryOperators {

    final static int A = -8;
    final static int B = 0x4f; // 79d
    final static int C = 0b1010011; // 83d

    static void print(int i) {
        System.out.format("%s\n", Integer.toBinaryString(i));
    }

    public static void main(String[] args) {
        print(A);
        print(~A); // побитовое унарное отрицание (NOT)
        print(A << 2); // сдвиг влево
        print(A >> 2); // сдвиг вправо
        print(A >>> 2); // сдвиг вправо с заполнением нулями
        System.out.println();
        print(B);
        print(C);
        System.out.println();
        print(B & C); // побитовое И (AND)
        print(B | C); // побитовое ИЛИ (OR)
        print(B ^ C); // побитовое исключающее ИЛИ (XOR)
    }
}
