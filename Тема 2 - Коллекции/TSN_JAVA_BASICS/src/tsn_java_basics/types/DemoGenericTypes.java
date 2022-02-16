package tsn_java_basics.types;

/**
 * ОБОБЩЕННЫЕ ТИПЫ ДАННЫХ
 *
 */

class MySqr<N extends Number> {

    private N result;

    MySqr(N t) {
        perform(t, "sqr");
    }

    private <S> N perform(N num, S str) {
        N n = (N) ((Number) (num.doubleValue() * num.doubleValue()));
        this.result = n;
        System.out.print(str);
        System.out.print(" for " + num + " = ");
        return n;
    }

    public N getResult() {
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s", getResult());
    }

}

public class DemoGenericTypes {

    public DemoGenericTypes() {
        System.out.println(new MySqr<>(3).getResult());
        System.out.println(new MySqr<>(3.5).getResult());
        System.out.println(new MySqr<Double>(12.15));
        System.out.println(new MySqr<>(0b11001));
        System.out.println(new MySqr<Integer>(12_22));
    }

}
