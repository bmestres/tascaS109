package level02.exercise03;

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
    public static LocalDateTime modifyDateTime(LocalDateTime originalDateAndTime, int selection, int difference){

        Time unitOfTime = Time.values()[selection - 1];
        LocalDateTime resultingDateTime = null;

        switch (unitOfTime){
            case DAYS: {
                resultingDateTime = originalDateAndTime.plusDays(difference);
                break;
            }
            case MONTHS: {
                resultingDateTime= originalDateAndTime.plusMonths(difference);
                break;
            }
            case YEARS: {
                resultingDateTime = originalDateAndTime.plusYears(difference);
            }
        }
        return resultingDateTime;
    }

}
