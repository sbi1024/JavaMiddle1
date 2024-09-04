package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = " + duration);

        LocalTime lt = LocalTime.of(1, 0);
        System.out.println("lt = " + lt);

        LocalTime plusTime = lt.plus(duration);
        System.out.println("plusTime = " + plusTime);

        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(10, 0);
        Duration between = Duration.between(start, end);
        System.out.println("between = " + between);

        long seconds = between.getSeconds();
        System.out.println("seconds = " + seconds);

        long hours = between.toHours();
        System.out.println("hours = " + hours);

        long minutes = between.toMinutes();
        System.out.println("minutes = " + minutes);
    }
}
