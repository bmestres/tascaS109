package level02.exercise03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Main {

    public static void main(String[] args) {

        LocalDateTime currentDateAndTime = LocalDateTime.now();

        LocalDateTime tomorrow = DateAndTime.modifyDateTime(currentDateAndTime, 1, 1);
        LocalDateTime threeMonthsAgo = DateAndTime.modifyDateTime(currentDateAndTime, 2, -3);
        LocalDateTime fortyYearsAgo = DateAndTime. modifyDateTime(currentDateAndTime, 3, -40);

        System.out.format("Today: %1$td-%1$tm-%1$tY at %tT\n", currentDateAndTime);
        System.out.format("One day from now: %1$td-%1$tm-%1$tY at %tT\n", tomorrow);
        System.out.format("Three months ago: %1$td-%1$tm-%1$tY at %tT\n", threeMonthsAgo);
        System.out.format("Forty years ago: %1$td-%1$tm-%1$tY at %tT\n", fortyYearsAgo);


    }
}
