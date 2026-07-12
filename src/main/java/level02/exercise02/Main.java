package level02.exercise02;

import java.time.LocalDate;
import java.time.Period;

public class Main {

    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2024, 3, 25);
        LocalDate endDate = LocalDate.of(2026, 11, 3);

        Period difference = DateAndTime.computeDifferenceBetweenDates(startDate, endDate);

        System.out .format("The dates differ in %d years, %d months and %d days",
                difference.getYears(), difference.getMonths(), difference.getDays());
    }
}
