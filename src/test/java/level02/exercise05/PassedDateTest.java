package level02.exercise05;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class PassedDateTest {
    @Test
    void passedDateMustReturnTrue(){
        LocalDate passedDate01 = LocalDate.of(1919, 10, 5);
        LocalDate passedDate02 = LocalDate.of(2025, 02, 22);
        LocalDate passedDate03 = LocalDate.of(2026, 06, 11);

        assertThat(DateAndTime.isPassedDate(passedDate01)).isEqualTo(true);
        assertThat(DateAndTime.isPassedDate(passedDate02)).isEqualTo(true);
        assertThat(DateAndTime.isPassedDate(passedDate03)).isEqualTo(true);
    }
}
