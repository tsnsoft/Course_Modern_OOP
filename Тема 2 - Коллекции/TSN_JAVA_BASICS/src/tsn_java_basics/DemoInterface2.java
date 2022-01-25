package tsn_java_basics;

interface IBuilder {

    default void build() {
        System.out.println("Строится 1");
    }
}

public class DemoInterface2 {

    public DemoInterface2() {

        IBuilder builder1 = new IBuilder() {
        };

        IBuilder builder2 = new IBuilder() {
            @Override
            public void build() {
                System.out.println("Строится 2");
            }

        };

        builder1.build();
        builder2.build();

    }

}
