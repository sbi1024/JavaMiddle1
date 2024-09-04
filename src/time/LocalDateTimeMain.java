package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        System.out.println("now = " + nowDt);

        LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);
        System.out.println("ofDt = " + ofDt);

        LocalDate localDate = ofDt.toLocalDate();
        System.out.println("localDate = " + localDate);

        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localTime = " + localTime);

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("ofDtPlus = " + ofDtPlus);

        LocalDateTime ofDtPlus1Year = ofDt.plusYears(1);
        System.out.println("ofDtPlus1Year = " + ofDtPlus1Year);

        System.out.println("nowDt.isBefore(ofDt) = " + nowDt.isBefore(ofDt));
        System.out.println("nowDt.isAfter(ofDt) = " + nowDt.isAfter(ofDt));
        System.out.println("nowDt.isEqual(ofDt) = " + nowDt.isEqual(ofDt));
    }
}
