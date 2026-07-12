package level02.exercise02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DateAndTime {

    public static LocalDate getCurrentLocalDate(){
        return LocalDate.now();
    }
    public static LocalTime getCurrentLocalTime(){
        return LocalTime.now();
    }
    public static LocalDateTime getCurrentLocalDateTime(){
        return LocalDateTime.now();
    }
    public static Period computeDifferenceBetweenDates(LocalDate startDate, LocalDate endDate) {
        Period period = Period.between(startDate, endDate);
        if (period.isNegative()) {
            return Period.between(endDate, startDate);
        } else {
            return period;
        }
    }
}
