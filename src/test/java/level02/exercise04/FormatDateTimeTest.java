package level02.exercise04;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

public class FormatDateTimeTest {

    @Test
    void formattedDateTimesMustMatch(){

        LocalDateTime unformattedDateAndTime = LocalDateTime.of(2026, 07, 12, 13, 24, 18);

        assertThat(FormatDateTime.formatDateAndTime(unformattedDateAndTime, 1)).isEqualTo("12/07/2026 at 01:24 PM");
        assertThat(FormatDateTime.formatDateAndTime(unformattedDateAndTime, 2)).isEqualTo("12 jul 2026, 13:24:18");
        assertThat(FormatDateTime.formatDateAndTime(unformattedDateAndTime, 3)).isEqualTo("domingo, 12 de jul de 2026, a las 13:24:18");
    }
}
