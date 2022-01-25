package tsn_java_basics;

/**
 * ОБОБЩЕННЫЕ ТИПЫ ДАННЫХ
 *
 */
public class DemoGenericTypes {

    class MySqr<N extends Number> {

        MySqr(N t) {
            perform(t, "sqr");
        }

        private N result;

        private <S> N perform(N num, S str) {
            @SuppressWarnings("unchecked")
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

    public DemoGenericTypes() {
        System.out.println(new MySqr<Integer>(3).getResult());
        System.out.println(new MySqr<Double>(3.5).getResult());
        System.out.println(new MySqr<Double>(12.15));
        System.out.println(new MySqr<Integer>(0b11001));
        System.out.println(new MySqr<Integer>(12_22));
    }

}
