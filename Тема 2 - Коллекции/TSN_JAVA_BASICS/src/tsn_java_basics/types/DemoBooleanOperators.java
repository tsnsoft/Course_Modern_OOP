package tsn_java_basics.types;

public class DemoBooleanOperators {

    final static boolean A = true;
    final static boolean B = false;
    final static boolean C = !A; // логическое унарное отрицание (NOT)

    static void print(boolean i) {
        System.out.format("%B\n", i);
    }

    public static void main(String[] args) {
        print(false);
        print(true);
        print(A);
        print(B);
        System.out.println();
        print(1 < 2);
        print(A & B); // логическое И (AND)
        print(A | B); // логическое ИЛИ (OR)
        print(A ^ C); // логическое исключающее ИЛИ (XOR)
        print(A && B); // оператор AND быстрой оценки выражений (short circuit AND)
        print(A || C); // оператор OR быстрой оценки выражений (short circuit OR)
    }

}
