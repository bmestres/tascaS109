package level01.exercise01;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class TypeOfDayTest {
    @Test
    void typeOfDayMustMatch(){

        String testDay1 = Calendar.determineWeekendOrWeekDay(Day.MONDAY);
        assertThat(testDay1).isEqualTo("Weekday");
        String testDay2 = Calendar.determineWeekendOrWeekDay(Day.WEDNESDAY);
        assertThat(testDay2).isEqualTo("Weekday");
        String testDay3 = Calendar.determineWeekendOrWeekDay(Day.FRIDAY);
        assertThat(testDay3).isEqualTo("Weekday");
        String testDay4 = Calendar.determineWeekendOrWeekDay(Day.SATURDAY);
        assertThat(testDay4).isEqualTo("Weekend");
        String testDay5 = Calendar.determineWeekendOrWeekDay(Day.SUNDAY);
        assertThat(testDay5).isEqualTo("Weekend");
    }
}
