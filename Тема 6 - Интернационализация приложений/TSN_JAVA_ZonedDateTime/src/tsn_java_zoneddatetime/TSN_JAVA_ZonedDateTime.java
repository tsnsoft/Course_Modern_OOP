package tsn_java_zoneddatetime;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class TSN_JAVA_ZonedDateTime {

    public static void main(String[] args) {
        // https://en.m.wikipedia.org/wiki/List_of_tz_database_time_zones#

        System.out.println("Время в компьютере:");
        System.out.println(new SimpleDateFormat("dd.MM.YYYY, HH:mm").format(new Date()));
        System.out.println();

        // Текущая дата и время для временной зоны UTC
        Instant nowUtc = Instant.now();

        // Создадим нужные нам временные зоны ZoneId
        ZoneId utc = ZoneId.of("UTC");
        ZoneId europeMoscow = ZoneId.of("Europe/Moscow");
        ZoneId asiaAlmaty = ZoneId.of("Asia/Almaty");
        ZoneId asiaAlmaty2 = ZoneId.of("UTC+6");
        ZoneId europeBerlin = ZoneId.of("Europe/Berlin");

        System.out.println("Сколько сейчас времени и какая дата в разных местах:");
        System.out.println(formatZDT(nowUtc, utc, true));
        System.out.println(formatZDT(nowUtc, europeMoscow, true));
        System.out.println(formatZDT(nowUtc, asiaAlmaty, true));
        System.out.println(formatZDT(nowUtc, asiaAlmaty2, true));
        System.out.println(formatZDT(nowUtc, europeBerlin, true));
        System.out.println();

        System.out.println("Когда и восколько меня всем поздравить на ДР по их местному времни:");
        Instant zdt_tsn = ZonedDateTime.of(2022, 6, 1, 0, 0, 0, 0,
                ZoneId.of("Asia/Almaty")).toInstant();
        System.out.println("Дельфины: " + formatZDT(zdt_tsn, utc, false));
        System.out.println("Брат: " + formatZDT(zdt_tsn, europeMoscow, false));
        System.out.println("Свои: " + formatZDT(zdt_tsn, asiaAlmaty, false));
        System.out.println("Сестра: " + formatZDT(zdt_tsn, europeBerlin, false));
    }

    // Метод получения текстового представления ДатыВремя для нужной временной зоны
    static String formatZDT(Instant i, ZoneId z, boolean fullInfo) {
        DateTimeFormatter f;
        if (!fullInfo) {
            f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        } else {
            f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
        }
        return ZonedDateTime.ofInstant(i, z).format(f);
    }

}
