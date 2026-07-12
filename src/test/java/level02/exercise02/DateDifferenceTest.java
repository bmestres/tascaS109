package level02.exercise02;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Period;

import static org.assertj.core.api.Assertions.assertThat;

public class DateDifferenceTest {
    @Test
    void periodsMustMatchWithExpected(){
        LocalDate startDate01 = LocalDate.of(2024, 3, 25);
        LocalDate endDate01 = LocalDate.of(2026, 11, 3);

        Period resultDifference01 = DateAndTime.computeDifferenceBetweenDates(startDate01, endDate01);

        assertThat(resultDifference01.getYears()).isEqualTo(2);
        assertThat(resultDifference01.getMonths()).isEqualTo(7);
        assertThat(resultDifference01.getDays()).isEqualTo(9);

        LocalDate startDate02 = LocalDate.of(1999, 12, 10);
        LocalDate endDate02 = LocalDate.of(2021, 8, 14);

        Period resultDifference02 = DateAndTime.computeDifferenceBetweenDates(startDate02, endDate02);

        assertThat(resultDifference02.getYears()).isEqualTo(21);
        assertThat(resultDifference02.getMonths()).isEqualTo(8);
        assertThat(resultDifference02.getDays()).isEqualTo(4);
    }
}
