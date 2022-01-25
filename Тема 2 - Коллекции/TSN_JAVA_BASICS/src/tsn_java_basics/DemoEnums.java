package tsn_java_basics;

/**
 * ПЕРЕЧИСЛЕНИЯ
 *
 */
public class DemoEnums {

    enum EProgrammingLanguages { // Класс-перечисление
        JAVA, DELPHI, PASCAL; // Список значений
    }

    enum EGender {
        MALE(0, 'M'), FEMALE(1, 'F'); // Класс-перечисление с инициализацией

        private Integer intValue; // Целое значение для значения перечисления
        private char charValue; // Символьное значение для значения перечисления

        EGender(Integer intValue, char charValue) { // Конструктор класса
            this.intValue = intValue;
            this.charValue = charValue;
        }

        public Integer intValue() { // Получение числового значения перечисления
            return intValue;
        }

        public char charValue() { // Получение символьного значения перечисления
            return charValue;
        }

    }

    enum EMusicStyle {
        JAZZ(100), CLASSIC(101), ROCK(102), BLUES(103), UNKNOWN(null); // Класс-перечисление с инициализацией

        private Integer intValue; // Целое значение для значения перечисления

        EMusicStyle(Integer intValue) {  // Конструктор класса
            this.intValue = intValue;
        }

        public Integer intValue() { // Получение числового значения перечисления
            return intValue;
        }

        public static EMusicStyle getByIntValue(int intValue) { // Поиск значения перечисления по коду

            for (EMusicStyle item : values()) {
                if (item.intValue() != null && item.intValue().equals(intValue)) {
                    return item;
                }
            }

            return UNKNOWN;
        }

        public char code() { // Работа со значением перечисления
            switch (this) {
                case JAZZ:
                    return 'J';
                case CLASSIC:
                    return 'C';
                case ROCK:
                    return 'R';
                case BLUES:
                    return 'B';
                default:
                    throw new EnumConstantNotPresentException(this.getDeclaringClass(), this.name());
            }
        }
    ;

    }

	public DemoEnums() {

        EProgrammingLanguages programmingLanguage = EProgrammingLanguages.JAVA;
        System.out.println(programmingLanguage.name());

        EMusicStyle musicStyle = EMusicStyle.JAZZ;
        System.out.println(musicStyle.name());
        System.out.println(musicStyle.intValue);
        System.out.println(musicStyle.code());

        switch (musicStyle) {
            case JAZZ:
                System.out.println("JAZZ");
                break;
            case CLASSIC:
                System.out.println("CLASSIC");
                break;
            case ROCK:
                System.out.println("ROCK");
                break;
            case BLUES:
                System.out.println("BLUES");
                break;
            default:
                System.out.println("???");
                break;
        }

        if (musicStyle != EMusicStyle.ROCK) {
            System.out.println("NO ROCK!");
        }

        System.out.println("valueOf: " + EMusicStyle.valueOf("Blues".toUpperCase()));

        musicStyle = EMusicStyle.BLUES;
        System.out.println("ordinal: " + musicStyle.ordinal());

        EGender person = EGender.MALE;
        System.out.println("int: " + person.intValue());
        System.out.println("char: " + person.charValue());

        // Работа с классом перечисления
        for (EGender item : EGender.values()) {
            System.out.println(item.name());
        }
        System.out.println("values length: " + EGender.values().length);

    }
}
