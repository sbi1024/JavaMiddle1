package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);

        Period period = Period.between(startDate, endDate);
        int years = period.getYears();
        System.out.println("years = " + years);
        int months = period.getMonths();
        System.out.println("months = " + months);
        int days = period.getDays();
        System.out.println("days = " + days);

        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("daysBetween = " + daysBetween);

    }
}
