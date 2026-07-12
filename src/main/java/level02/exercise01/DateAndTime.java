package level02.exercise01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

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
}
