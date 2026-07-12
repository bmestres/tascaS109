package level02.exercise03;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

public class ModifyDateTimeTest {
    @Test
    void datesAndTimesMuchMatchWithExpected(){

        LocalDateTime testDateAndTime = LocalDateTime.of(2026,7,12, 12, 12,25);

        LocalDateTime tomorrow = DateAndTime.modifyDateTime(testDateAndTime, 1, 1);
        LocalDateTime threeMonthsAgo = DateAndTime.modifyDateTime(testDateAndTime, 2, -3);
        LocalDateTime fortyYearsAgo = DateAndTime. modifyDateTime(testDateAndTime, 3, -40);

        assertThat(tomorrow).isEqualTo(LocalDateTime.of(2026, 7, 13, 12, 12, 25));
        assertThat(threeMonthsAgo).isEqualTo(LocalDateTime.of(2026, 4, 12, 12, 12, 25));
        assertThat(fortyYearsAgo).isEqualTo(LocalDateTime.of(1986, 7, 12, 12, 12, 25));


    }
}
