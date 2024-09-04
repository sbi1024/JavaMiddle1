package time.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {
    public static void main(String[] args) {
        ZonedDateTime seoulTime = ZonedDateTime.of(
                LocalDate.of(20204, 1, 1),
                LocalTime.of(9, 0),
                ZoneId.of("Asia/Seoul"));
        System.out.println("seoulTime = " + seoulTime);

        ZonedDateTime londonTime = seoulTime.withZoneSameInstant(ZoneId.of("Europe/London"));
        System.out.println("londonTime = " + londonTime);

        ZonedDateTime nyTime = seoulTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("nyTime = " + nyTime);
    }
}
