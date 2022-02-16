package tsn_java_basics.types;

import java.math.*;

public class DemoBigDecimal {

    public static void main(String[] args) {
        BigDecimal x = new BigDecimal("-12345.67890123456789");
        BigDecimal y = new BigDecimal("345.7896e-4");
        BigDecimal z = new BigDecimal(new BigInteger("123456789"), 8);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("|x| = " + x.abs());
        System.out.println("x + у = " + x.add(y));
        System.out.println("x / у = " + x.divide(y, BigDecimal.ROUND_DOWN)); // округление к нулю, к меньшему по модулю целому значению
        System.out.println("х / у = " + x.divide(y, 6, BigDecimal.ROUND_HALF_EVEN)); // округление к ближайшему целому, среднее значение округляется к четному числу
        System.out.println("max(x, y) = " + x.max(y));
        System.out.println("min(x, y) = " + x.min(y));
        System.out.println("x « 3 = " + x.movePointLeft(3)); // сдвиг влево на n разрядов
        System.out.println("x » 3 = " + x.movePointRight(3)); // сдвиг вправо на n разрядов
        System.out.println("x * у = " + x.multiply(y));
        System.out.println("-x = " + x.negate()); //  возврзщает объект с обратным знаком
        System.out.println("scale of x = " + x.scale());
        System.out.println("increase scale of x to 20 = " + x.setScale(20)); // устанавливает новый порядок n
        System.out.println("decrease scale of x to 10 = " + x.setScale(10, BigDecimal.ROUND_HALF_UP)); // округление к ближайшему целому, среднее значение округляется к большему целому
        System.out.println("sign(x) = " + x.signum());
        System.out.println("x - у = " + x.subtract(y));
        System.out.println("round x = " + x.toBigInteger());
        System.out.println("mantissa of x = " + x.unscaledValue()); // возвращает мантиссу числа
        System.out.println("mantissa of 0.1 =\n= " + new BigDecimal(0.1).unscaledValue());
    }
}
