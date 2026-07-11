package level01.exercise04;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class convertStringToEnumTest {

    @Test
    void correctStringMustMapToEnum(){
        Level level01 = StringToEnum.convertStringToEnum("LOW");
        Task task01 = new Task(level01);

        assertThat(task01.getLevel()).isEqualTo(Level.LOW);
        assertThat(task01.getLevel().getColor()).isEqualTo("Green");

        Level level02 = StringToEnum.convertStringToEnum("MEDIUM");
        Task task02 = new Task(level02);

        assertThat(task02.getLevel()).isEqualTo(Level.MEDIUM);
        assertThat(task02.getLevel().getColor()).isEqualTo("Yellow");

        Level level03 = StringToEnum.convertStringToEnum("HIGH");
        Task task03 = new Task(level03);

        assertThat(task03.getLevel()).isEqualTo(Level.HIGH);
        assertThat(task03.getLevel().getColor()).isEqualTo("Red");
    }

    @Test
    void incorrectStringMustReturnNull(){
            Level wrongLevel = StringToEnum.convertStringToEnum("Low");
            assertThat(wrongLevel).isEqualTo(null);
    }
}
