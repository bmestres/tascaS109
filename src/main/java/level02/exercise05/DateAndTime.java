package level02.exercise05;

import java.time.LocalDate;

public class DateAndTime {

    public static boolean isPassedDate(LocalDate originDate){
        return originDate.isBefore(LocalDate.now());
    }
}
