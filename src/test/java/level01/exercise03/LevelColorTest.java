package level01.exercise03;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class LevelColorTest {
    @Test
    void colorMustMatch(){
        Task task01 = new Task(Level.LOW);
        assertThat(task01.getLevel().getColor().equals("Green"));

        Task task02 = new Task(Level.MEDIUM);
        assertThat(task02.getLevel().getColor().equals("Yellow"));

        Task task03 = new Task(Level.HIGH);
        assertThat(task03.getLevel().getColor().equals("Red"));
    }
}
